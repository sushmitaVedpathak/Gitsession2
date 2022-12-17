import java.util.Scanner;

public class Star10{

    public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number digits");
        int number = sc.nextInt();


   			int line=1;
            int num=1;
            int sp=0;

//loop 1

            for(  line=1;line<=1;line++){
                for ( sp=number;sp>=line;sp--){
                            System.out.print(" ");
                        }


                    for (num=1;num<=line;num++){

                     System.out.print("* ");
                           
                        }
                           System.out.println();        
                }

//loop2 

                 for(  line=2;line<=2;line++){
                for ( sp=number;sp>=line;sp--){
                            System.out.print(" ");
                        }


                    for ( num=1;num<=line;num++){

                    
                           System.out.print(num+" ");
                           
                        }
                           System.out.println();        
                }
//loop3

                for(  line=3;line<=3;line++){
                for ( sp=number;sp>=line;sp--){
                            System.out.print(" ");
                        }


                    for ( num=1;num<=line;num++){

                      System.out.print("* ");
                           
                        }
                           System.out.println();        
                }
//loop4

                  for(  line=4;line<=4;line++){
                for ( sp=number;sp>=line;sp--){
                            System.out.print(" ");
                        }


                    for (num=1;num<=line;num++){

                      System.out.print(num+" ");
                           
                        }
                           System.out.println();        
                }
            }
        }



/*output: as as Star9

  *
  1 2
 * * *
1 2 3 4
*/