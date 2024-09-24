package e01_object;

public class ObjectMain {

	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 20);
		Person p2 = new Person("홍길동", 20);
		Person p3 = p1;
		
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(null));
		System.out.println(p1.equals(p3));
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		Student s1 = new Student("1111", "홍길동", "게임학과", 3.2);
		Student s2 = new Student("1111", "홍길동", "게임학과", 3.2);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}

}




