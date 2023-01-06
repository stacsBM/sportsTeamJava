public class Person
{
    protected String firstName;
    protected String surname;
    protected int age;

    public Person(String firstName, String surname, int age)
    {
        this.firstName = firstName;
        this.surname = surname;
        this.age = age;
    }
    
    public String getFirst()
    {
        return this.firstName;
    }

    public String getSurname()
    {
        return this.surname;
    }

    public int getAge()
    {
        return this.age;
    }

    public void sayHello()
    {
        System.out.println("Hello, my name is " + this.firstName + " " + this.surname);
    }
    
    public void birthday() {
        this.age++;
        System.out.println("Life begins at " + this.age);
    }
}
