public class Star8{

    public static void main(String[] args){
   				
               int x=0;//instance variable         

        for(int line=1;line<=4; line++){

               	for(int sp=3;sp>=line;sp--){

                System.out.print(" ");  
                }  

            for(int num=1;num<=line;num++){ 
                                    
                      x++; 
                      System.out.print(x+" "); 
             }    

             
                System.out.println();
        }


        }
    }


/*Output:     
	1
   2 3
  4 5 6
 7 8 9 10 */
