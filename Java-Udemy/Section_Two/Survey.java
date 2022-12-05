
import java.util.Scanner;
public class Survey {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("what is your name? ");
    String name = sc.nextLine();

    System.out.println("what is your lucky number? ");

    int num = sc.nextInt();

    System.out.println(name + num + sc);

    sc.close();





  }
}





















/*
 * Scanner is used to get the values from user i.e Dynamically 
 * To use Scanner we need to import a package (import java.util.scanner)
 * To use it create a Instance of Scanner : Scanner sc = new Scanner(system.in);
 * 3 rules to create the instance of Scanner [ Variable type variable name = new get value from system ]
 * 
 * We Store the values provided by users inside the variables.
 * int n1 = sc.nextint();
 * double deci = sc.nextdouble();
 * String name = sc.nextline();
 * 
 * If User provides a incorrect value then the app crashes and gives us "TypemismatchException". 
 * 
 * Keeping Scanner open is a memory leak. So close it by using sc.close(); 
 * 
 * /n - creates a New line while printing a Statement. 
 * 
 * To count how many questions we have asked the user, we can create a variable to do it by using 
 * Increment Operation ++ . 
 * 
 */


















