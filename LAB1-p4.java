import java.util.*;

public class Main
{
	String USN;
	String NAME;
	String BRANCH;
	String SEM;

	Main(String usn, String name, String branch, String sem) {
		USN = usn;
		NAME = name;
		BRANCH = branch;
		SEM = sem;
	}

public static void main(String args[])
 {
     Scanner sc = new Scanner (System.in);       
    System.out.println("Enter the total no of students");       
    int n =sc.nextInt();        
    Main[] St = new Main[n];        
    String usn, name, branch, sem;        
    for(int i=0;i<n;i++)        
    {     
        System.out.println("Enter details of students "+(i+1));      
        System.out.println("usn:");        
        usn = sc.next();        
        System.out.println("Name:");        
        name = sc.next();        
        System.out.println("Branch:");       
        branch = sc.next();        
        System.out.println("Sem:");      
        sem = sc.next();       
        St[i] = new Main(usn, name, branch, sem);
      }
System.out.println("Student details");   
System.out.println("USN\t NAME\t BRANCH\t SEM\t");
   for(int i=0;i<n;i++)   
    {      
        System.out.println(St[i].USN+"\t"+St[i].NAME+"\t"+St[i].BRANCH+"\t"+St[i].SEM);
    }
 }
}
