package Potok_2;

public class Team {
    private String nameForTeam;
    private Candidate[] members;

    //геттер
    public Candidate[] getMembers() {
        return members;
    }

    //конструктор
    public Team(String nameForTeam, Candidate...members) {
        this.nameForTeam = nameForTeam;
        this.members = members;
    }

    //метод
    public void showWinners() {
        System.out.println("win");
        for(Candidate c: members) {
                c.info();
        }
    }
}
