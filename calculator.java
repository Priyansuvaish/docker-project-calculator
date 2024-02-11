import java.util.Scanner;

 public class calculator
  {
    public static void main(String args[])
     {
       double a, b, res;
       char choice, ch;
       Scanner scanner = new Scanner(System.in);
	      
      	do
         {
	   System.out.print("Calculator demo\n");
           System.out.print("1. Square Root \n");
           System.out.print("2. Fortorial\n");
           System.out.print("3. Natural Log\n");
           System.out.print("4. Power\n");
           System.out.print("5. Exit\n\n");
           System.out.print("Enter Your Choice : ");
           choice = scanner.next().charAt(0);
           switch(choice)
            {
              case '1' : System.out.print("Enter the number for square root : ");
                         a = scanner.nextDouble();
                    	 System.out.println("Result: " + Math.sqrt(a));
	                 break;															                       
	      case '2' : System.out.print("Enter the number for factorial : ");
	                 a = scanner.nextDouble();
                    	 System.out.println("Result: " + factorial((int)x));
	                 break;
	 
	      case '3' : System.out.print("Enter the number for natural log : ");
	                 a = scanner.nextDouble();
                    	 System.out.println("Result: " + Math.log(x));
	                 break;
	 
	      case '4' : System.out.print("Enter two number for power \n Note: 2 3 mean the 2 power 3 that is 8 : ");
	                 a = scan.nextDouble();
	                 b = scan.nextDouble();
	                 System.out.println("Result: " + Math.pow(x, b));
	                 break;
	 
	      case '5' : System.exit(0);
	                 break;
	
	      default : System.out.print("Wrong Choice!!!");
	                break;
	   }
				System.out.print("\n---------------------------------------\n");
	}while(choice != 5);       
    }
public static long factorial(int number) {
        long result = 1;
        for (int factor = 2; factor <= number; factor++) {
            result *= factor;
        }
        return result;
    }
}
