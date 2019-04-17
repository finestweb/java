import java.util.Random;

abstract class President{
    abstract void lie();
    abstract void truth();
    abstract void dance();
    abstract void speak();
    abstract void debate();
    abstract void bribery();
    abstract void scandal();
    abstract void result();
    abstract int resultEnd();
}

class Zelenskiy extends President{
    private int lie;
    private int truth;
    private int dance;
    private int speak;
    private int debate;
    private int bribery;
    private int scandal;
    private int procent;

    public Zelenskiy(int lie, int truth, int dance, int speak, int debate, int bribery, int scandal,int procent) {
        this.lie = lie;
        this.truth = truth;
        this.dance = dance;
        this.speak = speak;
        this.debate = debate;
        this.bribery = bribery;
        this.scandal = scandal;
        this.procent = procent;
    }

    @Override
    void lie() {
        if(lie == 0){
            System.out.println("Zelensky didn't lie.");
            procent = procent + 5;
            System.out.println(procent);
            System.out.println("----------------------------------");
        }else{
            System.out.println("Zelensky lied.");
            procent = procent - 5;
            System.out.println(procent);
            System.out.println("----------------------------------");
        }
    }
    @Override
    void truth() {
        if(truth == 1){
            System.out.println("Zelensky's telling the truth.");
            procent = procent + 5;
            System.out.println(procent);
            System.out.println("----------------------------------");
        }else{
            System.out.println("Zelensky is lying.");
            procent = procent - 5;
            System.out.println(procent);
            System.out.println("----------------------------------");
        }
    }
    @Override
    void dance() {
        if(dance == 1){
            System.out.println("Zelensky danced.");
            procent = procent + 1;
            System.out.println(procent);
            System.out.println("----------------------------------");
        }else{
            System.out.println("Zelensky didn't dance.");
            procent = procent + 5;
            System.out.println(procent);
            System.out.println("----------------------------------");
        }
    }
    @Override
    void speak() {
        if(speak == 1){
            System.out.println("Zelensky speaks well and convinces.");
            procent = procent + 10;
            System.out.println(procent);
            System.out.println("----------------------------------");
        }else{
            System.out.println("Zelensky at a loss of words and generally it is a lame, illiterate.");
            procent = procent - 10;
            System.out.println(procent);
            System.out.println("----------------------------------");
        }
    }
    @Override
    void debate() {
        if(debate == 1){
            System.out.println("Zelensky came to the Olympic debate.");
            procent = procent + 25;
            System.out.println(procent);
            System.out.println("----------------------------------");
        }else{
            System.out.println("Zelensky did not come to the Olympic debate.");
            procent = procent - 25;
            System.out.println(procent);
            System.out.println("----------------------------------");
        }
    }
    @Override
    void bribery() {
        if(bribery == 1){
            System.out.println("Zelensky bribed voters.");
            procent = procent - 30;
            System.out.println(procent);
            System.out.println("----------------------------------");
        }else{
            System.out.println("Zelensky is not bribed the voters.");
            procent = procent + 30;
            System.out.println(procent);
            System.out.println("----------------------------------");
        }
    }
    @Override
    void scandal() {
        if(scandal == 1){
        System.out.println("Zelensky will lose to the nines.");
            procent = procent - 15;
            System.out.println(procent);
            System.out.println("----------------------------------");
        }else{
            System.out.println("Zelensky didn't get into a scandal.");
            procent = procent + 15;
            System.out.println(procent);
            System.out.println("----------------------------------");
        }
    }
    @Override
    void result() {
        System.out.println("Itog Zelensky " + procent);
        System.out.println("----------------------------------");
        if(procent <= 0){
            System.out.println("Zelensky will lose to the nines.");
        }else if(procent <= 50 && procent > 0){
            System.out.println("Zelensky well almost normal guy.");
        }else if(procent > 50 && procent <= 50){
            System.out.println("Zelensky has almost its Board dude.");
        }else if(procent > 100){
            System.out.println("Zelensky has a real chance to win.");
        }
    }
    @Override
    int resultEnd() {
        return procent;
    }
}

class Poroshenko extends President{
    private int lie;
    private int truth;
    private int dance;
    private int speak;
    private int debate;
    private int bribery;
    private int scandal;
    private int procent;

