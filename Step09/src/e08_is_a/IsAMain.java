package e08_is_a;

public class IsAMain {

	public static void main(String[] args) {
		Person p = new Person();
		Dog d = new Dog();
		
		Animal a = p;
		a.eat();
		Person e = (Person)a;
		e.eat();
		System.out.println(System.identityHashCode(p));
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(e));
		
		a = d;
		a.eat();
		d.eat();
		Dog g = (Dog) a;
		g.eat();
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(d));
		System.out.println(System.identityHashCode(g));
		
		Animal al = d;
		//Animal에 Dog 인스턴스 이기 떄문에 Dog는 Person으로 변경 X
		//Dog와 Person은 관계가 없다.
		Person pr = (Person) al;
		pr.eat();
	}

}







