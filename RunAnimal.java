import java.util.Scanner;

public class RunAnimal {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		Cat c = new Cat ();
		Dog d = new Dog ();
		Bird b = new Bird();
		System.out.println("choose an animal, Press B for bird, C for cat, D for dog");
String choice = sc.nextLine();
	if(choice.equalsIgnoreCase("B")){
		b.eat();
		b.sleep();
		b.makeSound();
	}
	else if (choice.equalsIgnoreCase("C")){
		c.eat();
		c.sleep();
		c.makeSound();
}
    else if (choice.equalsIgnoreCase("D")){
    	d.eat();
		d.sleep();
		d.makeSound();
sc.close();
   }
	}
}
