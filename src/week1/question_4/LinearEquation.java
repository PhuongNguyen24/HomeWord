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
public class LinearEquation {
    
    public List<Double> calculate(double a, double b){
        List<Double> result = new ArrayList<>();
        if (a == 0) {
            if (b == 0) {
                return  result; // 0x + 0 = 0
            } else {
                return null; // 0x + b = 0 (b ≠ 0)
            }
        }
        double x = -b / a;
        result.add(x);
        return result;
    }
}
