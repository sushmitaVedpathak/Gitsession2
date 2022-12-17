import java.util.Scanner;
public class Seperate{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number of two digits");
        int number = sc.nextInt();
       
        
        while(number>0) {
            int digit = number%10;
            number = number/10;

            switch (digit){
            case 0 :  System.out.print("ZERO ");
                    break;
            case 1 : System.out.print("ONE ");
                    break;
            case 2 : System.out.print("TWO ");
                    break;
            case 3 : System.out.print("THREE ");
                    break;
            case 4 : System.out.print("FOUR ");
                    break;
            case 5 : System.out.print("FIVE ");
                    break;
            case 6 : System.out.print("SIX ");
                    break;
            case 7 : System.out.print("SEVEN ");
                    break;
            case 8 : System.out.print("EIGHT ");
                    break;
            case 9 : System.out.print("NINE ");
                    break;
            default:
                    if(number>9){
                        System.out.println(number);
                    }
    
                System.out.println("Invalid Digit");
            }

            
             
        }
    }


}