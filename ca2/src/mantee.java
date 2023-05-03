abstract class Percentage {
    public abstract double getPercentage();
}

class Menteel extends Percentage {
    private double physicsMarks;
    private double chemistryMarks;

    public Menteel(double physicsMarks, double chemistryMarks) {
        this.physicsMarks = physicsMarks;
        this.chemistryMarks = chemistryMarks;
    }

    public double getPercentag() {
        return ((physicsMarks + chemistryMarks) / 100) * 100;
    }

    @Override
    public double getPercentage() {
        return 0;
    }
}

class Mentee2 extends Percentage {
    private double javaMarks;
    private double cMarks;
    private double cPlusPlusMarks;

    public Mentee2(double javaMarks, double cMarks, double cPlusPlusMarks) {
        this.javaMarks = javaMarks;
        this.cMarks = cMarks;
        this.cPlusPlusMarks = cPlusPlusMarks;
    }

    public double getPercentage() {
        return ((javaMarks + cMarks + cPlusPlusMarks) / 174) * 100;
    }
}

public class mantee {
    public static void main(String[] args) {
        Menteel menteel = new Menteel(35, 45);
        System.out.println("Percentage of Menteel: " + menteel.getPercentag());

        Mentee2 mentee2 = new Mentee2(50, 48, 54);
        System.out.println("Percentage of Mentee2: " + mentee2.getPercentage());
    }
}
