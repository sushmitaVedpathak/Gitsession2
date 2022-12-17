public class Star9{

    public static void main(String[] args){
   			int line=1;                        
//loop 1

            for( int line=1;line<=1;line++){
                for (int sp=3;sp>=line;sp--){
                            System.out.print(" ");
                        }


                    for (int num=1;num<=line;num++){

                     System.out.print("* ");
                           
                        }
                           System.out.println();        
                }

//loop2 

                 for( int line2=2;line2<=2;line2++){
                for (int sp2=3;sp2>=line2;sp2--){
                            System.out.print(" ");
                        }


                    for (int num2=1;num2<=line2;num2++){

                    
                           System.out.print(num2+" ");
                           
                        }
                           System.out.println();        
                }
//loop3

                for( int line3=3;line3<=3;line3++){
                for (int sp3=3;sp3>=line3;sp3--){
                            System.out.print(" ");
                        }


                    for (int num3=1;num3<=line3;num3++){

                      System.out.print("* ");
                           
                        }
                           System.out.println();        
                }
//loop4

                  for( int line4=4;line4<=4;line4++){
                for (int sp4=3;sp4>=line4;sp4--){
                            System.out.print(" ");
                        }


                    for (int num4=1;num4<=line4;num4++){

                      System.out.print(num4+" ");
                           
                        }
                           System.out.println();        
                }


/*output: 

  *
  1 2
 * * *
1 2 3 4
*/