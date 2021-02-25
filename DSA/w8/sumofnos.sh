echo -n "How many numbers do you want to enter?  "
read total

echo "Enter $total numbers"
counter=0
sum=0
while [ `expr $counter` -lt $total ]
do
	read num
	sum=$((sum+num))
	counter=$((counter+1))
done

echo "The sum is $sum"