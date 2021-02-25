echo "Menu Program"
stop=0

while [ $stop -eq 0 ]
do
cat << ENDOFMENU
1: PRINT DATE
2,3: PRINT CURRENT WORKING DIRECTORY
4: EXIT
ENDOFMENU
	echo
	echo -n "Enter Choice: "
	read reply
	case $reply in
		"1")
		echo -n "Date is :  "
		date
		echo
		;;
		"2"|"3")
		pwd
		echo
		;;
		"4")
		stop=1
		;;
		*)
		echo "Illegal Choice, Try Again.."
		echo
		;;
	esac
done