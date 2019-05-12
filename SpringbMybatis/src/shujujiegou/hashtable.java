package shujujiegou;

import java.util.Enumeration;
import java.util.Hashtable;

public class hashtable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable ht=new Hashtable();
		Enumeration name;
		String next;
		ht.put("kong", new Double(23));
		ht.put("s", new Double(2));
		ht.put("d", new Double(3));
		ht.put("shi", new String("hui"));
		name=ht.keys();
		while(name.hasMoreElements()){
			next=(String) name.nextElement();
			System.out.println(next+":"+ht.get(next));
			
		}

	}

}
