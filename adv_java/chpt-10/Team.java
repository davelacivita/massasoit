public class Team {
    String name;
    int wins;
    int loses;

    public Team() {
        this.name = "unknown";
        this.wins = 0;
        this.loses = 0;
    }

    public Team(String namePassed) {
        this.name = namePassed;
        this.wins = 0;
        this.loses = 0;
    }

}
