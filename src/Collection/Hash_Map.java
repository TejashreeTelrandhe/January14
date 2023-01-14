package Collection;

import java.util.HashMap;

public class Hash_Map {

	public static void main(String[] args) {
HashMap <Integer,String> HM = new HashMap<Integer,String>();
HM.put(1, "class1");
HM.put(9, "class9");
HM.put(4, "class4");
HM.put(5, "class5");
HM.put(3, "class3");
HM.put(2, "class2");
HM.put(1, "class1");
System.out.println(HM);//{1=class1, 2=class2, 3=class3, 4=class4, 5=class5, 9=class9}

HM.remove(1);
System.out.println(HM);//{2=class2, 3=class3, 4=class4, 5=class5, 9=class9}

HM.put(null, "class6");
System.out.println(HM);//{null=class6, 2=class2, 3=class3, 4=class4, 5=class5, 9=class9}

HM.put(null, "class7");
System.out.println(HM);{//null=class7, 2=class2, 3=class3, 4=class4, 5=class5, 9=class9}
// key can accept only one null values, overrides
	
HM.put(7, null);
System.out.println(HM);//{null=class7, 2=class2, 3=class3, 4=class4, 5=class5, 7=null, 9=class9}

HM.put(8, null);
System.out.println(HM);//{null=class7, 2=class2, 3=class3, 4=class4, 5=class5, 7=null, 8=null, 9=class9}
//value can accept multiple null values

System.out.println(HM.get(4));//class4
System.out.println(HM.get("class10"));//null

System.out.println(HM.containsKey(2));//true
System.out.println(HM.containsValue("class1"));//false
System.out.println(HM.entrySet());
System.out.println();
System.out.println(HM.values());//[class2, class3, class4, class5, class9]
System.out.println();
System.out.println(HM.keySet());//[2, 3, 4, 5, 9]
System.out.println();

for(Object obj:HM.keySet()) {
	System.out.println(obj);	
}
System.out.println();
for(Object obj1:HM.values()) {
	System.out.println(obj1);
}
System.out.println();
for(Object obj2:HM.entrySet()) {
	System.out.println(obj2);
}
System.out.println();
for(Object obj3:HM.keySet()) {
	System.out.println(obj3+" : "+HM.get(obj3));
}

}
}}
