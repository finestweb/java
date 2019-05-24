package Potok_2;

public class Main {

    public static void main(String[] args) {
        Team team = new Team("Президент", new Zelenskiy("Зеленский"), new Poroshenko("Порошенко"));
        Course course = new Course(new Trustb(1), new Musicb(1), new Gentlemanb(1), new Idiotb(0), new Herob(1), new Sexb(1));
        course.doIt(team);
        team.showWinners();

    }
}
