package TasksOOPS.Task7;

class Animal{
	void sound() {
		System.out.println("Animal makes a sound---");
	}
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

class Cow extends Animal {
    @Override
    void sound() {
        System.out.println("Cow moos");
    }
}


public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog obj1 = new Dog();
		Cat obj2 = new Cat();
		Cow obj3 = new Cow();
		obj1.sound();
		obj2.sound();
		obj3.sound();

	}

}
