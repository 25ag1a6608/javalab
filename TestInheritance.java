class Animal {
    String name;

    void show() {
        System.out.println("Animal name is: " + name);
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking");
    }
}

class TestInheritance {
    public static void main(String args[]) {
        Dog d = new Dog();
        d.name = "DOG";
        d.show();
        d.bark();
    }
}