    public Poroshenko(int lie, int truth, int dance, int speak, int debate, int bribery, int scandal,int procent) {
        this.lie = lie;
        this.truth = truth;
        this.dance = dance;
        this.speak = speak;
        this.debate = debate;
        this.bribery = bribery;
        this.scandal = scandal;
        this.procent = procent;
    }

    @Override
    void lie() {
        if(lie == 0){
            System.out.println("Poroshenko didn't lie.");
            procent = procent + 5;
            System.out.println(procent);
            System.out.println("----------------------------------");
        }else{
            System.out.println("Poroshenko lied.");
            procent = procent - 5;
            System.out.println(procent);
            System.out.println("----------------------------------");
        }
    }
    @Override
    void truth() {
        if(truth == 1){
            System.out.println("Poroshenko's telling the truth.");
            procent = procent + 5;
            System.out.println(procent);
            System.out.println("----------------------------------");
        }else{
            System.out.println("Poroshenko is lying.");
            procent = procent - 5;
            System.out.println(procent);
            System.out.println("----------------------------------");
        }
    }
    @Override
    void dance() {
        if(dance == 1){
            System.out.println("Poroshenko danced.");
            procent = procent + 1;
            System.out.println(procent);
            System.out.println("----------------------------------");
        }else{
            System.out.println("Poroshenko didn't dance.");
            procent = procent + 5;
            System.out.println(procent);
            System.out.println("----------------------------------");
        }
    }
    @Override
    void speak() {
        if(speak == 1){
            System.out.println("Poroshenko speaks well and convinces.");
            procent = procent + 10;
            System.out.println(procent);
            System.out.println("----------------------------------");
        }else{
            System.out.println("Poroshenko at a loss of words and generally it is a lame, illiterate.");
            procent = procent - 10;
            System.out.println(procent);
            System.out.println("----------------------------------");
        }
    }
    @Override
    void debate() {
        if(debate == 1){
            System.out.println("Poroshenko came to the Olympic debate.");
            procent = procent + 25;
            System.out.println(procent);
            System.out.println("----------------------------------");
        }else{
            System.out.println("Poroshenko did not come to the Olympic debate.");
            procent = procent - 25;
            System.out.println(procent);
            System.out.println("----------------------------------");
        }
    }
    @Override
    void bribery() {
        if(bribery == 1){
            System.out.println("Poroshenko bribed voters.");
            procent = procent - 30;
            System.out.println(procent);
            System.out.println("----------------------------------");
        }else{
            System.out.println("Poroshenko is not bribed the voters.");
            procent = procent + 30;
            System.out.println(procent);
            System.out.println("----------------------------------");
        }
    }
    @Override
    void scandal() {
        if(scandal == 1){
        System.out.println("Poroshenko got into a scandal.");
            procent = procent - 15;
            System.out.println(procent);
            System.out.println("----------------------------------");
        }else{
            System.out.println("Poroshenko didn't get into a scandal.");
            procent = procent + 15;
            System.out.println(procent);
            System.out.println("----------------------------------");
        }
    }
    @Override
    void result() {
        System.out.println("Itog Poroshenko " + procent);
        System.out.println("----------------------------------");
        if(procent <= 0){
            System.out.println("Poroshenko will lose to the nines.");
        }else if(procent <= 50 && procent > 0){
            System.out.println("Poroshenko well almost normal guy.");
        }else if(procent > 50 && procent <= 50){
            System.out.println("Poroshenko has almost its Board dude.");
        }else if(procent > 100){
            System.out.println("Poroshenko has a real chance to win.");
        }
    }
    @Override
    int resultEnd() {
        return procent;
    }
}

class Timoshenko extends President{
    private int lie;
    private int truth;
    private int dance;
    private int speak;
    private int debate;
    private int bribery;
    private int scandal;
    private int procent;

    public Timoshenko(int lie, int truth, int dance, int speak, int debate, int bribery, int scandal,int procent) {
        this.lie = lie;
        this.truth = truth;
        this.dance = dance;
        this.speak = speak;
        this.debate = debate;
        this.bribery = bribery;
        this.scandal = scandal;
        this.procent = procent;
    }

