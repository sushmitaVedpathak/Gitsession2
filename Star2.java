import java.util.Scanner;

    public class Star2{

        public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number to print star pattern");
        int number = sc.nextInt();


        for(int line=1;line<=number; line++){

            for(int sp=number;sp>=line; sp--){

                System.out.print(" ");

            }
                for(int ast=1;ast<=line;ast++){

                    System.out.print("* ");
            
                }
            System.out.println();

            }
        }
    }

/* Output:

Enter a Number to print star pattern
5
     *
    * *
   * * *
  * * * *
 * * * * *

 */