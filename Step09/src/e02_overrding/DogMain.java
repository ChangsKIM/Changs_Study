package e02_overrding;

public class DogMain {
	
	public static void dogEat(Dog dog) {
		dog.eat();
		//run()?
//		dog.run(); huskey에만 있는 기능 호출 X
	}
	
	public static void main(String[] args) {
		Retriever retriever = new Retriever();
		retriever.eat();
		Bulldog bulldog = new Bulldog();
		bulldog.eat();
		Huskey huskey = new Huskey();
		huskey.eat();
		System.out.println("--------------");
		dogEat(retriever);
		dogEat(bulldog);
		dogEat(huskey);
	}

}


