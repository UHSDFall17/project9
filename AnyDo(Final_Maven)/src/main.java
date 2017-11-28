import java.io.IOException;
import java.util.*;

public class main {
	
	public static void main(String[] args) throws IOException {
		
	    Login login = new Login();
	    Register register = new Register();
	    Home home = new Home();
		
		Scanner input = new Scanner(System.in);
	    String LoginOrRegister = null;
	    
	    // Login/Register Sequence
	    System.out.println("Would you like to Log in or Register");
	    System.out.println("Enter: 'Login' or 'Register'");
	    LoginOrRegister = input.next();
	    
	    boolean LoggedIn = false;
	    
	    while(LoggedIn != true){
	    	if(LoginOrRegister.equals("Login")) {
	    		login.main(null);
	    		LoggedIn=true;
	    	}
	    	if(LoginOrRegister.equals("Register") || login.LoginAttempt().equals("Register")) {
	    		Login loginR = new Login();
	    		register.main(null);
	    		loginR.main(null);
	    		LoggedIn=true;
	    	}
	    }

		//	HomePage Sequence
	   
		home.main(null);
		
	}
}
