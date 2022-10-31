import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person
{
    int[] testScores;

    Student(String fn,String ln,int i,int n[])
    {
        super(fn,ln,i);
       this.testScores=n;
    }

    public String calculate()
    {
        int s=0;
        for(int i=0;i<testScores.length;i++)
        {
            s=s+testScores[i];
        }
        double a=(double)s/testScores.length;
        if(a<=100&&a>=90) 
        return "O";
        else if(a<90&&a>=80) 
        return "E";
        else if(a<80&&a>=70) 
        return "A";
        else if(a<70&&a>=55) 
        return "P";
        else if(a<55&&a>=40) 
        return "D";
        else 
        return "T";
    }
}
class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
	}
}
