package application;

import java.util.Scanner;

import entities.Rectangle;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Rectangle rec = new Rectangle();

        System.out.println(
                "Enter the height and the width of the rectangle, specifically, each one separated by an enter: ");
        rec.height = scan.nextDouble();
        rec.width = scan.nextDouble();

        System.out.println();
        System.out.println(rec);

        scan.close();
    }
}
