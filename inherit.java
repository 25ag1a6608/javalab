class SuperClass {
    void show() {
        System.out.println("I'm in super class");
    }
}
class SubClass extends SuperClass {
    void display() {
        System.out.println("I'm in java lab");
    }
}
class Inherit {
    public static void main(String args[]) {
        // Created the missing object 'obj1' of the SubClass
        SubClass obj1 = new SubClass();
        
        // Calling methods using the object
        obj1.show();
        obj1.display();
    }
}