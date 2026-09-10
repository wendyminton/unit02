/**
 * A drive class that tests the Pair object.
 * @author Wendy-Beth Minton
 */
 public class PairTest
 {
   public static void main(String[] args)
   {
     Pair<Integer> myPair = new Pair<Integer>(5, 7);
     Pair<Integer> myPair2 = new Pair<>(13, 11);
     Pair<String> strPair = new Pair<String> ("Hello", "world");

     System.out.println("myPair = " + myPair);
     System.out.println("myPair2 = " + myPair2);
     System.out.println("strPair = " + strPair);
   }
 }
