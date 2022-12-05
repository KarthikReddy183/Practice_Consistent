public class WorkBook04 {
  public static void main(String[] args) {
    double sales = 3459.023;
    double profit = 89801.98;
    double refund = 998.32;
    double shipping = 22456.767;

    int s = (int) sales;
    int p = (int) profit;
    int r = (int) refund;
    int sp = (int) shipping;


    System.out.println("This month, we have made " + "$" + s + " in sales.");
    System.out.println("Factoring in costs, we made " + "$" + p + " in profit.");
    System.out.println("The refunds are at low " + "$" + r +"." + " This is a good sign!");
    System.out.println("Shipping costs were high. We paid " + "$" + sp + " in shippng");

  }
}
