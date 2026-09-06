interface A 
{
    void display();
}
class B implements A
{
    public void display()
    {
        System.out.println("hello");
    }
}
class interfaceDemo
{
    public static void main(String args[])
    {
        B obj= new B();
        obj.display();
        System.out.println("CSM-A");
    }
}