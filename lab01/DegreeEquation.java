//Ex6: DegreeEquation.java
//Author: Pham Van Anh 20214988

import javax.swing.JOptionPane;
import java.util.Scanner;
public class DegreeEquation {
    public static void main(String[] args) {
        //key is a number to choose one of tools
        int key;
        System.out.println("List of tools:");
        System.out.println("1. Solve first-order equations\t ax+b=0");
        System.out.println("2. Solve a system of first-order equations\n\t a11x1+a12x2=b1\n\t a21x1+a22x2=b2");
        System.out.println("3. Solve third-order equations\t ax^2+bx+c=0");
        System.out.print("Choose a tool to solve: ");
        Scanner scanner = new Scanner(System.in);
        key = scanner.nextInt();

    //Choose 1: The first-degree equation (linear equation) with one variable ax + b = 0
        if (key == 1) {
            //get input from user
            double a, b;
            System.out.print("Input a = ");
            a = scanner.nextDouble();
            System.out.print("Input b = ");
            b = scanner.nextDouble();

            //if a = 0, b = 0 --> infinite solutions
            if (a == 0 && b == 0) {
                System.out.println("Infinite solutions!");

            //if a= 0, b != 0 --> no solution
            } else if (a == 0 && b != 0) {
                System.out.println("No solution!");

            //if a != 0, b != 0 --> have a solution
            } else {
                double x = -b / a;
                System.out.println("Equation has one solution x= " + x);
            }
        }

    //Choose 2: The system of first-degree equations (linear system) with two variable 𝑎11𝑥1+𝑎12𝑥2=𝑏1 𝑎21𝑥1+𝑎22𝑥2=𝑏2
        if (key == 2) {
            //get input from user
            double a11, a12, a21, a22, b1, b2, d, d1, d2, x1, x2;
            System.out.print("Input a11 = ");
            a11 = scanner.nextDouble();

            System.out.print("Input a12 = ");
            a12 = scanner.nextDouble();

            System.out.print("Input a21 = ");
            a21 = scanner.nextDouble();

            System.out.print("Input a22 = ");
            a22 = scanner.nextDouble();

            System.out.print("Input b1 = ");
            b1 = scanner.nextDouble();

            System.out.print("Input b2 = ");
            b2 = scanner.nextDouble();

            //calculate determinant
            d = a11 * a22 - a21 * a12;
            d1 = b1 * a22 - a12 * b2;
            d2 = a11 * b2 - a21 * b1;

            if (d == 0 && d1 == 0 && d2 == 0) {
                System.out.println("Infinite solutions!");
            } else if (d != 0) {
                x1 = d1 / d;
                x2 = d2 / d;
                System.out.println("The system equation has only solution\n\t x1=" + x1 + "\n\tx2=" + x2);
            } else {
                System.out.println("No solution!");
            }
        }

    //Choose key = 3: The second-degree equation with one variable
        if (key == 3) {
            double a, b, c, x, d, x1, x2;
            //read a
            System.out.print("Input a = ");
            a = scanner.nextDouble();
            //read b
            System.out.print("Input b = ");
            b = scanner.nextDouble();
            //read c
            System.out.print("Input c = ");
            c = scanner.nextDouble();
            if (a == 0) {
                if (b == 0) {
                    //if a = 0, b = 0, c = 0 --> infinite solutions
                    if (c == 0) {
                        System.out.println("Infinite solutions!");
                    //if a = 0, b = 0, c!=0 --> no solution
                    } else
                        System.out.println("No solution!");
                } else {
                    x = -c/b;
                    System.out.println("Only solution x =" + x);
                }
            } else {
                //calculate delta
                double delta = b * b - 4 * a * c;
                x1 = (-b + Math.sqrt(delta)) / a;
                x2 = (-b - Math.sqrt(delta)) / a;
                System.out.println("2 solutions\n\tx1=" + x1 + "\tx2=" + x2);
            }
        }
    }
}

