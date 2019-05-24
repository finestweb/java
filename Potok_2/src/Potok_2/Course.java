package Potok_2;

public class Course {
    private Barrier[] barriers;

    public Course(Barrier... barriers) {
        this.barriers = barriers;
    }


    public void doIt(Team team) {
        for (Candidate c : team.getMembers()) {
            for (Barrier b : barriers) {
                b.doIt(c);
            }
        }
    }
}
