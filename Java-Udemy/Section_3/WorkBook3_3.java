public class WorkBook3_3 {
  public static void main(String[] args) {
    
   int margin = 500;

   if(margin > 500) {
    System.out.println("Alex wins the championship!! ");
   } else if(margin <= 500){
    System.out.println("Alex has secured 2nd position");
   } else if (margin <= 100) {
    System.out.println("Alex has secured 3rd position");
   } else if (margin >= 100) {
    System.out.println("Alex has secured 4rth position");
   } else {
    System.out.println("Peter wins the Championship!!!");
   }



   int gryffindor = 100;    //gryffindor points
   int ravenclaw = 500;    //ravenclaw points

   int pointsMargin = gryffindor-ravenclaw;
   
   if (pointsMargin >= 300) {
       System.out.println("Gryffindor are the champions");
   } else if (pointsMargin >= 0) {
       System.out.println("Gryffindor is in second place");
   } else if (pointsMargin >= -100) {
       System.out.println("Gryffindor is in third place");
   } else {
       System.out.println("Gryffindor is in fourth place");
   }


  }
}
