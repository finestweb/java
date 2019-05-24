package Potok_2;

public abstract class Barrier {
    public abstract void doIt(Candidate candidate);
}

class Trustb extends Barrier {
    int trust;

    public Trustb(int trust) {
        this.trust = trust;
    }

    @Override
    public void doIt(Candidate candidate) {
        candidate.lie(trust);
    }
}

class Musicb extends Barrier {
    int music;

    public Musicb(int music) {
        this.music = music;
    }

    @Override
    public void doIt(Candidate candidate) {
        candidate.dance(music);
    }
}

class Gentlemanb extends Barrier {
    int gentleman;

    public Gentlemanb(int gentleman) {
        this.gentleman = gentleman;
    }

    @Override
    public void doIt(Candidate candidate) {
        candidate.speak(gentleman);
    }
}

class Idiotb extends Barrier {
    int idiot;

    public Idiotb(int idiot) {
        this.idiot = idiot;
    }

    @Override
    public void doIt(Candidate candidate) {
        candidate.debate(idiot);
    }
}

class Herob extends Barrier {
    int hero;

    public Herob(int hero) {
        this.hero = hero;
    }

    @Override
    public void doIt(Candidate candidate) {
        candidate.bribery(hero);
    }
}

class Sexb extends Barrier {
    int sex;

    public Sexb(int sex) {
        this.sex = sex;
    }

    @Override
    public void doIt(Candidate candidate) {
        candidate.scandal(sex);
    }
}

class MainCross {
    public static void main(String[] args) {
        Candidate[] candidates = {new Zelenskiy("Зеленский"), new Poroshenko("Порошенко")};
        Barrier[] barriers = {new Trustb(1), new Musicb(1), new Gentlemanb(1), new Idiotb(0), new Herob(1), new Sexb(1)};

        for (Candidate candidate : candidates) {
            for (Barrier barrier : barriers) {
                barrier.doIt(candidate);
            }
        }
        for (Candidate candidate : candidates) {
            candidate.info();
        }
    }
}
