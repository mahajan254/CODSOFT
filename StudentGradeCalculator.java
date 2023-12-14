package Task2;
import java.util.Scanner;
public class StudentGradeCalculator 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	    int totalmarks=0;
	    int marks=0;
	    int sub=0;
	    double avgpercentage=0;
	    char grade;
	    System.out.println("Enter the no of subjects: ");
	     sub = sc.nextInt();
	    
	    for(int i=0;i<=sub;i++)
	    {
	    	System.out.println("Enter the marks of dobtained in subjects");
	    	marks=sc.nextInt();
	    	totalmarks += marks;
	    }
	    avgpercentage = totalmarks / sub;
	     
	    if(avgpercentage >= 90) 
	    {
	    	grade ='A';
	    }
	    else  if(avgpercentage >= 80)
	    {
	    	grade ='B';
	    }else  if(avgpercentage >= 70) 
	    {
	    	grade ='C';
	    }else  if(avgpercentage >= 60) 
	    {
	    	grade = 'D';
	    }else
	    {
	    	grade = 'F';
	    }
	    
	    System.out.println("Total Marks:"+totalmarks);
	    System.out.println("Average Percentage:"+avgpercentage);
	    System.out.println("Grade:"+grade);
	    
	}
    
    
}
