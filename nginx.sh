#!/bin/bash
nginx -v  > /dev/null
if [ $? -eq 0 ]; then
   echo nginx is already install
elif 
    Y=$(egrep '^(NAME)=' '/etc/os-release')
then   echo $Y
if [[ $Y == 'NAME="Ubuntu"' ]]
   then
    sudo apt update
    sudo apt install nginx -y 
 elif [[ $Y == 'NAME="Red Hat Enterprise Linux"' ]]
    then
   sudo yum install epel-release -y 
   sudo yum update
   sudo yum install nginx -y

     else
         echo "check os"
 fi

 fi
