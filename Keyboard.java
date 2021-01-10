// Keyboard Class

import java.util.Scanner;

	public class Keyboard {
    static Scanner keys = new Scanner(System.in);

 		public static String getText(String intro) {
      
      System.out.println(intro);
			String textIn = keys.nextLine();
			return textIn;       
		}// end of getText()

    public static int getInt(String intro) {
			int intIn=0;
			boolean ok=false;
			do {
        System.out.println(intro);
				String intAsString = keys.nextLine();
				try {
					intIn = Integer.parseInt(intAsString);
					ok = true;
				}// end of try
				catch (NumberFormatException e) {
					System.out.println("That was not an Integer!");
				}// end of catch
			} while(!ok); // not an Integer
			return intIn;
		}// end of getInt()

	public static double getReal(String intro) {
			double realIn=0;
			boolean ok = false;
			do {
        System.out.println(intro);
				String realAsString = keys.nextLine();
				try {
					realIn = Double.parseDouble(realAsString);
					ok = true;
				}// end of try
				catch (NumberFormatException e) {
					System.out.println("That is not a real number!");
				}// end of catch
			} while (!ok); // not a Real 
			return realIn;
		}// end of getReal()

} // end class