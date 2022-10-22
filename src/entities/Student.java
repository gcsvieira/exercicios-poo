package entities;

public class Student {
    public double firstGrade;
    public double secondGrade;
    public double thirdGrade;
    public double sum;

    public void passChecker() {
        this.sum = this.firstGrade + this.secondGrade + this.thirdGrade;
        System.out.println("\nFINAL GRADE = " + this.sum);

        if (this.sum >= 60) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.println("MISSING "
                    + String.format("%.2f", (60 - this.sum)) + " POINTS");
        }
    }
}