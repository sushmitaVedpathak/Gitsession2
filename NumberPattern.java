import java.util.Scanner;

	public class NumberPattern{

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
     int number=sc.nextInt();
     int num=1;
     
             for(int line=1;line<=number; line++){   
                    
                for(int sp=1;sp<=line; sp++){             //Logic
            
                        System.out.print(" "+num++); 

                }           
              
       
            System.out.println();
        }



        }
      }
