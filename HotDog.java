public class HotDog {
   // returns the number of combinations
   public long printMenu( ) {
      // YOUR CODE HERE
      int[] slct = {0,0,0,0,0,0,0,0}; //slct = "Selection" array

      String[] topping = {"ketchup, ","mustard, ","chopped onions, ",
      "tomato wedge, ","sweet relish, ","sport peppers, ","sauerkraut, ", ""}; //"" is a placeholder for no toppings

      String[] pS = {"","","","","","","",""}; //"Print Selection" array

      int itemCount = 0; 
      pS[0]=topping[0];

      System.out.printf("A dog and Bun \n");
      itemCount=itemCount+1;   
      for (int i=1;i<128;i++) {
         slct[0] = slct[0] + 1;
         for (int j=0;j<7;j++) {
            if (slct[j]==2){ //If the slct is already one, set it to zero and change the next slct to +1. (This is binary)
               slct[j]=0;
               slct[j+1]=slct[j+1]+1;
            }
            if (slct[j]==1){
                  pS[j]=topping[j];
               }
               else {
                  pS[j]=topping[7]; //Topping[7] is equivalent to no topping.
               }
         }
         System.out.printf("A dog and Bun with %s%s%s%s%s%s%s \n",
         pS[0],pS[1],pS[2],pS[3],pS[4],pS[5],pS[6]); //Print hot dog combo. 
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