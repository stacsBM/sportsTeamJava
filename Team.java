
public class Team
{
    // instance variables - replace the example below with your own
    private String teamName;
    private String sport;
    private int numPlayers;
    private Player[] squad;
    private Coach trainer;

    public Team(String teamName, String sport, Coach trainer)
    {
        // initialise instance variables
        this.teamName = teamName;
        this.sport = sport;
        this.numPlayers = numPlayers;       // need to clarify: count so far or size limit?
        this.squad = new Player[20];
        this.trainer = trainer;    
    }
    
    public void addPlayer(Player player) {
        this.squad[this.numPlayers] = player;
        this.numPlayers++;
    }

    public void displaySquad()
    {
        System.out.println("\n\nTeam\n_________\n");
        System.out.println(this.teamName + " plays " + this.sport + " and is coached by " + this.trainer.getFirst());
        for (int i=0; i<this.numPlayers; i++) {
            System.out.println(squad[i].getFirst() + " " +  squad[i].getSurname());
        }
    }
    
    public Player[] getSquad() {
        return this.squad;
    }
    
    public int getNumPlayers() {
        return this.numPlayers;
    }
    
    public Coach getTrainer() {
        return this.trainer;
    }
}
