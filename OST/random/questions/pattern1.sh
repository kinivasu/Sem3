       #
      ###
     #####
    #######
   #########
  ###########
 #############


p=7;

for((m=1; m<=p; m++))
do
	# This loop print spaces
	# required
	for((a=m; a<=p; a++))
	do
	echo -n " ";
	done
	
	# This loop print the left
	# side of the pyramid
	for((n=1; n<=m; n++))
	do
	echo -n "#";
	done

	# This loop print right 
	# side of the pryamid.
	for((i=1; i<m; i++))
	do
	echo -n "#";
	done

	# New line
	echo;
done


