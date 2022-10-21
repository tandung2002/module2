package ss2.LoopAndArray.baitap;

import java.util.Scanner;

public class MergeArray {
    public static void create_array(int arr[]){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
    }
    public static void display (int arr[]){
        System.out.print("Mang la ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void merge(int arr[],int arr1[],int arr2[]){
        for (int i = 0; i < arr.length; i++) {
            arr2[i]=arr[i];
        }
        int l = 0;
        for (int k = arr.length; k < arr2.length; k++) {
            arr2[k]=arr1[l];
            l++;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr;
        int aSize;
        System.out.print("Enter the first array element ");
        aSize = scanner.nextInt();
        arr = new int[aSize];
        create_array(arr);
        display(arr);
        System.out.println();

        int[] arr1;
        int size1;
        System.out.print("Enter the second array element ");
        size1 = scanner.nextInt();
        arr1 = new int[size1];
        create_array(arr1);
        display(arr1);
        System.out.println();

        int[] arr2;
        int size2 = aSize + size1;
        arr2 = new int[size2];
        merge(arr,arr1,arr2);
        display(arr2);
    }
}
