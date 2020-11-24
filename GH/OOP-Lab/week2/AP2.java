import java.util.*;

class AP2
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter dimensions of the square matrix A  :" );
    	int m=sc.nextInt();

		int[][] a= new int[m][m];
    	for (int i = 0; i < m ; i++) 
        {
            for (int j = 0; j < m ; j++) 
            {
                System.out.print("Enter a[" + i + "][" + j + "] : ");
                a[i][j] = sc.nextInt();
            }
        }
        int tracesum=0;
        int norm=0;
    	for (int i = 0; i < m ; i++) 
        {
            for (int j = 0; j < m ; j++) 
            {
                norm+=(a[i][j]*a[i][j]);
                if(i==j)
                {
                	tracesum+=a[i][j];
                }
            }
        }
        System.out.println("\n\n\t\tNorm:"+norm+"\tTrace:"+tracesum);
	}
}
