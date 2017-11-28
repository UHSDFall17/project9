import java.io.File;
import java.io.FileInputStream;    
import java.io.IOException;    
import java.util.Scanner;    
 
public class Login{        
	public static String username,password,name,pass;
    public static String LoginAttempt = "Login";
    public static void main(String[] args) throws IOException {
        
    	Scanner s1,s2;											//s1-Read , s2-Input
    	File temp = new File("src/userlogs.txt");
        s1=new Scanner(temp);									// Read UserLog
        s2=new Scanner(System.in);
        
        boolean flag=false;
        
        while(LoginAttempt.equals("Login")) {
        	System.out.println("Enter Username:");
        	name=s2.next();
        
        	System.out.println("Enter Password:");
        	pass=s2.next();
        
        	while(s1.hasNext()) {									//Check if login matches User
        		username=s1.next();									//Read in all User Info
            	password=s1.next();
            	if(name.equals(username) && pass.equals(password)) {//Check if User Info matches
            		System.out.println("You are logged in.");
                	flag=true;										//Return flag true
                	break;			
            	}                
        	}
        	if(!flag) {	
        	System.out.println("Incorrect password.");				//Return incorrect message
        	System.out.println("Please Enter 'Login' to try again or 'Register' to create a new account");
        	LoginAttempt=s2.next();
        	}
        	break;
        }
    }
    
    
    public String LoginAttempt() {
    	return LoginAttempt;
    }
    public String Username() {
    	return name;
    }
    
}
