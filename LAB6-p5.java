import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class program5
{
    public static void main(String[] args) 
	{
		HashMap hm = new HashMap();
		hm.put("Bag", new Integer(1100));
		hm.put("Wallet",new Integer(700));
		hm.put("Belt",new Integer(600));
		Set set = hm.entrySet();
		Iterator i = set.iterator();
		while(i.hasNext())
		{
			Map.Entry me = (Map.Entry)i.next();
			System.out.println(me.getKey() + ": ");
			System.out.println(me.getValue());
		}
		System.out.println("Size of hash map is :" + hm.size());
		System.out.println(hm.isEmpty());
	}
}
