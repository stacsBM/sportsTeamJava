public class Coach extends Person
{
    // instance variables 
    private String qualification;

    public Coach(String firstName, String surname, int age, String qualification)
    {
        super(firstName, surname, age);
        // initialise instance variables
        this.qualification = qualification;
    }

    public String getQualification()
    {
        return this.qualification;
    }

    public void updateQualification(String qualification)
    {
        this.qualification = qualification;
    }

    public void sayHello()
    {
        System.out.print("Hello, my name is " + this.firstName + " " + this.surname);
        System.out.println(", my qualification is " + this.qualification);
    }
}
