
public class StringEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String a = "def";
	//	char b[] = {'a','b','c'};
		String b = "abc";
		
		System.out.print(b+a);
//		System.out.println(a);

		Integer h = 230;
		Integer l = new Integer(100);
		
		System.out.println(h);
		System.out.println(l);
		
		System.out.println(h+l);  
		//230100
		System.out.println(h.toString()+l.toString());

		Integer c;
		
		for(int i = 0; i < 100; i++) {
			c = i;
			System.out.print(c.toString());
		}
		
	}

}
