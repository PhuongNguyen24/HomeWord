/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1.question_4;

import Validation.Validator;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nguyen Phuong
 */
public class EquationProgram {

    public void run() {
        LinearEquation linearEquation = new LinearEquation();
        QuaradticEquation quaradticEquation = new QuaradticEquation();
        int choice;
        double a, b, c;
        do {
           
            
            
            List<Double> oddList = new ArrayList<>();
            List<Double> evenList = new ArrayList<>();
            List<Double> perfectSquareList = new ArrayList<>();

            System.out.println("=".repeat(8) + " Equation Program " + "=".repeat(8));
            System.out.println("1. Calculate Superlative Equation");
            System.out.println("2.Calculate Quaradtic Equation");
            System.out.println("3. Exit");
            choice = Validator.inputPositiveInt("Enter your choice", 1, 3);
            switch (choice) {
                case 1 -> {
                    a = Validator.inputDouble("Enter A: ");
                    b = Validator.inputDouble("Enter B: ");

                    List<Double> result = linearEquation.calculate(a, b);

                    if (result == null) {
                        System.out.println("Solution: no solution");
                    } else if (result.isEmpty()) {
                        System.out.println("Solution: infinite solution");
                    } else {
                        System.out.print("Solution: x = " + result.get(0));
                    }

                    System.out.println("");

                    List<Double> numbers = new ArrayList<>();
                    numbers.add(a);
                    numbers.add(b);

                    for (double num : numbers) {

                        if (num % 1 == 0) {
                            int n = (int) num;

                            // Odd / Even
                            if (n % 2 == 0) {
                                evenList.add(num);
                            } else {
                                oddList.add(num);
                            }

                            // Perfect square
                            int sqrt = (int) Math.sqrt(n);
                            if (sqrt * sqrt == n) {
                                perfectSquareList.add(num);
                            }
                        }
                    }

                    if (!oddList.isEmpty()) {
                        System.out.print("Odd Number(s): ");
                        for (int i = 0; i < oddList.size(); i++) {
                            System.out.print(oddList.get(i));
                            if (i < oddList.size() - 1) {
                                System.out.print(", ");
                            }
                        }
                        System.out.println();
                    } else {
                        System.out.print("Odd Number(s): none");
                    }

                    if (!evenList.isEmpty()) {
                        System.out.print("Number is Even: ");
                        for (int i = 0; i < evenList.size(); i++) {
                            System.out.print(evenList.get(i));
                            if (i < evenList.size() - 1) {
                                System.out.print(", ");
                            }
                        }
                        System.out.println();
                    } else {
                        System.out.print("Even Number(s): none");
                    }

                    if (!perfectSquareList.isEmpty()) {
                        System.out.print("Number is Perfect Square: ");
                        for (int i = 0; i < perfectSquareList.size(); i++) {
                            System.out.print(perfectSquareList.get(i));
                            if (i < perfectSquareList.size() - 1) {
                                System.out.print(", ");
                            }
                        }
                        System.out.println();
                    } else {
                        System.out.println("Perfect Square Number(s): none");
                    }
                    System.out.println("=".repeat(8));
                    System.out.println("\n\n");
                }
                case 2 -> {
                    do {
                        a = Validator.inputDouble("Enter A (A != 0): ");
                    } while (a == 0);

                    b = Validator.inputDouble("Enter B: ");
                    c = Validator.inputDouble("Enter C: ");

                    List<Double> result = quaradticEquation.calculate(a, b, c);

                    if (result == null) {
                        System.out.println("Solution: no solution");
                    } else if (result.size() == 1) {
                        System.out.print("Solution: x1 = x2  = " + result.get(0));
                    } else {
                        System.out.print("Solution: x1 = " + result.get(0) + " and x2 = " + result.get(1));
                    }

                    System.out.println("");

                    List<Double> numbers = new ArrayList<>();
                    numbers.add(a);
                    numbers.add(b);
                    numbers.add(c);

                    for (double num : numbers) {

                        if (num % 1 == 0) {
                            int n = (int) num;

                            // Odd / Even
                            if (n % 2 == 0) {
                                evenList.add(num);
                            } else {
                                oddList.add(num);
                            }

                            // Perfect square
                            int sqrt = (int) Math.sqrt(n);
                            if (sqrt * sqrt == n) {
                                perfectSquareList.add(num);
                            }
                        }
                    }

                    if (!oddList.isEmpty()) {
                        System.out.print("Odd Number(s): ");
                        for (int i = 0; i < oddList.size(); i++) {
                            System.out.print(oddList.get(i));
                            if (i < oddList.size() - 1) {
                                System.out.print(", ");
                            }
                        }
                        System.out.println();
                    } else {
                        System.out.print("Odd Number(s): none");
                    }

                    if (!evenList.isEmpty()) {
                        System.out.print("Number is Even: ");
                        for (int i = 0; i < evenList.size(); i++) {
                            System.out.print(evenList.get(i));
                            if (i < evenList.size() - 1) {
                                System.out.print(", ");
                            }
                        }
                        System.out.println();
                    } else {
                        System.out.print("Even Number(s): none");
                    }

                    if (!perfectSquareList.isEmpty()) {
                        System.out.print("Number is Perfect Square: ");
                        for (int i = 0; i < perfectSquareList.size(); i++) {
                            System.out.print(perfectSquareList.get(i));
                            if (i < perfectSquareList.size() - 1) {
                                System.out.print(", ");
                            }
                        }
                        System.out.println();
                    } else {
                        System.out.println("Perfect Square Number(s): none");
                    }
                    System.out.println("=".repeat(8));
                    System.out.println("\n\n");
                }
                default -> {
                    System.out.println("Exiting..");
                }
            }

        } while (choice != 3);

    }
}
