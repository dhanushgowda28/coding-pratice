public class PassByValue {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Jhon";
        changeName(dog);
        System.out.println(dog.name);

    }

    public static void changeName(Dog dog) {
        dog = new Dog();
        dog.name = "Smith";
        System.out.println(dog.name);
    }

}

class Dog {
    String name;

}
