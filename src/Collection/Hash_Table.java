package Collection;

import java.util.Hashtable;

public class Hash_Table {

public static void main(String[] args) {
Hashtable <Integer,String> HT = new Hashtable<Integer,String>();
HT.put(1, "Std1");
HT.put(2, "Std2");
HT.put(3, "Std3");
HT.put(4, "Std4");
HT.put(5, "Std5");
HT.put(6, "Std6");
HT.put(7, "Std7");
System.out.println(HT);
//HT.put(null, "Std8");
//HT.put(null, "Std9");
//System.out.println(HT);//NullPointerException
//HT.put(8, null);
//HT.put(9, null);
//System.out.println(HT);//NullPointerException
////Hashtable doesnot allow null key and value 
System.out.println(HT.get("Std3"));
System.out.println(HT.get(3));
System.out.println(HT.containsKey(5));//true
System.out.println(HT.containsValue("Std10"));//false
System.out.println(HT.isEmpty());//false

System.out.println();
for(Object obj:HT.keySet()) {
	System.out.println(obj);
}
System.out.println();
for(Object obj:HT.values()) {
	System.out.println(obj);
}
System.out.println();
for(Object obj:HT.entrySet()) {
	System.out.println(obj);
}
System.out.println();
for(Object obj:HT.keySet()) {
	System.out.println(obj+" : "+HT.get(obj));
}
}
}
