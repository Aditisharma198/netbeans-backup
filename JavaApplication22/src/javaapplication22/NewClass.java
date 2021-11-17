/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication22;
import java.util.*;
/**
 *
 * @author User
 */
public class NewClass {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);       
        System.out.println("Enter String:");
        char[] letter=sc.nextLine().toCharArray();
        System.out.println("Reverse tring:");
        for(int i=letter.length-1;i>=0;i--){
            System.out.print(letter[i]);
        }
        
    }

}