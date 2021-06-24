package com.company;


public class Count<E> {
    Object[] arr = new Object[0];
    public void add(E a){
        Object[] temp = new Object[arr.length + 1];
        if (arr.length > 0) {
            for (int i = 0; i < arr.length; i++) {
                temp[i] = arr[i];
            }
        }
        temp[arr.length] = a;
        arr = temp;
    }
    public void remove(int index){
        Object[] temp = new Object[arr.length - 1];
        if (arr.length > 0) {
            for (int i = 0; i < temp.length; i++) {
               temp[i] = arr[i];
               if (i >= index)
               temp[i] = arr[i+1];
            }
        }
        arr = temp;
    }
    public void edit(int index, E a){
        Object[] temp;
        temp = arr;
        if (arr.length > 0) {
            for (int i = 0; i < temp.length; i++) {
                temp[i] = arr[i];
                if (i == index)
                    temp[i] = a;
            }
        }
        arr = temp;
    }
    public void show(){
        for (Object a: arr) {
            System.out.println(a);
        }
    }
}
