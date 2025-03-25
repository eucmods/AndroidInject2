print "==============================
Credit   : CMODs
Telegram : @CoRingaModzYT
==============================

";
echo "Please wait..."
sleep 3
iptables -I INPUT -s voice.gcloudcs.com -j DROP &>/dev/null
iptables -I INPUT -s vmp.qq.com -j DROP &>/dev/null
iptables -I INPUT -s sg.tdm.qq.com -j DROP &>/dev/null
iptables -I INPUT -s intldlgs.qq.com -j DROP &>/dev/null
iptables -I INPUT -s cdn.wetest.qq.com -j DROP &>/dev/null
iptables -I INPUT -s android.bugly.qq.com -j DROP &>/dev/null
iptables -I INPUT -s receiver.sg.tdm.qq.com -j DROP &>/dev/null
iptables -I INPUT -s hkconfig.gcloud.qq.com -j DROP &>/dev/null
iptables -I INPUT -s idcconfig.gcloud.qq.com -j DROP &>/dev/null
iptables -I INPUT -s napubgm.broker.tplay.qq.com -j DROP &>/dev/null
iptables -I INPUT -s csoversea.mbgame.gamesafe.qq.com -j DROP &>/dev/null
iptables -I INPUT -s data.logentries.com -j DROP &>/dev/null
iptables -I INPUT -s blackbox.ac -j DROP &>/dev/null
sleep 2
PACKAGE='com.dts.freefireth'
while [ $(pidof $PACKAGE) ]
do
echo "AntiCheat BlackBox...."
date
printf "";
((COUNT=$COUNT+10))
if [ ! $(pidof $PACKAGE) ]; then
break
fi
sleep 5
done
sleep 2
su -c iptables --flush
sleep 2
echo " "
echo " "
echo " "
echo " "
echo "Execution Completed"
