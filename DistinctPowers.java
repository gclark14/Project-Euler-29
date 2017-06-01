/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euler29java;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author gabriel
 */
public class DistinctPowers {

    BigInteger a = new BigInteger("2");
    BigInteger b = new BigInteger("2");
    BigInteger term = new BigInteger("1");
    
    ArrayList<BigInteger> terms = new ArrayList<BigInteger>();

    DistinctPowers(){
        popList();
        printList();
    }
    
    public void popList(){
        for(int i = 2; i <= 100; i++){
            a = new BigInteger(Integer.toString(i));
            for(int j = 2; j <= 100; j++){
                term = a.pow(j);
                if(!terms.contains(term))
                    terms.add(term);
            }
        }
    }
   
    public void printList(){
        Collections.sort(terms);
        System.out.println("length: " + terms.size());
    }
    
}
