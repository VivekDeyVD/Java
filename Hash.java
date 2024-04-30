import java.util.*;
public class Hash
{
    public static void main(String args[])
    {
       Hashtable<Integer, String> ht= new Hashtable<Integer, String>();
       ht.put(10, "Chaitanya");
       ht.put(1, "Ajeet");
       ht.put(11, "Test");
       ht.put(9, "Demo");
       ht.put(3, "Anuj");
 
       // Get a set of the entries
       Set set = ht.entrySet();
       // Get an iterator
       Iterator i = set.iterator();
       // Display elements
       while(i.hasNext()) {
         Map.Entry me = (Map.Entry)i.next();
         System.out.print(me.getKey() + ": ");
         System.out.println(me.getValue());
      }
   }
}
