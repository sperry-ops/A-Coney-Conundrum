public class HotDog {
   // returns the number of combinations
   public long printMenu( ) {
      // YOUR CODE HERE

      int[] selection = {0,0,0,0,0,0,0,0};
      String[] topping = {"","ketchup, ","mustard, ","chopped onions, ",
      "tomato wedge, ","sweet relish, ","sport peppers, ","sauerkraut, "}; //"" is a placeholder for no toppings
      /*
      String top0 = "ketcup,";
      String top1 = "mustard,";
      String top2 = "chopped onions,";
      String top3 = "tomato wedge,";
      String top4 = "sweet relish,";
      String top5 = "sport peppers,";
      String top6 = "sauerkraut,";
      */
      String[] pS = {"","","","","","","",""};
      int itemCount = 0;
      pS[0]=topping[0];

      //Iterates through which toppings to ignore in next combination
      for (int k=0;k<8;k++) {
         //Interates through which toppings are always present for next combination
         for (int j=k;j<7;j++){
         //Iterates through just one of other topping
            for (int i=j;i<8;i++){
               if (k!=i || k!=j || i!=j) { //Filter for repeatable combinations i.e.  222 = 002 : Dog and Bun with just mustard
               pS[i]=topping[i];
               pS[j]=topping[j];
               System.out.printf("A dog and Bun with %s%s%s%s%s%s%s%s %d %d %d\n",
               pS[0],pS[1],pS[2],pS[3],pS[4],pS[5],pS[6],pS[7],k,j,i); //Print hot dog combo.
               pS[i]="";
               itemCount++; //Counts the number of combinations
               }
            }
            for (int i=j) {}//Iterate toppings to remove in the same style as above
         }
         for (int i=0;i<8;i++) {
            pS[i] = ""; //clears printed selection array - this will remove certain toppings 
            //from future combinations when int k increments in the for loop.
            }
      }
      System.out.println(itemCount);


      /*
      if (selection[0] = 1){
         String[0] = top1;
      }
      if (selection[1] = 1){
         String[1] = top1;
      }
      printf("A dog and bun with %s %s %s %s %s %s %s",
      pS[0],pS[1],pS[2],pS[3],pS[4],pS[5],pS[6]);

      return ;
      */
     return 0;
   }
   
   public static void main( String [ ] args ) {
      HotDog obj = new HotDog( );
      long count = obj.printMenu( );
      assert count == 128;
   }
} 

//Array 7 1s or 0s i.e. {1,0,0,1,1,0,1}
/*
hot dog with bun, 99, (always true, so it won't be included in the array)
ketchup, 15
mustard, 17
chopped onions, 20
tomato wedge, 25
sweet relish, 30
sport peppers, 35
sauerkraut, 45
*/

//Iterates starting at {0,0,..0,0} then 1,0,0 then 1,1,0... and so on.
//After array is all 1s, do 0,1,0... then 0,1,1... and repeat for each part

//With Strings corresponding to toppings, printf("Hotdog with %f, %f, %f..." )
//if the value corresponing to the topping in the array of 1s&0s is 0 (false), the string is blank -> ""
//if 1 (true) then ",MyTopping "