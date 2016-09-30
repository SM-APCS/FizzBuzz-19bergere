/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fizzbuzz;

/**
 *
 * @author Emmett Berger
 * @class AP CSA
 */
public class FizzBuzz {

    public static void main(String[] args) {
    
    // Makes for loop to write numbers 1-100
    for(int x = 1; x <= 100; x++)
    {
        // Looks to see if the number is divisible by 3
        if(x % 3 == 0 && x % 5 == 0)
        {
            // Prints Fizz if the number is divisible by 3
            System.out.println("FizzBuzz");
        }
        // Checks to see if the number is divisible by 5
        // after checking that the number is divisible by 3
        else if(x % 3 == 0)
        {
            // Prints fizzbuzz true
        System.out.println("Fizz");
        }
        //If the number is not divisible by 3 and 5, this checks to 
        // see if the number is divisible by just 5
        else if(x % 5 == 0)
        {
            System.out.println("Buzz");
        }
        else
        {
            //If it is not divisible by 3 or 5 it just prints the number
            System.out.println(x);
        }
    }
   }  
}
    

