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
    
    for(int x = 1; x <= 100; x++)
    {
        if(x % 3 == 0)
        {
            System.out.println("Fizz");
            if(x % 5 == 0)
            {
            System.out.println("FizzBuzz");
            }
        }
        
        else if(x % 5 == 0)
        {
            System.out.println("Buzz");
        }
        else
        {
            System.out.println(x);
        }
    }
   }  
}
    