    @Override
    void lie() {
        if(lie == 0){
            System.out.println("Timoshenko didn't lie.");
            procent = procent + 5;
            System.out.println(procent);
            System.out.println("----------------------------------");
        }else{
            System.out.println("Timoshenko lied.");
            procent = procent - 5;
            System.out.println(procent);
            System.out.println("----------------------------------");
        }
    }
    @Override
    void truth() {
        if(truth == 1){
            System.out.println("Timoshenko's telling the truth.");
            procent = procent + 5;
            System.out.println(procent);
            System.out.println("----------------------------------");
        }else{
            System.out.println("Timoshenko is lying.");
            procent = procent - 5;
            System.out.println(procent);
            System.out.println("----------------------------------");
        }
    }
    @Override
    void dance() {
        if(dance == 1){
            System.out.println("Timoshenko danced.");
            procent = procent + 1;
            System.out.println(procent);
            System.out.println("----------------------------------");
        }else{
            System.out.println("Timoshenko didn't dance.");
            procent = procent + 5;
            System.out.println(procent);
            System.out.println("----------------------------------");
        }
    }
    @Override
    void speak() {
        if(speak == 1){
            System.out.println("Timoshenko speaks well and convinces.");
            procent = procent + 10;
            System.out.println(procent);
            System.out.println("----------------------------------");
        }else{
            System.out.println("Timoshenko at a loss of words and generally it is a lame, illiterate.");
            procent = procent - 10;
            System.out.println(procent);
            System.out.println("----------------------------------");
        }
    }
    @Override
    void debate() {
        if(debate == 1){
            System.out.println("Timoshenko came to the Olympic debate.");
            procent = procent + 25;
            System.out.println(procent);
            System.out.println("----------------------------------");
        }else{
            System.out.println("Timoshenko did not come to the Olympic debate.");
            procent = procent - 25;
            System.out.println(procent);
            System.out.println("----------------------------------");
        }
    }
    @Override
    void bribery() {
        if(bribery == 1){
            System.out.println("Timoshenko bribed voters.");
            procent = procent - 30;
            System.out.println(procent);
            System.out.println("----------------------------------");
        }else{
            System.out.println("Timoshenko is not bribed the voters.");
            procent = procent + 30;
            System.out.println(procent);
            System.out.println("----------------------------------");
        }
    }
    @Override
    void scandal() {
        if(scandal == 1){
        System.out.println("Timoshenko got into a scandal.");
            procent = procent - 15;
            System.out.println(procent);
            System.out.println("----------------------------------");
        }else{
            System.out.println("Timoshenko didn't get into a scandal.");
            procent = procent + 15;
            System.out.println(procent);
            System.out.println("----------------------------------");
        }
    }
    @Override
    void result() {
        System.out.println("Itog Timoshenko " + procent);
        System.out.println("----------------------------------");
        if(procent <= 0){
            System.out.println("Timoshenko will lose to the nines.");
        }else if(procent <= 50 && procent > 0){
            System.out.println("Timoshenko well almost normal guy.");
        }else if(procent > 50 && procent <= 50){
            System.out.println("Timoshenko has almost its Board dude.");
        }else if(procent > 100){
            System.out.println("Timoshenko has a real chance to win.");
        }
    }
    @Override
    int resultEnd() {
        return procent;
    }
}

public class Election {
    public static void main(String[] args) {

        Zelenskiy zelenskiy = new Zelenskiy(1,0,0,1,0,1,0,0);
        zelenskiy.lie();
        zelenskiy.truth();
        zelenskiy.dance();
        zelenskiy.speak();
        zelenskiy.debate();
        zelenskiy.bribery();
        zelenskiy.scandal();
        zelenskiy.result();
        zelenskiy.resultEnd();

        Poroshenko poroshenko = new Poroshenko(1,0,1,1,1,1,0,0);
        poroshenko.lie();
        poroshenko.truth();
        poroshenko.dance();
        poroshenko.speak();
        poroshenko.debate();
        poroshenko.bribery();
        poroshenko.scandal();
        poroshenko.result();
        poroshenko.resultEnd();

        Timoshenko timoshenko = new Timoshenko(0,1,0,1,1,1,1,1);
        timoshenko.lie();
        timoshenko.truth();
        timoshenko.dance();
        timoshenko.speak();
        timoshenko.debate();
        timoshenko.bribery();
        timoshenko.scandal();
        timoshenko.result();
        timoshenko.resultEnd();

        resultTur(zelenskiy.resultEnd(), poroshenko.resultEnd(), timoshenko.resultEnd());
        
    }

