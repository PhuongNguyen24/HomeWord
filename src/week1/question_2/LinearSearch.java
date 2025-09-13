/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1.question_2;


import java.util.Random;



/**
 *
 * @author Nguyen Phuong
 */
public class LinearSearch {
    
    private int[] array;
    
    public LinearSearch(){
        
    }

    public LinearSearch(int size) {
        this.array = new int[size];
    }
    
    
    public void addArray(int range){
        
        Random random = new Random();
        for(int i =0; i<array.length;i++){
            array[i] = random.nextInt(range);
        }
        
    }
    
    public void displayArray(){
        for(int i =0; i<array.length;i++){
            System.out.print(array[i]+ " ");
        }
    }
    
    public int findElement(int x){
        for(int i = 0; i < array.length; i++){
            if(array[i] == x) return i;
        }
        return -1;
    }
    
    
    
//    
//    public  List<Integer> search(int target, IntPredicate condition){
//        List<Integer> indexList = new ArrayList<>();
//        
//        if( array == null || array.length == 0 ){
//            System.out.println("Array is empty or null");
//           
//        }else{
//            for(int i = 0; i< array.length; i++){
//            if(condition.test(array[i])) indexList.add(i);
//                } 
//            }
//        
//        return indexList;
//        
//        }
//    
    
    
}
