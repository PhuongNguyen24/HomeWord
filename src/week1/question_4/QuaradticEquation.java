/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1.question_4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nguyen Phuong
 */
public class QuaradticEquation {

    public List<Double> calculate(double a, double b, double c) {
        List<Double> result = new ArrayList<>();
        if (a == 0) {
            throw new IllegalArgumentException("a must not be 0 for a quadratic equation.");
        }

        double delta = b * b - 4 * a * c;
        double twoA = 2 * a;

        if (delta > 0) {
            double sqrtD = Math.sqrt(delta);
            double x1 = (-b + sqrtD) / twoA;
            double x2 = (-b - sqrtD) / twoA;
            result.add(x1);
            result.add(x2);
              

        } else if (delta == 0) {
            double x = -b / twoA;
            result.add(x);
            
        } else {
            return null;
        }
        return result;
    }
}

//double sqrtAbs = Math.sqrt(-delta);
//            double real = -b / twoA;
//            double unreal = sqrtAbs / twoA;
//            return String.format("Solution: x1 = %.3f + %.3fi and", real, unreal)
//                    + String.format("x2 = %.3f - %.3fi", real, unreal);