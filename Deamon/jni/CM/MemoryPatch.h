#ifndef MEMORYPATCH_H
#define MEMORYPATCH_H
/*
Autho : CMODs
: telegram / @eucmods
:data : 2024
*/
#include "CM/Log.h"
#include <dirent.h>
#include <fcntl.h>
#include <cstdio>
#include <cstring>
#include <cstdlib>
#include <unistd.h>
#include <sys/uio.h>
#include <sys/syscall.h>

typedef unsigned int RADDR;
typedef int DWORD;
typedef float FLOAT;

enum type {
    TYPE_DWORD,
    TYPE_FLOAT
};

class MemoryPatch {
public:
    struct Data{
        const char *processName = nullptr;
        int gamePid = 0;
        unsigned int libBase = 0;
		unsigned int libBaseunity = 0;
		unsigned int libBaseAnogs = 0;
		unsigned int libBaseil2cpp = 0;
        int gameHandle = 0;
    } Data;
    bool InitMemory();
    pid_t find_pid(const char *game_package);
    RADDR getModuleBase(const char *module_name);
    RADDR getRealOffset(RADDR offset);
	RADDR getRealOffsetU(RADDR offset);
	RADDR getRealOffsetB(RADDR offset);
	RADDR getRealOffsetil2cpp(RADDR offset);
    void WriteFloat(RADDR address, FLOAT value);
    void WriteDword(RADDR address, DWORD value);
    void Write(RADDR address, const char *value, type TYPE);
};


#endif