    public static void resultTurSecondZP(int resultZ, int resultP){
        if(resultZ > resultP){
            System.out.println("Zelensky Win");
        }else{
            System.out.println("Poroshenko Win");
        }
    }

    public static void resultTurSecondZT(int resultZ, int resultT){
        if(resultZ > resultT){
            System.out.println("Zelensky Win");
        }else{
            System.out.println("Timoshenko Win");
        }
    }

    public static void resultTurSecondTP(int resultT, int resultP){
        if(resultT > resultP){
            System.out.println("Timoshenko Win");
        }else{
            System.out.println("Poroshenko Win");
        }
    }

    public static void resultTur(int resultZ, int resultP, int resultT){

        Zelenskiy zelenskiy = new Zelenskiy(1,0,0,1,0,1,0,0);
        zelenskiy.lie();
        zelenskiy.truth();
        zelenskiy.dance();
        zelenskiy.speak();
        zelenskiy.debate();
        zelenskiy.bribery();
        zelenskiy.scandal();
        zelenskiy.result();
        zelenskiy.resultEnd();

        Poroshenko poroshenko = new Poroshenko(1,0,1,1,1,1,0,0);
        poroshenko.lie();
        poroshenko.truth();
        poroshenko.dance();
        poroshenko.speak();
        poroshenko.debate();
        poroshenko.bribery();
        poroshenko.scandal();
        poroshenko.result();
        poroshenko.resultEnd();

        Timoshenko timoshenko = new Timoshenko(0,1,0,1,1,1,1,1);
        timoshenko.lie();
        timoshenko.truth();
        timoshenko.dance();
        timoshenko.speak();
        timoshenko.debate();
        timoshenko.bribery();
        timoshenko.scandal();
        timoshenko.result();
        timoshenko.resultEnd();

        if(resultZ > resultP && resultZ > resultT){
            System.out.println("----------------------------------");
            System.out.println("----------------------------------");
            System.out.println("1 TUR between Zelensky and Poroshenko and Timoshenko");
            System.out.println("----------------------------------");
            System.out.println("----------------------------------");
            System.out.println("Zelensky and Poroshenko win.");
            System.out.println("----------------------------------");
            System.out.println("----------------------------------");
            System.out.println("2 TUR");
            System.out.println("----------------------------------");
            System.out.println("----------------------------------");
            System.out.println("2 TUR between Zelensky and Poroshenko");
            System.out.println("----------------------------------");
            System.out.println("----------------------------------");
            resultTurSecondZP(zelenskiy.resultEnd(), poroshenko.resultEnd());
            System.out.println("----------------------------------");
            System.out.println("----------------------------------");
        }else if(resultT > resultZ && resultT > resultP){
            System.out.println("----------------------------------");
            System.out.println("----------------------------------");
            System.out.println("1 TUR between Zelensky and Poroshenko and Timoshenko");
            System.out.println("----------------------------------");
            System.out.println("----------------------------------");
            System.out.println("Poroshenko and Tymoshenko win.");
            System.out.println("----------------------------------");
            System.out.println("----------------------------------");
            System.out.println("2 TUR");
            System.out.println("----------------------------------");
            System.out.println("----------------------------------");
            System.out.println("2 TUR between Tymoshenko and Poroshenko");
            System.out.println("----------------------------------");
            System.out.println("----------------------------------");
            resultTurSecondTP(timoshenko.resultEnd(), poroshenko.resultEnd());
            System.out.println("----------------------------------");
            System.out.println("----------------------------------");
        }else if(resultP > resultZ && resultP > resultT){
            System.out.println("----------------------------------");
            System.out.println("----------------------------------");
            System.out.println("1 TUR between Zelensky and Poroshenko and Timoshenko");
            System.out.println("----------------------------------");
            System.out.println("----------------------------------");
            System.out.println("Poroshenko and Tymoshenko win.");
            System.out.println("----------------------------------");
            System.out.println("----------------------------------");
            System.out.println("2 TUR");
            System.out.println("----------------------------------");
            System.out.println("----------------------------------");
            System.out.println("2 TUR between Tymoshenko and Poroshenko");
            System.out.println("----------------------------------");
            System.out.println("----------------------------------");
            resultTurSecondTP(timoshenko.resultEnd(), poroshenko.resultEnd());
            System.out.println("----------------------------------");
            System.out.println("----------------------------------");
        }
    }
}
