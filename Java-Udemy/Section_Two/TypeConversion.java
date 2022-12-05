public class TypeConversion {
  public static void main(String[] args) {
    
int mobileCost = 3500;

double cost = mobileCost;  // This is called as Widening Type Casting which automatically based on   ///Smaller type to larger type theory. 

double pay = (double) mobileCost; // This is called Narrowing Type Casting Larger to Smaller type. 

System.out.println(cost);
System.out.println(pay);


  }
}



/*
 * Widening Casting : byte -> short -> char -> int -> long -> float -> double [ automatically ]
 * 
 * Narrowing Casting : double -> float -> long -> int -> char -> short -> byte [ Manually ]
 */








