/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.icetask6;
import java.util.Scanner; 
import java.util.regex.*;

/**
 *
 * @author RC_Student_lab
 */
public class ICETASK6 {

    public static void main(String[] args) {
        
    }
    public String countVowels(String sentence){
        
        String countVowels;
       String regex = "aeiou";
       Pattern p = Pattern.compile(regex);
        System.out.println(countVowels.matches(regex));
       
        
    }
}
