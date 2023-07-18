
import java.util.InputMismatchException;

import java.util.Scanner;

public class LCM_project { public static void main(String[] args) {
    char checker = 'y';
    Scanner sc = new Scanner(System.in);
    try{
        do {

            System.out.println("Enter the first number");
            int x = (sc.nextInt());
            System.out.println("Enter the second number");
            int y = sc.nextInt();
            if ((x > 0) && (y > 0)) {
                int sonuc = ekokfinder(x, y);
                System.out.println("The answer is:" + sonuc);

            } else {
                System.out.println("Error: Enter Positive Integers");
            }

            System.out.println("Do you want to continue? y/n");
            checker= sc.next().charAt(0);

        } while (checker == 'y');
    }catch (InputMismatchException e) {
        System.out.println("Error: Enter Positive Integers");
    }

}


    public static int ekokfinder(int x, int y) {
        int ekok = 1;


        while(((ekok%x)+(ekok%y))>0){
            ekok = ekok+1;
        }
        return(ekok);
    }
}
