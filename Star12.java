public class Star12{

 static int num=0;
  static int ast=0;



    public static void main(String[] args){
              int line=1;
                int sp=0;

            Star12 t1=new Star12();
            Star12 t2=new Star12();
            t2.ast=t1.num;        

            for( line=1;line<=4;line++){
                for(sp=3;sp>=4;sp--){
                      System.out.print(" ");
                    }
                    
                    for (ast=1;ast<=line;ast++){
                            
                     System.out.print("* ");
    
                        }

                        for (num=2;num<=line;num++){
                
                     System.out.print(t1.num+" ");
                                          
                        }
                            System.out.println();   

                        }//1st for loop closed



                    }//main closed
                }//class closed