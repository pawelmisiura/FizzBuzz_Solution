package com.spartaglobal.FizzBuzz_Solution;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzGenerator {

    /*
    * Write a program that prints the numbers from num a to num b. But for multiples of three print "Fizz"
    * instead of the number and for the multiples of five print "Buzz". For numbers which are multiples of both three
    * and five print "FizzBuzz".
     */

    private boolean divisibleBy(int fizzbuzzInt, int divisibleNum){

        return fizzbuzzInt % divisibleNum == 0;

    }

    private List<String> fizzBuzzGenerator(int fizzBuzzStart, int fizzBuzzEnd) {

        List<String> fizzBuzzList = new ArrayList<>();

        for (int i = fizzBuzzStart; i < fizzBuzzEnd + 1; i++) {
            if (divisibleBy(i, 15)){
                fizzBuzzList.add("FizzBuzz");
            }else if(divisibleBy(i, 5)){
                fizzBuzzList.add("Buzz");
            }else if(divisibleBy(i, 3)){
                fizzBuzzList.add("Fizz");
            }else{
                fizzBuzzList.add(String.valueOf(i));
            }
        }

        return fizzBuzzList;
    }

    public void printFizzBuzzList(int fizzBuzzStart, int fizzBuzzEnd){
        List<String> fizzBuzzGenerator= fizzBuzzGenerator(fizzBuzzStart, fizzBuzzEnd);

        for (int i = 0; i < fizzBuzzGenerator.size(); i++) {
            System.out.println(fizzBuzzGenerator.get(i));
        }
    }
}
