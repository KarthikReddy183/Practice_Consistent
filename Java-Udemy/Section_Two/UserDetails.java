import java.util.*;

public class UserDetails {
  public static void main(String[] args) {
    
 Scanner sc = new Scanner(System.in);



 System.out.println("Enter your firstName ");
 String fName = sc.nextLine();

 System.out.println("Enter your last name ");
 String lName = sc.nextLine();

 System.out.println("Enter your age ");
 int age = sc.nextInt();
 sc.nextLine();  // This is called as Throwaway nextline. 

 System.out.println("Create a username ");
 String uName = sc.nextLine();

 System.out.println("\nHere is the information you have entered: "); // \n will add a new line. 
 System.out.println("FirstName: " + fName);

 System.out.println("LastName: " + lName);
 System.out.println("Age: " + age);
 System.out.println("UserName: " + uName);

 sc.close();








  }
}
