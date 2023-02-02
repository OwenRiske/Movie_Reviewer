//Owen Riske

package com.company;
import java.util.ArrayList;
import java.util.Arrays;


public class wordAccuracy {
    //find out how closely two words are
    public static int word_accuracy(String wordToCheck, String wordForChecking) {
        ArrayList<String> firstInput = new ArrayList<>(Arrays.asList(wordForChecking.split("")));
        ArrayList<String> secondInput = new ArrayList<>(Arrays.asList(wordToCheck.split("")));


        //make the two list's lengths match
        while (firstInput.size()!=secondInput.size()){

            if (firstInput.size()>secondInput.size()){
                secondInput.add("");
            }
            else{
                firstInput.add("");

            }
        }

        //checks if each part of the list match with each other and if they do add 1 to count
        int count = 0;
        for (int i = 0; i < firstInput.size(); i++) {

            if (firstInput.get(i).equalsIgnoreCase(secondInput.get(i))) {
                count += 1;
            }
        }

        //output the percent match of words without the percent sign
        return count*100 / firstInput.size();
    }
}
