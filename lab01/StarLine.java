//author: Pham Van Anh 20214988
//6.3: create prj to draw triangle

import java.util.Scanner;

public class StarLine {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //read from user input
        System.out.print("Input n: ");
        int n = scanner.nextInt();
        for (int i = 1; i <=n ; i++ ){
            for (int j = i; j < n ; j++)
                System.out.print(" ");
            for (int j = 1; j <= (2 *i - 1 ); j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        scanner.close();
        System.exit(0);
    }
}

