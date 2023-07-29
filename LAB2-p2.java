

class Employee
{
 String name;
 int emp_id;
 Employee(String n,int x)
 {
   name= n;
   emp_id=x;
 }
 void print_data()
  { 
        System.out.println("Name : "+this.name+"\nEmployee ID : "+this.emp_id);
  }

 }
 
 class Faculty extends Employee
 {
  String dept;
  Faculty(String n,int x,String dept1)
  {
   super(n,x);
   dept=dept1;
  }
  
  void print_data()
  { 
    super.print_data();
    System.out.println("Department : "+dept);
  }
  }    
 
 class  Professor extends Faculty
 {
  String spec;
  Professor(String n,int x,String dept1,String spec1)
  {
   super(n,x,dept1);
   spec=spec1;
  }
  
  void print_data()
  { 
    super.print_data();
    System.out.println("Specialization : "+spec);
  }
  }
  
  class Main
  {
   public static void main(String args[])
   {
     Professor pf=new Professor("Amogha",1234,"AIML","Machine Learning");

     pf.print_data();
   }
  }   
