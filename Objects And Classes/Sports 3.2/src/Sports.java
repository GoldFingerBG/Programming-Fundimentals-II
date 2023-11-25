public class Sports {
    private String name = "";
    private int numberOfPlayers = 0;
    private int seasonWins = 0;
    private int seasonLosses = 0;

    public Sports(){
        name = "";
        numberOfPlayers = 0;
        seasonWins = 0;
        seasonLosses = 0;
    }

    public Sports(String name, int numberOfPlayers, int seasonWins, int seasonLosses){
        this.name = name;
        this.numberOfPlayers = numberOfPlayers;
        this.seasonWins = seasonWins;
        this.seasonLosses = seasonLosses; 
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPlayers() {
        return this.numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public int getSeasonWins() {
        return this.seasonWins;
    }

    public void setSeasonWins(int seasonWins) {
        this.seasonWins = seasonWins;
    }

    public int getSeasonLosses() {
        return this.seasonLosses;
    }

    public void setSeasonLosses(int seasonLosses) {
        this.seasonLosses = seasonLosses;
    }

    public double winLoss(int seasonWins, int seasonLosses){
        return (double)seasonWins/seasonLosses;
    }

}
