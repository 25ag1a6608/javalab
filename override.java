class student
{
    void study()
    {
        System.out.println("we are studying");
    }
}
class Teacher extends student
{
    void study()
    {
        System.out.println("teachers are giving lectures");
    }
}
class override
{
    public static void main(String args[])
    {
        Teacher t=new Teacher();
        t.study();
        student s= new student();
        s.study();
    }
}