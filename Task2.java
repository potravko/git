package lesson2;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        //1
        fillValues();
        multiplyBy2 ();
        minMaxValue();
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
            System.out.println(Arrays.toString(arr));

        }
    }


    //2
    public static void fillValues() {
        int[] arr = new int[8];
        int j = 0;
        for (int i = 0; i < arr.length; i++, j = j + 3) {
            arr[i] = j;
        }
        System.out.println(Arrays.toString(arr));

    }

    //3
public static void multiplyBy2 () {
    int [] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    for (int i = 0; i<arr.length; i++) {
        if (arr [i]<6){
            arr [i] = arr [i] * 2;
        }
    }
    System.out.println(Arrays.toString(arr));
}


    public static void minMaxValue(){
        int [] arr = {15,46,85};
        int max = arr[0];
        int min = arr[0];
        for(int i = 0; i != arr.length; i ++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min + " " + max);
    }
}
