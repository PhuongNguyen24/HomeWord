/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1.question_1;


import java.util.HashMap;

import java.util.Scanner;


/**
 *
 * @author Nguyen Phuong
 */
public class Main {
    
    
    
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        
        // counting word and character ============================================================================================================================
        TextAnalyzer textAnalyzer = new TextAnalyzer();
        
        System.out.println("Enter your content");
        String inputText = sc.nextLine();
        
        HashMap<String,Integer> wordCountResult = textAnalyzer.countWord(inputText);
        HashMap<String,Integer> characterCountResult = textAnalyzer.countCharacter(inputText);
        
        System.out.println("Your content: " + inputText);
        System.out.println(wordCountResult);
        System.out.println(characterCountResult);
        
       
    }
    
}
