package com.thoughtworks.collection;

//import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder)  {
        int sum =0;
        if (leftBorder>rightBorder){
            int temp = leftBorder;
            leftBorder = rightBorder;
            rightBorder = temp;
        }

          for(int i=leftBorder;i<=rightBorder;i++){
            if (i%2==0){
                sum = sum + i;
            }

          }
       return sum;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
      //throw new NotImplementedException();
        int sum =0;
        if (leftBorder>rightBorder){
            int temp = leftBorder;
            leftBorder = rightBorder;
            rightBorder = temp;
        }

        for(int i=leftBorder;i<=rightBorder;i++){
            if (i%2!=0){
                sum = sum + i;
            }

        }
        return sum;
 }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        //row new NotImplementedException();
        int result = 0;
        for (int i=0;i<arrayList.size();i++){
            result +=arrayList.get(i)*3+2;
        }

        return result;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
      //throw new NotImplementedException();
        List<Integer> result = new ArrayList<>();

        for (int i=0;i<arrayList.size();i++){
            if (arrayList.get(i)%2!=0){
                Integer num = arrayList.get(i)*3+2;
                result.add(num);
            }
            else {
                result.add(arrayList.get(i));
            }
        }
        return result;
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
       //hrow new NotImplementedException();
        int result = 0;
        for (int i=0;i<arrayList.size();i++){
            if (arrayList.get(i)%2!=0) {
                result += arrayList.get(i) * 3 + 5;
            }
        }

        return result;
    }

    public double getMedianOfEven(List<Integer> arrayList) {
      //throw new NotImp
       double result = 0;
       int num = 0;
       int sum = 0;
       for (int i=0;i<arrayList.size();i++){
           if (arrayList.get(i)%2==0){
               sum+=arrayList.get(i);
               num++;
           }
       }
       result = sum / num;
       return result;
    }

    public double getAverageOfEven(List<Integer> arrayList) {
     // throw new NotImplementedException();
        double result = 0;
        int num = 0;
        int sum = 0;
        for (int i=0;i<arrayList.size();i++){
            if (arrayList.get(i)%2==0){
                sum+=arrayList.get(i);
                num++;
            }
        }
        result = sum / num;
        return result;
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
      //throw new NotImplementedException();
        if (specialElment%2!=0){
            return false;
        }
        else {
            return arrayList.contains(specialElment);
        }
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        //row new NotImplementedException();
        List<Integer> result = new ArrayList<>();
        for (int i=0;i<arrayList.size();i++){
            if (arrayList.get(i)%2==0){
                if (!result.contains(arrayList.get(i))){
                    result.add(arrayList.get(i));
                }
            }
        }

        return result;
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
     // throw new NotImplementedException();
        List<Integer> result = new ArrayList<>();
        int point =0;
        for (;point<arrayList.size();point++){
            if (arrayList.get(point)%2==0){
                result.add(arrayList.get(point));
            }
        }

        point--;
        for (;point>=0;point--){
            if (arrayList.get(point)%2!=0){
                result.add(arrayList.get(point));
            }
        }

        return result;
    }

    public List<Integer> getProcessedList(List<Integer> arrayList){
        //row new NotImplementedException();
        List<Integer> result = new ArrayList<>();
        int point = 1;
        for (;point<arrayList.size();point++){
            result.add((arrayList.get(point-1)+arrayList.get(point))*3);
        }

        return result;
    }

}
