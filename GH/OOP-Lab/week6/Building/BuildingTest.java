//
// BuildingTest.java
//
//
//

import com.course.structure.Building;
import com.course.structure.House;
import com.course.structure.School;

import java.util.*;

public class BuildingTest 
{

	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		
		Building buildob = new Building();
		House house = new House();
		School school = new School();

		System.out.print("Enter square footage of building: ");
		buildob.setFeet(sc.nextFloat());

		System.out.print("Enter stories in building: ");
		buildob.setStories(sc.nextInt());

		System.out.print("Enter number of bed rooms: ");
		house.setBed(sc.nextInt());

		System.out.print("Enter number of bath rooms: ");
		house.setBath(sc.nextInt());

		System.out.print("Enter number of classrooms: ");
		school.setClass(sc.nextInt());

		System.out.print("Enter level of grade :");
		sc.nextLine();
		school.setGrade(sc.nextLine());
		
		System.out.println(buildob);
		System.out.println(house);
		System.out.println(school);
	}

}

