class Vehicle
{
 private String plate_no;
  private String vehicle_type;
 
 void setter(String num,String name)
 {
   plate_no=num;
   vehicle_type=name;
  } 
  
 void getter()
 {
   System.out.println("Vehicle :"+vehicle_type+"\nNumber Plate : "+plate_no);  
 }
 }
 
 class Car extends Vehicle
 { 
     Car(String num,String name)
    { 
        super.setter(num,name);
    }  
 }  
 
 public class Main
 {
  public static void main(String args[])
  {
   Car c=new Car("KA-1234","Maruthi Suzuki");
   c.getter();
  }
 }
