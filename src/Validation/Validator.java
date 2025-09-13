package Validation;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Nguyen Phuong
 */
public class Validator {

    static Scanner sc = new Scanner(System.in);

//    public static int checkNum(String prompt){
//        
//    }
    public static int inputPositiveInt(String promt) {

        while (true) {
            try {
                System.out.println(promt);
                int number = Integer.parseInt(sc.nextLine());
                if (number <= 0) {
                    continue;
                }
                return number;
            } catch (NumberFormatException nfe) {
                System.out.println("Please enter a number");
                
            } catch (Exception e) {
                e.printStackTrace();
               
            }
        }
    }
    
    

    public static int inputPositiveInt(String promt, int min, int max) {

        while (true) {
            try {

                System.out.println(promt);
                int number = Integer.parseInt(sc.nextLine());
                if (number <= 0 || number < min || number > max) {
                    System.out.println("Invalid input, please try again.");
                    continue;
                }
                return number;
            } catch (NumberFormatException nfe) {
                System.out.println("Please enter a number");
                
            } catch (Exception e) {
                e.printStackTrace();
                
            }
        }
    }

    public static boolean isValidForBase(String value, int base) {
        if (value == null || value.isEmpty()) {
            return false;
        }

        if (value.startsWith("-") || value.startsWith("+")) {
            value = value.substring(1);
        }

        String pattern = switch (base) {
            case 2 ->
                "[01]+";              // binary
            case 8 ->
                "[0-7]+";             // octal
            case 10 ->
                "\\d+";              // decimal
            case 16 ->
                "[0-9A-Fa-f]+";      // hexadecimal
            default ->
                throw new IllegalArgumentException("Invalid value with  base :" + base);
        };

        return value.matches(pattern);
    }
    
    public static double inputPositiveDouble(String promt, double min, double max) {
        
        while (true) {
            try {

                System.out.println(promt);
                double number = Double.parseDouble(sc.nextLine());
                if (number <= 0.0 || number < min || number > max) {
                    System.out.println("Enter a double number in range "+min+"-"+max);
                    continue;
                }
                return number;
            } catch (NumberFormatException nfe) {
                System.out.println("Please enter a number");
                
            } catch (Exception e) {
                e.printStackTrace();
                
            }
        }
    }
    
    public static double inputPositiveDouble(String promt) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {

                System.out.println(promt);
                double number = Double.parseDouble(sc.nextLine());
                if (number <= 0.0) {
                    continue;
                }
                return number;
            } catch (NumberFormatException nfe) {
                System.out.println("Please enter a number");
                
            } catch (Exception e) {
                e.printStackTrace();
                
            }
        }
    }
    
    public static double inputDouble(String promt) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {

                System.out.println(promt);
                double number = Double.parseDouble(sc.nextLine());
                
                return number;
            } catch (NumberFormatException nfe) {
                System.out.println("Please enter a number");
                
            } catch (Exception e) {
                e.printStackTrace();
                
            }
        }
    }

    public static String inputBase(int base, String msg) {
        String value;
        while (true) {
            System.out.println(msg);
            value = sc.nextLine();
            try {
                if (isValidForBase(value, base)) {
                    break;
                }

            } catch (IllegalArgumentException IAE) {
                System.out.println(IAE.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return value;
    }

    public static boolean isSquareNumber(int number) {
        if (number < 0) {
            return false;
        }
        if (number == 0 || number == 1) {
            return true;
        }
        switch (number % 10) {
            case 2, 3, 7, 8 -> {
                return false;
            }
        }
        for (int i = 4; i * i <= number; i++) {
            if (i * i == number) {
                return true;
            }
        }
        return false;
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static boolean isOdd(int n) {
        return n % 2 != 0;
    }

}
