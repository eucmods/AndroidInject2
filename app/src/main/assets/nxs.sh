ip6tables=/system/bin/ip6tables
su -c iptables=/system/bin/su -c iptables

su -c iptables -I INPUT -s 192.168.1.139 -j DROP &>/dev/null
su -c iptables -I INPUT -s 101.32.143.64 -j DROP &>/dev/null
su -c iptables -I INPUT -s 101.32.143.247 -j DROP &>/dev/null
su -c iptables -I INPUT -s 49.51.155.13 -j DROP &>/dev/null
su -c iptables -I INPUT -s 49.51.155.48 -j DROP &>/dev/null
su -c iptables -I INPUT -s 49.51.160.130 -j DROP &>/dev/null
su -c iptables -I INPUT -s 49.51.171.29 -j DROP &>/dev/null
su -c iptables -I INPUT -s 49.51.172.17 -j DROP &>/dev/null
su -c iptables -I INPUT -s 49.51.172.17 -j DROP &>/dev/null
su -c iptables -I INPUT -s 49.51.173.156 -j DROP &>/dev/null
su -c iptables -I INPUT -s 49.51.173.90 -j DROP &>/dev/null
su -c iptables -I INPUT -s 192.168.1.1 -j DROP &>/dev/null
su -c iptables -I INPUT -s 49.51.42.152 -j DROP &>/dev/null
su -c iptables -I INPUT -s 119.28.121.174 -j DROP &>/dev/null
su -c iptables -I INPUT -s 119.28.121.174 -j DROP &>/dev/null
su -c iptables -I INPUT -s 119.28.121.174 -j DROP &>/dev/null
su -c iptables -I INPUT -s 129.226.2.165 -j DROP &>/dev/null
su -c iptables -I INPUT -s 129.226.2.165 -j DROP &>/dev/null
su -c iptables -I OUTPUT -d 49.51.172.17 -j REJECT &>/dev/null
su -c iptables -I OUTPUT -d 49.51.173.156 -j REJECT &>/dev/null
su -c iptables -I OUTPUT -d 49.51.173.90 -j REJECT &>/dev/null
su -c iptables -I OUTPUT -d 192.168.1.1 -j REJECT &>/dev/null
su -c iptables -I OUTPUT -d 49.51.42.152 -j REJECT &>/dev/null
su -c iptables -I OUTPUT -d 119.28.121.174 -j REJECT &>/dev/null
su -c iptables -I OUTPUT -d 119.28.121.174 -j REJECT &>/dev/null
su -c iptables -I OUTPUT -d 119.28.121.174 -j REJECT &>/dev/null
su -c iptables -I OUTPUT -d 129.226.2.165 -j REJECT &>/dev/null
su -c iptables -I OUTPUT -d 129.226.2.165 -j REJECT &>/dev/null
su -c iptables -I OUTPUT -d 129.226.3.134 -j REJECT &>/dev/null
su -c iptables -I OUTPUT -d 13.127.247.216 -j REJECT &>/dev/null
su -c iptables -I OUTPUT -d 13.56.162.236 -j REJECT &>/dev/null
su -c iptables -I OUTPUT -d 150.109.0.38 -j REJECT &>/dev/null
su -c iptables -I OUTPUT -d 150.109.0.38 -j REJECT &>/dev/null
su -c iptables -I OUTPUT -d 150.109.0.38 -j REJECT &>/dev/null
su -c iptables -I OUTPUT -d 150.109.0.45 -j REJECT &>/dev/null
su -c iptables -I OUTPUT -d 150.109.0.45 -j REJECT &>/dev/null
su -c iptables -I OUTPUT -d 150.109.0.45 -j REJECT &>/dev/null
su -c iptables -I OUTPUT -d 150.109.29.150 -j REJECT &>/dev/null
su -c iptables -I OUTPUT -d 150.109.29.150 -j REJECT &>/dev/null
su -c iptables -I OUTPUT -d 150.109.29.150 -j REJECT &>/dev/null
su -c iptables -I OUTPUT -d 49.51.235.24 -j REJECT &>/dev/null
su -c iptables -I OUTPUT -d 52.52.167.221 -j REJECT &>/dev/null
su -c iptables -I OUTPUT -d 52.53.117.29 -j REJECT &>/dev/null
su -c iptables -I OUTPUT -d 52.53.50.155 -j REJECT &>/dev/null
su -c iptables -I OUTPUT -d 52.9.249.157 -j REJECT &>/dev/null
su -c iptables -I OUTPUT -d 54.177.243.193 -j REJECT &>/dev/null
su -c iptables -I OUTPUT -d 54.183.150.176 -j REJECT &>/dev/null
su -c iptables -I INPUT -s 49.51.235.24 -j DROP &>/dev/null
su -c iptables -I OUTPUT -s 49.51.235.24 -j DROP &>/dev/null
su -c iptables -I INPUT -s 49.51.235.24 -j REJECT &>/dev/null
su -c iptables -I OUTPUT -s 49.51.235.24 -j REJECT &>/dev/null
su -c iptables -I INPUT -s 49.51.0.0 -j DROP &>/dev/null
su -c iptables -I OUTPUT -s 49.51.0.0 -j DROP &>/dev/null
su -c iptables -I INPUT -s 49.51.0.0 -j REJECT &>/dev/null
su -c iptables -I OUTPUT -s 49.51.0.0 -j REJECT &>/dev/null
su -c iptables -I INPUT -s 49.51.255.255 -j DROP &>/dev/null
su -c iptables -I OUTPUT -s 49.51.255.255 -j DROP &>/dev/null
su -c iptables -I INPUT -s 49.51.255.255 -j REJECT &>/dev/null
su -c iptables -I OUTPUT -s 49.51.255.255 -j REJECT &>/dev/null
su -c iptables -I OUTPUT -p all -m string --string "down.anticheatexpert.com" --algo bm -j DROP &>/dev/null
su -c iptables -I INPUT -p all -m string --string "down.anticheatexpert.com" --algo kmp -j DROP &>/dev/null
su -c iptables -I OUTPUT -p all -m string --string "dlied1.qq.com" --algo bm -j DROP &>/dev/null
su -c iptables -I INPUT -p all -m string --string "dlied1.qq.com" --algo kmp -j DROP &>/dev/null
su -c iptables -I OUTPUT -p all -m string --string "asia.csoversea.mbgame.anticheatexpert.com" --algo bm -j DROP &>/dev/null
su -c iptables -I INPUT -p all -m string --string "asia.csoversea.mbgame.anticheatexpert.com" --algo kmp -j DROP &>/dev/null
su -c iptables -I OUTPUT -p all -m string --string "cs.mbgame.gamesafe.qq.com" --algo bm -j DROP &>/dev/null
su -c iptables -I INPUT -p all -m string --string "cs.mbgame.gamesafe.qq.com" --algo kmp -j DROP &>/dev/null
su -c iptables -I OUTPUT -p all -m string --string "https://blackbox.ac/" --algo bm -j DROP &>/dev/null
su -c iptables -I INPUT -p all -m string --string "blackbox.ac" --algo kmp -j DROP &>/dev/null
su -c iptables -I INPUT -p all -m string --string "hxxp://direct.blackbox.ac/update" --algo kmp -j DROP &>/dev/null
su -c iptables -I INPUT -p all -m string --string "https://nyc3.digitaloceanspaces.com/bb-sto/downloads/blackbox.exe" --algo kmp -j DROP &>/dev/null
su -c iptables -I INPUT -p all -m string --string "http://data.logentries.com" --algo kmp -j DROP &>/dev/null