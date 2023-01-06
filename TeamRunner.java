
public class TeamRunner
{
    // instance variables - replace the example below with your own
    void main() {
        
        // generic persons
        Person person1 = new Person("Bob", "Burns", 34);
        Person person2 = new Person("Sue", "Smith", 35);

        // player squad and trainer objects
        Player player1 = new Player("Ann", "Gray", 31, 5, true);
        Player player2 = new Player("Ben", "Black", 32, 2, false);
        Coach coach1 = new Coach("Tom", "Brown", 33, "SVA Level 1");

        // create populate and display the team
        Team team1 = new Team("InverDiggers", "volleyball", coach1);

        team1.addPlayer(player1);
        team1.addPlayer(player2);
        
        team1.displaySquad();
        
        // create heterogeneous list of objects
        PassengerList manifest = new PassengerList(team1);
        manifest.displayTravellers();
        
        
        // test code
        System.out.println("\n\nTest Code\n_________\n");

        // upcast Player object ref by Person var
        Person person3 = player1;

        // sayHello() is Person method overridden by Player and Coach
        player1.sayHello();     // Player ref -> Player obj, uses Player version
        person3.sayHello();     // uses Player version
        
        // changeShirtNum appears only in player
        player1.changeShirtNum(7);      // OK when Player obj is ref by Player type var
        //person3.changeShirtNum(7);    // method not accessible when Player obj is ref by Person type var

    }
}
