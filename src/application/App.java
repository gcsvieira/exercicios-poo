package application;

import java.util.Scanner;

import entities.Employee;
import entities.Rectangle;
import entities.Student;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        terceiroExercicio();

        scan.close();
    }

    public static void primeiroExercicio() {
        Scanner scan = new Scanner(System.in);
        Rectangle rec = new Rectangle();

        System.out.println("=== PRIMEIRO EXERCÍCIO === \n");

        System.out.println(
                "Enter the height and the width of the rectangle, specifically, each one separated by an enter: ");
        rec.height = scan.nextDouble();
        rec.width = scan.nextDouble();

        System.out.println();
        System.out.println(rec);
        scan.close();
    }

    public static void segundoExercicio() {
        Scanner scan = new Scanner(System.in);
        Employee emp = new Employee();

        System.out.println("=== SEGUNDO EXERCÍCIO === \n");

        System.out.print("Enter the name of the employee: ");
        emp.name = scan.nextLine();
        System.out.print("Enter the gross salary of the employee: ");
        emp.grossSalary = scan.nextDouble();
        System.out.print("Enter the tax he has to pay: ");
        emp.tax = scan.nextDouble();

        System.out.println("\n\nEmployee: " + emp + "\n");

        System.out.print("Which percentage to increase salary? ");
        emp.increaseSalary(scan.nextDouble());

        System.out.println("\nEmployee: " + emp);

        scan.close();
    }

    public static void terceiroExercicio() {
        Scanner scan = new Scanner(System.in);
        Student student = new Student();

        System.out.println(
                "Type the student's grade on the first, second and third semester, respectively, separating the grades by an Enter: ");
        student.firstGrade = scan.nextDouble();
        student.secondGrade = scan.nextDouble();
        student.thirdGrade = scan.nextDouble();

        student.passChecker();

        scan.close();
    }

}
