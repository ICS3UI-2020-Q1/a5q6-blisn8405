import java.util.Scanner; 
/**
 *
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
      // create a scanner for user input
Scanner input = new Scanner(System.in);
    //get users number
System.out.println("Please enter a number between 1 and 10");
   int number = input.nextInt(); 
   for(int i = number; i >= 1; i--){
     System.out.println();
     for(int j = number; j >= 1; j--){
       System.out.print("*");

     }
  }
  }
}