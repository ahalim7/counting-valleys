/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package halim.lessons.countingvalleys;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 *
 * @author AbdElHalim
 */
public class CountingValleys {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        
        int valleys = 0;
        int levels = 0;
        for(char c : s.toCharArray()){
            if(c=='U') levels++;
            else if(c=='D') levels--;
            
            if(levels == 0 && c == 'U'){
                valleys++;
            }
        }
        return valleys;
    }
    
    public static void main(String[] args) throws IOException {
        
        int result = countingValleys(8, "UDDDUDUU");
        System.out.println(result);
    }
}
