public class WorkBook03 {
  public static void main(String[] args) {
    
  double profit = 0;
  int numberOfCustomers = 0;
  int numberOfApples = 500;
  double costPrice = 0.40;

  numberOfApples -= 4;
  numberOfCustomers++;
  profit = costPrice*4; // This is because 4 apples were bought by 1st Customer. 

  numberOfApples -= 20;
  numberOfCustomers++;
  profit = costPrice*20;

  numberOfApples -= 200;
  numberOfCustomers++;
  profit = costPrice*200;


  System.out.println(numberOfApples);
  System.out.println(numberOfCustomers);
  System.out.println(profit);


  System.out.println("Wow! So far, you made: " + profit);
  System.out.println(numberOfCustomers + " Customers loved your apples.");
  System.out.println("you have " + numberOfApples + " Apples left. we will sell them tomorrow.");


  }
}
