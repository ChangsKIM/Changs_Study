package e01_string;

public class StringBuilderTest {

	public static void main(String[] args) {
		String str = "   Hello    ";
		System.out.println(System.identityHashCode(str));
		str += 100;
		System.out.println(str);
		System.out.println(System.identityHashCode(str));
		str = str.replace("l", "a");
		System.out.println(str);
		System.out.println(System.identityHashCode(str));
		System.out.println();
		//--------------------
		
	}

}



