echo "Enter  number:  "
read num
i=0
counter=0
echo "The first $num odd numbers are: "
while [ counter -lt num ]
do
	if [ `expr $((i%2))` != 0 ]
	then
		echo $i
		counter=$((counter+1))
	fi
	i=$((i+1))
done
