import java.util.*;

class Student
{
	GregorianCalendar g = new GregorianCalendar();
	private int regno;

	public String name;
	private	String doj;
	private int date;
	private int mon;
	private int year;
	public short semester;
	private double gpa;
	public double cgpa;
	static int stuno=1;
	String month[] = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }; 

	Student()
	{
		this.regno=071;
		this.name="Null";
		this.doj="";
		this.semester=1;
		this.gpa=0.0;
		this.cgpa=0.0;
		Student.check(1);
	}

	public static void check(int val)
	{
		stuno+=val;
	}

	Student(String name,short semester,double gpa,double cgpa,int temp)
	{
		this.name = name;
		this.mon = g.get(Calendar.MONTH);
		this.date = g.get(Calendar.DATE);
		this.year = g.get(Calendar.YEAR);
		this.doj = month[this.mon]+" "+this.date+", "+this.year;
		this.semester = semester;
		this.gpa = gpa;
		this.cgpa = cgpa;
		Regno();
		if(temp ==0)
		{
			Student.check(-1);
		}
		else
		{
			Student.check(1);
		}
	}

	public void Regno()
	{
		this.regno = (this.year%100)*100+(Student.stuno);
	}

	public String toString()
	{
		return ("\n\t\tName:"+this.name+"\n\t\tReg No:"+this.regno+"\n\t\tDate of Joining:"+this.doj+"\n\t\tSemester:"+this.semester+"\n\t\tGPA:"+this.gpa+"\n\t\tCGPA:"+this.cgpa);
	}
}

public class cal 
{ 
	public static void sortsem(Student list[])
	{
		int length = list.length;
		for (int iteration = 1; iteration < length; iteration++)
    	{
        	for (int index = 0; index < length - iteration; index++)
            	if (list[index].semester > list[index + 1].semester)
            	{
	                Student temp = list[index];
	                list[index] = list[index + 1];
	                list[index + 1] = temp;
	            }
    	}

	}

	public static void sortname(Student list[])
	{
		int length = list.length;
		for (int iteration = 1; iteration < length; iteration++)
    	{
        	for (int index = 0; index < length - iteration; index++)
            	if (list[index].name.compareTo(list[index + 1].name) > 0)
            	{
	                Student temp = list[index];
	                list[index] = list[index + 1];
	                list[index + 1] = temp;
	            }
    	}
	}

	public static void sortcgpa(Student list[])
	{
		int length = list.length;
		for (int iteration = 1; iteration < length; iteration++)
    	{
        	for (int index = 0; index < length - iteration; index++)
            	if (list[index].cgpa > list[index + 1].cgpa)
            	{
	                Student temp = list[index];
	                list[index] = list[index + 1];
	                list[index + 1] = temp;
	            }
    	}
	}

	public static Student input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Name:");
		String name = sc.nextLine();
		System.out.print("Semester:");
		short semester = sc.nextShort();
		System.out.print("GPA:");
		double gpa = sc.nextDouble();
		System.out.print("CGPA:");
		double cgpa = sc.nextDouble();
		Student ob = new Student(name,semester,gpa,cgpa,1);
		return ob;
	}

	public static void dispchar(Student st[],char ch,int n)
	{
		int k=1;
		for(int i=0;i < n;i++)
		{
			if(st[i].name.charAt(0) == ch)
			{
				System.out.println("\n\nStudent "+ k++ +":\n"+st[i]);
			}
		}
	}

	public static void substrsearch(Student st[],String subst,int n)
	{
		int k=1;
		for(int i=0;i < n;i++)
		{
			if(st[i].name.contains(subst)==true)
			{
				System.out.println("\n\nStudent "+ k++ +":\n"+st[i]);
			}
		}

	}

	public static void shortenName (Student st[]) 
	{
		System.out.println("Refreshed Record:\n\n");
        for (Student stud: st) 
        {
            String newName = "";
            String del = " ";
            int val = stud.name.indexOf(del);
    		int prev = 0;
            while (true == true) 
            {
                if(val!= -1)
                {
                	newName += stud.name.charAt(prev) + ". ";
                }
                else
                {
                	break;
                }
                prev = val + 1;
                val = stud.name.indexOf(del,val+1);
            }
            newName += stud.name.substring(prev);
            stud.name = newName;
            System.out.println(stud);
        }
    }

	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		Student st[] = new Student[n];
		for(int i=0;i<n;i++)
		{
			st[i] = input();
		}

		for(int i=0;i<n;i++)
		{
			System.out.println("\n\nStudent "+(i+1)+":\n"+st[i]);
		}

		System.out.println("\n\nName Sorted:");
		sortname(st);
		for(int i=0;i<n;i++)
		{
			System.out.println("\n\nStudent "+(i+1)+":\n"+st[i]);
		}

		System.out.println("\n\nSemester Sorted:");
		sortsem(st);
		for(int i=0;i<n;i++)
		{
			System.out.println("\n\nStudent "+(i+1)+":\n"+st[i]);
		}

		System.out.println("\n\ncgpa Sorted:");
		sortcgpa(st);
		for(int i=0;i<n;i++)
		{
			System.out.println("\n\nStudent "+(i+1)+":\n"+st[i]);
		}

		dispchar(st,'k',n);

		substrsearch(st,"ran",n);

		shortenName(st);

			
	} 
}
