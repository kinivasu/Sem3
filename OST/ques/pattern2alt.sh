#      *
#     **
#    ***
#   ****
#  *****
# ******

N=6

for((i=1;i<=N;i++))
do
	for((j=i;j<N;j++))
	do
		echo -ne " "
	done
	for((k=1;k<=i;k++))
	do
		echo -ne "*"
	done
	
	echo 
done