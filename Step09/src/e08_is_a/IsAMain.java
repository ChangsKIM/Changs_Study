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
		Person pr = (Person) al;
		pr.eat();
	}

}







