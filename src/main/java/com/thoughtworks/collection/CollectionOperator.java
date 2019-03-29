package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        List<Integer> result = new ArrayList<>();

        if (left<right){
            for (int tem = left;tem<=right;tem++){
                result.add(tem);
            }
        }
        else {
            for (int tem = left;tem>=right;tem--){
                result.add(tem);
            }
        }

       return  result;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<Integer> result = new ArrayList<>();

        if (left<right){
            for (int tem = left;tem<=right;tem++){
                if (tem%2==0){
                    result.add(tem);
                }

            }
        }
        else {
            for (int tem = left;tem>=right;tem--){
                if (tem%2==0){
                    result.add(tem);
                }

            }
        }

        return  result;
    }

    public List<Integer> popEvenElments(int[] array) {
        List<Integer> result = new ArrayList<>();
        for (int tem = 0;tem<array.length;tem++) {
            if (array[tem] % 2 == 0) {
                result.add(array[tem]);
            }

        }
        return  result;
    }

    public int popLastElment(int[] array) {
        return  array[array.length-1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {

        List<Integer> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        for (int i=0;i<firstArray.length;i++){
            temp.add(firstArray[i]);
        }
        for (int i=0;i<secondArray.length;i++){
            if (temp.contains(secondArray[i])){
                result.add(secondArray[i]);
            }
        }

        return  result;
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        List<Integer> result = new ArrayList<>();
       // List<Integer> temp = new ArrayList<>();
        for (int i=0;i<firstArray.length;i++){
            result.add(firstArray[i]);
        }
        for (int i=0;i<secondArray.length;i++){
            if (!result.contains(secondArray[i])){
                result.add(secondArray[i]);
            }
        }
        return  result;
    }
}
