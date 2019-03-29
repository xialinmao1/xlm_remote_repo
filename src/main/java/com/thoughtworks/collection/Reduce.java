package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Collections;
import java.util.List;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum(){
        Collections.sort(arrayList);
        return arrayList.get(arrayList.size()-1);
    }

    public double getMinimum() {

        Collections.sort(arrayList);
        return arrayList.get(0);
    }

    public double getAverage(){
        double sum =0;
        for (int i=0;i<arrayList.size();i++){
            sum+=arrayList.get(i);
        }
        return sum/arrayList.size();
    }

    public double getOrderedMedian() {
        if (arrayList.size()%2==0){
            int mid = arrayList.size()/2;
            double sum =arrayList.get(mid-1)+arrayList.get(mid);
            return sum/2;
        }
        else {
            return arrayList.get((arrayList.size()-1)/2);
        }
    }

    public int getFirstEven() {
        int result =0;
        for (int i=0;i<arrayList.size();i++){
            if (arrayList.get(i)%2==0){
                result=arrayList.get(i);
                break;
            }
        }
        return result;
    }

    public int getIndexOfFirstEven() {
        int result =0;
        for (int i=0;i<arrayList.size();i++){
            if (arrayList.get(i)%2==0){
                result=i;
                break;
            }
        }
        return result;
    }

    public boolean isEqual(List<Integer> List)
    {
        if (arrayList.size()!=List.size()){
            return false;
        }
        for (int i=0;i<List.size();i++){
            if (arrayList.get(i)!=List.get(i)){
                return false;
            }
        }
        return true;
    }

    public Double getMedianInLinkList(SingleLink singleLink) {
       int size = 0;

       return (Double) singleLink.getNode(6);
//       double result;
//       while (singleLink.getNode(size+1)!=null){
//           size++;
//       }
//       size++;
//       if (size%2==0){
//           double sum = (double)singleLink.getNode(size)+ (double)singleLink.getNode(size-1);
//           result = sum /2;
//       }else {
//           result =  (double)singleLink.getNode((size-1)/2);
//       }
//        return result;
    }

    public int getLastOdd() {
        int result =0;
        for (int i=arrayList.size()-1;i>=0;i--){
            if (arrayList.get(i)%2!=0){
                result=arrayList.get(i);
                break;
            }
        }
        return result;
    }

    public int getIndexOfLastOdd() {
        int result =0;
        for (int i=arrayList.size()-1;i>=0;i--){
            if (arrayList.get(i)%2!=0){
                result=i;
                break;
            }
        }
        return result;
    }
}
