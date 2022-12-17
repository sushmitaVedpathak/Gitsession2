import java.util.Scanner;

public class Star7{

    public static void main(String[] args){

            Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int number = sc.nextInt();
           int num = 1;

        for(int line=1;line<=number; line++){

              // for(int x=0;x<=number;x++){

                     
              //   }      

                for(int sp=number;sp>=line; sp--){

                    System.out.print(" ");

                      System.out.print(num++ +" "); 

                }
              
              
       
            System.out.println();
        }


        }
    }
/*Output :
Enter number
5

 1  2  3  4  5
 6  7  8  9
 10  11  12
 13  14
 15 */