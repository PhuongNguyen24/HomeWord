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
public class TextAnalyzer {

    public TextAnalyzer() {
    }
    
    
    public HashMap<String,Integer> countWord(String inputText){
    
    String[] tokens = inputText.split("[\\s,;.|!]+");
    HashMap<String,Integer> wordCount = new HashMap<>();
    
        for (String token : tokens) {
            wordCount.put(token, wordCount.getOrDefault(token, 0) + 1);
        }
    return wordCount;
    }
    
    public HashMap<String,Integer> countCharacter(String inputText){
    
    String[] tokens = inputText.replaceAll("\\s+", "").split("");
    HashMap<String,Integer> characterCount = new HashMap<>();
    
        for (String token : tokens) {
            characterCount.put(token, characterCount.getOrDefault(token, 0) + 1);
        }
    //Getordefault
    return characterCount;
    }
    
    
}
