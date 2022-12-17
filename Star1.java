//import java.util.Scanner;

public class Star1{

    public static void main(String[] args){

  
        for(int line=1;line<=4; line++){

            for(int sp=3;sp>=line; sp--){

                System.out.print(" ");
            }
            for(int ast=1;ast<=line;ast++){

                System.out.print("* ");
            }
            System.out.println();

        	}
        }
    }

    /* output: 

   *
  * *
 * * *
* * * *

*/

