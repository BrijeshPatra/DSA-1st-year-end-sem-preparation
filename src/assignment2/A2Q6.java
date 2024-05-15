package assignment2;

abstract class Marks{
    int markIcp;
    int markDsa;
    double percentage;

    public abstract double getPercentage();
}
class CSE extends Marks{
    int algoDesign;

    public CSE(int algoDesign,int markIcp,int markDSA) {
        this.algoDesign = algoDesign;
        this.markDsa = markDSA;
        this.markIcp = markIcp;
    }

    @Override
    public double getPercentage() {
        double totalMarks = 100 * 3; // Total marks for three subjects
        double obtainedMarks = algoDesign + markIcp + markDsa;
        double percentage = (obtainedMarks / totalMarks) * 100;
        return percentage;
    }
}
class NonCse extends Marks{
    int engMechanics;

    public NonCse(int markIcp,int markDsa,int engMechanics) {
        this.markDsa=markDsa;
        this.markIcp=markIcp;
        this.engMechanics=engMechanics;
    }

    @Override
    public double getPercentage() {
        double totalMarks = 100 * 3; // Total marks for three subjects
        double obtainedMarks = engMechanics + markIcp + markDsa;
        double percentage = (obtainedMarks / totalMarks) * 100;
        return percentage;
    }
}
public class A2Q6 {
    public static void main(String[] args) {
        CSE c=new CSE(20,11,22);
        NonCse c1=new NonCse(36,78,60);

        double res= c.getPercentage();
        System.out.println("Percentage for CSE" + res);

        double res2=c1.getPercentage();
        System.out.println("Percentage for Non CSE" + res2);
    }
}
