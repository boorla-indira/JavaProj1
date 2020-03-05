
public class TestForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("New Java Class");
		int a[] = {1, 2, 3};
		for (int i = 0; i < a.length; i++) {
		System.out.println("args= " + a[i]);
		}
		for (int i : a) {
			System.out.println(i);
		}
		for(int i=10; i< 13; i++) {
			System.out.println("i= "+i);
		}
		String s[]= {"Java1", "Java2", "Java3"};
		for (int i = 0; i < s.length; i++) {
			System.out.println("s[" +i +"]= " +s[i]);
		}
		for(String i: s) {
			System.out.println(i);
		}
	}

}
