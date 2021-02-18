echo -n "Enter a number:  "
read input
reverse=""
 
len=${#input}
for (( i=$len-1; i>=0; i-- ))
do 
	reverse="$reverse${input:$i:1}"
done
 
echo "$reverse"

# #!/bin/bash
# x="welcome"
# len=`echo ${#x}`
# while [ $len -ne 0 ]
# do
#         y=$y`echo $x | cut -c $len`
#         ((len--))
# done
# echo $y

# #!/bin/bash
# #set -xv

# string="$1"
# reverse_string=""
# string_length="${#string}"

# while (( "$string_length">=1 )) 
# do
#      string_length=$(( $string_length - 1 ))
#      reverse_string="$reverse_string${string:$string_length:1}"
# done

# echo "$reverse_string"