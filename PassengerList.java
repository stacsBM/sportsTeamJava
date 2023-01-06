public class PassengerList
{
    private Team teamPersonnel;
    private Person[] travelPersonnel;
    private int travellerCount = 0;

    public PassengerList(Team teamPersonnel)
    {
        // travelPersonnel will contain both Player and Coach 
        this.travelPersonnel = new Person[teamPersonnel.getNumPlayers() + 1];
        for (int i=0; i<teamPersonnel.getNumPlayers(); i++) {
            this.travelPersonnel[i] = teamPersonnel.getSquad()[i];
        }
        this.travelPersonnel[teamPersonnel.getNumPlayers()] = teamPersonnel.getTrainer();
    }

    public void displayTravellers()
    {
        // traveller var can reference both Player and Coach objects
        System.out.println("\n\nTravelers\n_________\n");
        for (Person traveller : this.travelPersonnel) {
            traveller.sayHello();                           // OK: over ridden method
            traveller.birthday();                           // OK: superclass method
            
            // unusable methods in subclasses, identified by compiler
            //traveller.changeShirtNum(0);                    // FAIL: player only
            //traveller.updateQualification("SVA Level 2");   // FAIL: coach only
        }
    }
}
