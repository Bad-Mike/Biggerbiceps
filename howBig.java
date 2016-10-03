package biggerBiceps;

import java.util.Scanner;

/**
 * Created by mike on 03.10.16.
 */
public class howBig {

    public static void main(String[] biceps) {

        Scanner input = new Scanner(System.in);

        System.out.print("How big is you BICEPS?: ");

        int size = input.nextInt();

        if ( size >= 40 ) {
            System.out.println();
            System.out.println("Ohhh thats good man!");
        } else if ( size < 40 ){
            System.out.println();
            System.out.println("Ohh no, thats bad man. You must train more!!!");
        }

        //System.out.println(size);
    }
}
