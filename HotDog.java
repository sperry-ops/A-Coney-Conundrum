public class HotDog {
   // returns the number of combinations
   public long printMenu( ) {
      // YOUR CODE HERE
      int[] slct = {0,0,0,0,0,0,0,0}; //slct = "Selection" array

      String[] topping = {"Ketchup, ","Mustard, ","Chopped Onions, ",
      "Tomato Wedge, ","Sweet Relish, ","Sport Peppers, ","Sauerkraut, ", ""}; //"" is a placeholder for no toppings
      double[] tprice = {0.15, 0.17, 0.20, 0.25, 0.30, 0.35, 0.45}; //Topping prices

      String[] pS = {"","","","","","","",""}; //"Print Selection" array

      int itemCount = 0; 
      pS[0]=topping[0];
      int plength = 20;
      int pspace = 106;
      double totalp = 0.99;

      System.out.printf("A Dog and Bun %"+pspace+".2f\n", totalp);
      itemCount=itemCount+1;   
      for (int i=1;i<128;i++) {
         plength = 0;
         pspace = 0;
         totalp = 0.99;
         slct[0] = slct[0] + 1;
         for (int j=0;j<7;j++) {
            if (slct[j]==2){ //If the slct is already one, set it to zero and change the next slct to +1. (This is binary)
               slct[j]=0;
               slct[j+1]=slct[j+1]+1;
            }
            if (slct[j]==1){
                  pS[j]=topping[j];
                  totalp = totalp + tprice[j];
               }
               else {
                  pS[j]=topping[7]; //Topping[7] is equivalent to no topping.
               }
            plength = plength + pS[j].length();
            
         }
         pspace = 100 - plength;
         
         System.out.printf("A dog and Bun with %s%s%s%s%s%s%s %"+pspace+".2f \n", 
         pS[0],pS[1],pS[2],pS[3],pS[4],pS[5],pS[6], totalp); //Print hot dog combo. 
         itemCount=itemCount+1;     
      }
      System.out.printf("Number of items on the menu: %d \n", itemCount);
      return itemCount;
   }
   
   public static void main( String [ ] args ) {
      HotDog obj = new HotDog( );
      long count = obj.printMenu( );
      assert count == 128;
   }
} 