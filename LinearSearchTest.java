import javax.swing.JOptionPane;

/**
   This program tests the linear search algorithm.
*/
public class LinearSearchTest
{
   public static void main(String[] args)
   {
	  StopWatch watch = new StopWatch();

      // construct random array
      String size = JOptionPane.showInputDialog("Enter array size: ");
      int m = Integer.parseInt(size);

         int[] a = ArrayUtil.randomIntArray(m, 100);
      ArrayUtil.print(a);
      search searcher = new search(a);

      boolean done = false;
      while (!done)
      {
         String input = JOptionPane.showInputDialog(
            "Enter number to search for, Cancel to quit:");
         if (input == null)
            done = true;
         else
         {
            int n = Integer.parseInt(input);
            watch.start();
            int pos = searcher.LinearSearchInt(n);
            watch.stop();
            if(pos == -1)
            	System.out.println("The number was not found." + " Elapsed Time: " + watch.getElapsedTime() + " milliseconds");
            else
            	System.out.println("Found in position " + (pos + 1) +  " Elapsed Time: " + watch.getElapsedTime() + " milliseconds");
			watch.reset();
         }
      }
      System.exit(0);
   }
}
