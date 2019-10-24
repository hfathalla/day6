package day13;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;

public class RemoveVowels {
    public static void main(String[] args) {
    }
        //write a method that would replace every vowel in the string with x.
        //hint you have to use .char
        String a = "TechnoStudy";
        int n = a.length();
        char x = a.charAt(4);
        //input TechnoStudy
        //output TXchXStXdX

     private static void RemoveWovelsSlow() {
       //     String input = "TechnoStudy";
         //   input = input.replaceAll("[eou]", "X");
         //   System.out.println(input);
         //        iWantToCallSomeMethod(a);
//        RemoveWovelsSlow();
         String input = "TechnoStudy";
         int N = input.length();

         //input TechnoStudy
         //output TXchXStXdX
         char x = input.charAt(4);
//        System.out.println("A" + "B");

    }
    static String remVowel(String str)
    {
        Character vowels[] = {'a', 'e', 'i', 'o', 'u','A','E','I','O','U'};

        List<Character> al = Arrays.asList(vowels);

        StringBuffer sb = new StringBuffer(str);

        for (int i = 0; i < sb.length(); i++) {

            if(al.contains(sb.charAt(i))){
                sb.replace(i, i+1, "") ;
                i--;
            }
        }


        return sb.toString();
    }






}
