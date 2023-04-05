package simpleandcomporablenumbers;

import java.util.Scanner;

public class App {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please,enter your number:");
        int eded = sc.nextInt();
        if  (eded == 0 ) {
            System.err.println("It is zero!!!");
        } else if (eded == 1) {
            System.out.println("Number neither simple nor comporble!!!");
        } else if(eded % 2 == 0 || eded % 3 == 0 || eded % 4 == 0 || eded % 5 == 0 || eded % 6 == 0
                || eded % 7 == 0 || eded % 8 == 0 || eded % 9 == 0 || eded % 10 == 0){
            System.out.println("Comporable Number!!!");
        } else  if (eded % 2 != 0 || eded % 3 != 0 || eded % 4 != 0 || eded % 5 != 0 || eded % 6 != 0
                || eded % 7 != 0 || eded % 8 != 0 || eded % 9 != 0 || eded % 10 != 0 && eded % 1 == 0 ||
                eded % eded == 0) {
            System.out.println("Simple Number!!!");
        }
    }
}
