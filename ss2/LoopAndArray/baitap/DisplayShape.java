package ss2.LoopAndArray.baitap;

import java.util.Scanner;

public class DisplayShape {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while(choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Input length: ");
                    int length = input.nextInt();
                    System.out.println("Input width: ");
                    int width = input.nextInt();
                    System.out.println("Print the rectangle");
                    for (int i = 0; i < width; i++) {
                        for (int j = 0; j < length; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 2:
                    System.out.println("Print the square triangle");
                    System.out.println("Input length: ");
                    int tLength = input.nextInt();
                    for (int i = 0; i < tLength; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    System.out.print("\n");

                    for (int k = 0; k < tLength; k++) {
                        for (int l = tLength; l > k; l--) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }

                    for (int i = 0; i < tLength; i++) {
                        for (int j = 0; j <= tLength; j++) {
                            if (j < (tLength - i)) {
                                System.out.print(" ");
                            } else {
                                System.out.print("*");
                            }
                        }
                        System.out.println("");
                    }
                    System.out.print("\n");


                    for (int i = 0; i < tLength; i++) {
                        for (int j = 0; j < tLength; j++) {
                            if (j <= (i - 1)) {
                                System.out.print(" ");
                            } else {
                                System.out.print("*");
                            }
                        }
                        System.out.print("\n");
                    }
                    break;
                case 3:
                    System.out.println("Print isosceles triangle");
                    int height = input.nextInt();
                    int m = height, n = height;
                    for (int i = 1; i <= height; i++)
                    {
                        for (int j = 1; j <= 2 * height - 1; j++)
                        {
                            if (j >= m && j <= n)
                                System.out.print("*");
                            else
                                System.out.print(" ");
                        }
                        m--;
                        n++;
                        System.out.print("\n");
                    }
                    break;
                case 0:
                    System.exit(1);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
