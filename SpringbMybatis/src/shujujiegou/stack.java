package shujujiegou;

import java.util.Stack;

public class stack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack st=new Stack();
		st.push(1);
		st.push(3);
		st.push("shikong");
		while(!st.empty()){
			System.out.println(st.pop());
		}

	}

}
