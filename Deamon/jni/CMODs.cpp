#include "CMODs.h"
#include "CM/Offsets.h"

struct Feature {

    int WALLSTONE = 1;
    int NIGHTMODO = 2;
    int HEAD = 3;
    int WALLKILL = 4;
	int BALAMAGICA = 5;
	int NECK = 6;
	int GHOSTHACK = 7;
    int SAFE = 007;
    
} Feature;

int main(int argc, char *argv[]){
    if (argv[1] != NULL && argv[2] != NULL){
        int Menu = atoi(argv[1]);
        int NoKey = atoi(argv[2]);
        if (Menu > 0 && Menu < 8){
        if (Mem.InitMemory()){
          if (Menu == Feature.WALLSTONE){
                    switch (NoKey) {//Wall Pedra v1.92 pegando
                        case 0:
                          Mem.Write(Mem.getRealOffsetU(0xb63128), ("-8388395.5"), TYPE_FLOAT);
                            Mem.Write(Mem.getRealOffsetU(0xb63138), ("-8388395.5"), TYPE_FLOAT);
                            break;
                        case 1:
                            Mem.Write(Mem.getRealOffsetU(0xb63128), ("0.0"), TYPE_FLOAT);
                            Mem.Write(Mem.getRealOffsetU(0xb63138), ("0.0"), TYPE_FLOAT);
                            break;
                        }
                 }
                 if (Menu == Feature.NIGHTMODO){//v1.92 Modo Noite pegando
                    switch (NoKey) {
                        case 0:
                            Mem.Write(Mem.getRealOffsetU(0x2ff8ac), "1.0e-6", TYPE_FLOAT);
                            break;
                        case 1:
                            Mem.Write(Mem.getRealOffsetU(0x2ff8ac), "-1", TYPE_FLOAT);
                            break;
                     }
                }
                if (Menu == Feature.HEAD){//v1.92 Aim Head Risk Ban pegando
                    switch (NoKey) {
                        case 0://OFF
                            Mem.Write(Mem.getRealOffset(0x5eb40), "1.9047341972114e+31", TYPE_FLOAT);
                            break;
                        case 1://ON
                            Mem.Write(Mem.getRealOffset(0x5eb40), "1684104520", TYPE_DWORD);
                            break;
                     }
               }
               if (Menu == Feature.NECK){//v1.92 PESCOÇO TESTE Risk Ban pegando
                    switch (NoKey) {
                        case 0://OFF
                            Mem.Write(Mem.getRealOffset(0x5eb40), "1.9047341972114e+31", TYPE_FLOAT);
                            break;
                        case 1://ON
                            Mem.Write(Mem.getRealOffset(0x5eb40), "2.7490455891333e+26", TYPE_FLOAT);
                            break;
                     }
               }
              if (Menu == Feature.WALLKILL){//V1.92 Pegando
                    switch (NoKey) {
                        case 0://OFF
                            Mem.Write(Mem.getRealOffsetU(0x6078f8), "9.9999997473788e-06", TYPE_FLOAT);
                            break;
                        case 1://ON
                            Mem.Write(Mem.getRealOffsetU(0x6078f8), "1.0", TYPE_FLOAT);
                            break;
						}
                }
				if (Menu == Feature.BALAMAGICA){//v1.92
                    switch (NoKey) {
                        case 0://OFF
                            Mem.Write(Mem.getRealOffsetU(0x61CAF0), "925353388", TYPE_DWORD);
                            break;
                        case 1://ON
                            Mem.Write(Mem.getRealOffsetU(0x61CAF0), "1065353216", TYPE_DWORD);
                            break;
                     }
				}
				if (Menu == Feature.GHOSTHACK){//v1.92 TESTE GHOST
                    switch (NoKey) {
                        case 0:
                            Mem.Write(Mem.getRealOffsetil2cpp(0x197B10C), "-1.3095103810253e+25", TYPE_FLOAT);
                            break;
                        case 1:
                            Mem.Write(Mem.getRealOffsetil2cpp(0x197B10C), "-5.9029581035871e+21", TYPE_FLOAT);
                            break;
                     }
                }
                   if (Menu == Feature.SAFE){//V1.92
                    switch (NoKey) {
                        case 0://OFF
                           /// Mem.Write(getRealOffset(0x197B10C), "-1.3095e25", TYPE_FLOAT);//akill_0
                            break;
                        case 1://ON
                            Mem.Write(Mem.getRealOffsetB(0x358A9F), ("0"), TYPE_FLOAT);/// aKill_0
                            Mem.Write(Mem.getRealOffsetB(0x39C848), ("0"), TYPE_FLOAT);///	"kill_ptr");
                            Mem.Write(Mem.getRealOffsetB(0x318CB8), ("0"), TYPE_FLOAT);///	"j_kill");
                            Mem.Write(Mem.getRealOffsetB(0x30214), ("0"), TYPE_FLOAT);///"kill");
                            Mem.Write(Mem.getRealOffsetB(0x307D8), ("0"), TYPE_FLOAT);////"int ptrace(enum __ptrace_request request, ...);");
                            Mem.Write(Mem.getRealOffsetB(0x35DB03), ("0"), TYPE_FLOAT);///	"aFakegameAntich");
                            Mem.Write(Mem.getRealOffsetB(0x35DC15), ("0"), TYPE_FLOAT);///,	"aTdmDevInfo");
                            Mem.Write(Mem.getRealOffsetB(0x35DC3C), ("0"), TYPE_FLOAT);///,	"aReport");
                            Mem.Write(Mem.getRealOffsetB(0x35DCCB), ("0"), TYPE_FLOAT);///,	"aTdmReport");
                            Mem.Write(Mem.getRealOffsetB(0x35DB40), ("0"), TYPE_FLOAT);///,	"aGcloudConnecto_0");
                            Mem.Write(Mem.getRealOffsetB(0x35DC08), ("0"), TYPE_FLOAT);///,	"aRemoteconfig");
                            Mem.Write(Mem.getRealOffsetB(0x35C1C3), ("0"), TYPE_FLOAT);///,	"aAntistripStrat");
                            Mem.Write(Mem.getRealOffsetB(0x35C174), ("0"), TYPE_FLOAT);///,	"aStrategyRoot");
                            Mem.Write(Mem.getRealOffsetB(0x35C0CD), ("0"), TYPE_FLOAT);///,	"aCrashprotectTi");
                            Mem.Write(Mem.getRealOffsetB(0x35BFAD), ("0"), TYPE_FLOAT);///,	"aComAceGamesafe");
                            Mem.Write(Mem.getRealOffsetB(0x35C4EE), ("0"), TYPE_FLOAT);///,	"aZipBugTheAntic");
                            Mem.Write(Mem.getRealOffsetB(0x35DF03), ("0"), TYPE_FLOAT);///,	"aResMaxReportMi");
                            Mem.Write(Mem.getRealOffsetB(0x35DA33), ("0"), TYPE_FLOAT);///,	"aApplicationTra_0");
                            Mem.Write(Mem.getRealOffsetB(0x388700), ("0"), TYPE_FLOAT);///,	"aServerSIsBlack");
                            Mem.Write(Mem.getRealOffsetB(0x35CD0B), ("0"), TYPE_FLOAT);////,	"aDidnTExpectMor");
                            Mem.Write(Mem.getRealOffsetB(0x351CE), ("0"), TYPE_FLOAT);/// j_AnoSDKGetReportData2_0
                            Mem.Write(Mem.getRealOffsetB(0x3E4C24), ("0"), TYPE_FLOAT);///int chmod(const char *file, __mode_t mode);");
                            Mem.Write(Mem.getRealOffsetB(0x3E4C44), ("0"), TYPE_FLOAT);//int mprotect(void *addr, size_t len, int prot);");
                            Mem.Write(Mem.getRealOffsetB(0x301E4), ("-476053504"), TYPE_DWORD);//int clock_gettime(clockid_t clock_id, struct timespec *tp);");
                            Mem.Write(Mem.getRealOffsetB(0x301B4), ("0"), TYPE_FLOAT);/// int _android_log_print(int prio, const char *tag, const char *fmt, ...);");
                            Mem.Write(Mem.getRealOffsetB(0x3E4D28), ("0"), TYPE_FLOAT);/// "__imp___android_log_print");
                            Mem.Write(Mem.getRealOffsetB(0x3352C), ("0"), TYPE_FLOAT);/// "AnoSDKForExport");
                            Mem.Write(Mem.getRealOffsetB(0x33508), ("0"), TYPE_FLOAT);/// AnoSDKRegistInfoListener");
                            Mem.Write(Mem.getRealOffsetB(0x33504), ("0"), TYPE_FLOAT);/// AnoSDKOnRecvSignature");
                            Mem.Write(Mem.getRealOffsetB(0x334D4), ("0"), TYPE_FLOAT);/// AnoSDKDelReportData");
                            Mem.Write(Mem.getRealOffsetB(0x334F0), ("0"), TYPE_FLOAT);/// AnoSDKIoctl");
                            Mem.Write(Mem.getRealOffsetB(0x33414), ("0"), TYPE_FLOAT);/// AnoSDKSetUserInfo");
                            Mem.Write(Mem.getRealOffsetB(0x33450), ("0"), TYPE_FLOAT);/// AnoSDKSetUserInfoWithLicense
                            Mem.Write(Mem.getRealOffsetB(0x306A0), ("0"), TYPE_FLOAT);/// modf");
                            Mem.Write(Mem.getRealOffsetB(0x35913F), ("0"), TYPE_FLOAT);/// aCheatOpenId");
                            Mem.Write(Mem.getRealOffsetB(0x35878A), ("0"), TYPE_FLOAT);/// aScReport
                            Mem.Write(Mem.getRealOffsetB(0x3590F2), ("0"), TYPE_FLOAT);/// aHistoryopenidS");
                            Mem.Write(Mem.getRealOffsetB(0x35933D), ("0"), TYPE_FLOAT);/// aObjectsExterna");
                            break;
					}
                }
            }
        }
    }
    return 0;
}
