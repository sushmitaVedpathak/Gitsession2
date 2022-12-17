import java.util.Scanner;

public class Star3{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number to print star pattern");
        int number = sc.nextInt();
  
        for(int line=1;line<=number; line++){

            for(int sp=0;sp<=line;sp++){

                System.out.print(" ");

            }
            for(int ast=number;ast>=line;ast--){

                System.out.print("* ");

             

            }
            System.out.println();

        }//this program is for reverse star
        }
    }

/*Output:

Enter a Number to print star pattern
4
  * * * *
   * * *
    * *
     *


     */
    