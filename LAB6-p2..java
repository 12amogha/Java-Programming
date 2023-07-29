import java.util.*;
public class program2 
{
    public static void main(String[] args) 
    {
        LinkedList<Integer> dll = new LinkedList<Integer>();
        System.out.println("Doubly linkedlist Sucessfully created");
                        dll.addFirst(1);
                        dll.addLast(9);
                        dll.addFirst(2);
                        dll.addLast(8);
                        dll.addFirst(3);
                        System.out.println("Successfully Inserted");
                        Iterator itr1=dll.iterator(); 
                        System.out.println("Elements after insertion :");
                        while(itr1.hasNext()) 
                        {  
                            System.out.print(itr1.next()+"<->"); 
                        }
                        System.out.println("NULL");
                        Integer ele_rm;
                        ele_rm=2;
                        if (dll.contains(ele_rm))
                        {
                            dll.remove(ele_rm);
                            System.out.println("Successfully Deleted");
                            Iterator itr2=dll.iterator(); 
                            System.out.println("Elements after deleting :"+ele_rm);
                            while(itr2.hasNext())
                            {  
                                System.out.print(itr2.next()+"<->"); 
                            }
                            System.out.println("NULL"); 
                        }
                        else 
                        {
                            System.out.println("Element not found");
                        }
    }
}
