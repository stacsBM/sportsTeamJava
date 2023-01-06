public class Player extends Person
{
    // instance variables - replace the example below with your own
    private int shirtNumber;
    private boolean captain;
    
    // this causes the superclass field to be hidden
    // protected String surname;

    public Player(String firstName, String surname, int age, int shirtNumber, boolean captain)
    {
        super(firstName, surname, age);
        // this.firstName = firstName;
        // this.surname = surname;
        // initialise instance variables
        this.shirtNumber = shirtNumber;
        this.captain = captain;
    }

    public void changeShirtNum(int shirtNumber)
    {
        this.shirtNumber = shirtNumber;
    }

    public void changeCaptain()
    {
        this.captain = !(this.captain);
    }

    public void sayHello()
    {
        System.out.print("Hello, my name is " + this.firstName + " " + this.surname);
        System.out.println(", my shirt number is " + this.shirtNumber);
        if(this.captain) {
            System.out.println("I am the current captain");
        }
    }
}
