echo "Prinitng Automorphic numbers from 1 to 1000"
num=1
while [ $num -lt 1000 ]
do
	i=$num
	square=$((i*i))
	flag=1
	while [ $i -gt 0 ]
	do
		if [ `expr $i \% 10` != `expr $square \% 10` ]
		then
			flag=0
		fi
			i=$((i/10))
			square=$((square/10))
	done

	if [ $flag -eq 1 ]
	then
		echo $num
		echo
	fi

	num=`expr $num + 1` # or  num=$((num+1))
done