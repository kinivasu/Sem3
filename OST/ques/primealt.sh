#storing the number to be checked 
echo -n "Enter a number: "
read number
i=2 

#flag variable 
f=0 

#running a loop from 2 to number/2 
while [ $i -le $((number/2)) ]
do
#checking if i is factor of number 
if [ $((number%i)) -eq 0 ]
then
	f=1 
fi

#increment the loop variable 
i=$((i+1)) 
done
if [ $f -eq 1 ]
then
	echo "Not Prime"
else
	echo "Prime"
fi
