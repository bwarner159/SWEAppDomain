/**
 * 
 */
package photosec;
import java.util.Scanner; // I use scanner because it's command line.

/**
 * @author AJ Maxwell
 *
 */
public class LoginCode 
	{
		public void run() 
		{
			Scanner sc = new Scanner (System.in);
			String user = sc.nextLine();
			String pass = sc.nextLine(); // looks at selected file in scan
			String inpUser = sc.nextLine();
			String inpPass = sc.nextLine(); // gets input from user
	    if (inpUser.equals(user) && inpPass.equals(pass)) {
	        System.out.print("your login message");
	    } else {
	        System.out.print("your error message");
	    }
	}
}
