package com.company;

import java.util.ArrayList;

public class search {
    public static ArrayList searchByName(String searchedMovie){
//make a array with the movies
        String[] movieList=file.fileRead("movieList").split(", ");
        ArrayList<Integer> similarityNum=new ArrayList<Integer>();
        //find out how close the words are
        for (int i = 0; i < movieList.length; i++) {
            similarityNum.add(wordAccuracy.word_accuracy(movieList[i],searchedMovie));
        }
        //get the movies sorted
        ArrayList output =sortWithNum(similarityNum,movieList);
        //print the movies
        for (int i = 0; i < output.size(); i++) {
            System.out.println(output.get(i));
        }
        return output;

    }
    //sort movies
    public static ArrayList sortWithNum(ArrayList<Integer> num, String[] movieList){
        ArrayList<Integer> outputNum = new ArrayList();
        ArrayList output=new ArrayList();
        //if nothing added just return
        if (num.size()==0){
            outputNum.add(0);
            return outputNum;
        }
        outputNum.add(num.get(0));
        //sort numbers. Use that to also sort movieList by the numbers
        for (int i = 0; i < num.size(); i++) {
            for (int j = 0; j < outputNum.size(); j++) {
                if (num.get(i)>outputNum.get(j)){
                    outputNum.add(j,num.get(i));
                    output.add(j,movieList[i]);
                    break;
                }
                else if(j+1==outputNum.size()){
                    outputNum.add(j+1,num.get(i));
                    output.add(j,movieList[i]);
                    break;
                }
            }

        }
        //remove the unneccasary stuff
        for (int i = 0; i < output.size(); i++) {
            if (outputNum.get(i)==0){
                outputNum.remove(i);
                output.remove(i);
            }
        }



        return output;
    }
}
