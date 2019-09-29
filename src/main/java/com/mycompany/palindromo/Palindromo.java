/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.palindromo;

/**
 *
 * @author Armando
 */
public class Palindromo {
    public static boolean probarPalindromo(String s){
        if(s.length() <= 1){
            return true;
        }else{
            if(s.charAt(0) == s.charAt(s.length() - 1)){
                return probarPalindromo(s.substring(1,s.length() - 1 ) );
            }else{
                return false;
            }
        }  
    }
    public static void main(String[] args) {
        String pali = "ABA";
        System.out.println(pali + ": " + probarPalindromo(pali));
        pali = "ABAB";
        System.out.println(pali + ": " + probarPalindromo(pali));
    }
}
