//import java.util.Scanner;

public class Star6{

    public static void main(String[] args){
               
                /*int y=1; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number digits");
        int number = sc.nextInt();*/
               

        for(int line=1;line<=4; line++){

            for(int sp=3;sp>=line;sp--){

                System.out.print(" ");

            }
            for(int num=1;num<=line;num++){

             int x=num+line;
              

                  System.out.print(x+" ");//print the number directly 
                   
            
            }
          
               System.out.println();


            /*output:

   2
  3 4
 4 5 6
5 6 7 8 */



        }
        }
    }

