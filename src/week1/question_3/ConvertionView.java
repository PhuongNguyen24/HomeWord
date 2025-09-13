/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1.question_3;

import Validation.Validator;


/**
 *
 * @author Nguyen Phuong
 */
public class ConvertionView {
    public int selectBase(String msg){
        
        System.out.println("-".repeat(10) + "Menu"+"-".repeat(10));
        System.out.println(msg);
        System.out.println("1. Binary");
        System.out.println("2. Decimal");
        System.out.println("3. Decimal");
        System.out.println("4. Hexadecimal");
        
        int choice = Validator.inputPositiveInt("Enter your choice: ", 1, 4);
        int inputBase = -1;
        switch(choice){
            case 1 -> inputBase = 2;
            case 2 -> inputBase = 8;
            case 3 -> inputBase = 10;
            case 4 -> inputBase = 16;
        }
        return inputBase;
        
    }
    
    public void display(){
        
    }
}
