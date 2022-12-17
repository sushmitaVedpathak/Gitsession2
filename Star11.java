public class Star11{

    public static void main(String[] args){
   			int line=1;
            int num=1;
            int sp=0;

//loop 1

            for(  line=1;line<=4;line++){
                for ( sp=3;sp>=line;sp--){
                            System.out.print(" ");
                        }


                    for (num=1;num<=line;num++){

                     System.out.print("* ");
                           
                        }
                            System.out.println();   
               //loop2 

                           for ( sp=2;sp>=line;sp--){
                            System.out.print(" ");
                        }


                    for ( num=1;num<=line;num++){

                    
                           System.out.print(num+" ");
                           
                        }

                        System.out.println(); 
                              
                }
            }

            /*
//loop3

                for(  line=3;line<=3;line++){
                for ( sp=3;sp>=line;sp--){
                            System.out.print(" ");
                        }


                    for ( num=1;num<=line;num++){

                      System.out.print("* ");
                           
                        }
                           System.out.println();        
                }
//loop4

                  for(  line=4;line<=4;line++){
                for ( sp=3;sp>=line;sp--){
                            System.out.print(" ");
                        }


                    for (num=1;num<=line;num++){

                      System.out.print(num+" ");
                           
                        }*/
                                 
                }
            
        



/*output: as as Star9

  *
  1 2
 * * *
1 2 3 4
*/