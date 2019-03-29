package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        List<Integer> result = new ArrayList<>();
        for (int i=0;i<array.size();i++){
            result.add(array.get(i)*3);
        }
        return result;
    }

    public List<String> mapLetter() {
        List<String> result = new ArrayList<>();
        for (int i=0;i<array.size();i++){
           result.add(letterList.get(array.get(i)-1));
        }
        return result;
    }

    public List<String> mapLetters() {
        List<String> result = new ArrayList<>();
        for (int i=0;i<array.size();i++){
            int number = array.get(i);
            int  num = number/26;
            int count = number%26;
            if (num==0){
                result.add(letterList.get(count-1));
            }
            else if (count==0){
                String res;
                int tem = num -1;
                if (tem==0){
                    res=letterList.get(letterList.size()-1);
                }
                else {
                    res=letterList.get(num-2)+letterList.get(letterList.size()-1);
                }
                result.add(res);
            }
            else {
                String res = letterList.get(num-1)+letterList.get(count-1);
                result.add(res);
            }
        }

        return result;
    }

    public List<Integer> sortFromBig() {
      //  ArrayList<Integer> result = new ArrayList<>();
         Collections.sort(array);
         Collections.reverse(array);
        return array;
    }

    public List<Integer> sortFromSmall() {
        Collections.sort(array);
        return array;
    }
}
