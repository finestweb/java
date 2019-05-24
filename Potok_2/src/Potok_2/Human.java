package Potok_2;

public class Human implements Candidate {

    String name;
    int maxTrustLimit;
    int maxMusicLimit;
    int maxGentlemanLimit;
    int maxIdiotLimit;
    int maxHeroLimit;
    int maxSexLimit;
    int percent;

    public Human(String name, int maxTrustLimit, int maxMusicLimit, int maxGentlemanLimit, int maxIdiotLimit, int maxHeroLimit, int maxSexLimit, int percent) {
        this.name = name;
        this.maxTrustLimit = maxTrustLimit;
        this.maxMusicLimit = maxMusicLimit;
        this.maxGentlemanLimit = maxGentlemanLimit;
        this.maxIdiotLimit = maxIdiotLimit;
        this.maxHeroLimit = maxHeroLimit;
        this.maxSexLimit = maxSexLimit;
        this.percent = percent;
    }


    @Override
    public void lie(int trust) {
        if (trust == maxTrustLimit) {
            System.out.println(name + " didn't lie.");
            percent = percent + 5;
            System.out.println(percent);
            System.out.println("----------------------------------");
        } else {
            System.out.println(name + " lied.");
            percent = percent - 5;
            System.out.println(percent);
            System.out.println("----------------------------------");
        }
    }

    @Override
    public void dance(int music) {
        if (music == maxMusicLimit) {
            System.out.println(name + " danced.");
            percent = percent + 1;
            System.out.println(percent);
            System.out.println("----------------------------------");
        } else {
            System.out.println(name + " didn't dance.");
            percent = percent + 5;
            System.out.println(percent);
            System.out.println("----------------------------------");
        }
    }

    @Override
    public void speak(int gentleman) {
        if (gentleman == maxGentlemanLimit) {
            System.out.println(name + " speaks well and convinces.");
            percent = percent + 10;
            System.out.println(percent);
            System.out.println("----------------------------------");
        } else {
            System.out.println(name + " at a loss of words and generally it is a lame, illiterate.");
            percent = percent - 10;
            System.out.println(percent);
            System.out.println("----------------------------------");
        }
    }

    @Override
    public void debate(int idiot) {
        if (idiot == maxIdiotLimit) {
            System.out.println(name + " came to the Olympic debate.");
            percent = percent + 25;
            System.out.println(percent);
            System.out.println("----------------------------------");
        } else {
            System.out.println(name + " did not come to the Olympic debate.");
            percent = percent - 25;
            System.out.println(percent);
            System.out.println("----------------------------------");
        }
    }

    @Override
    public void bribery(int hero) {
        if (hero == maxHeroLimit) {
            System.out.println(name + " bribed voters.");
            percent = percent - 30;
            System.out.println(percent);
            System.out.println("----------------------------------");
        } else {
            System.out.println(name + " is not bribed the voters.");
            percent = percent + 30;
            System.out.println(percent);
            System.out.println("----------------------------------");
        }
    }

    @Override
    public void scandal(int sex) {
        if (sex == maxSexLimit) {
            System.out.println(name + " will lose to the nines.");
            percent = percent - 15;
            System.out.println(percent);
            System.out.println("----------------------------------");
        } else {
            System.out.println(name + " didn't get into a scandal.");
            percent = percent + 15;
            System.out.println(percent);
            System.out.println("----------------------------------");
        }
    }


    @Override
    public void info() {
        System.out.println(name + " " + percent);
    }
}
