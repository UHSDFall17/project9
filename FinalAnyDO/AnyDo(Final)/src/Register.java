import java.io.*;
import java.lang.*;
import java.util.*;    


public class Register {  


	public static void main(String[] args) throws IOException {
	        
	    	Scanner s1,s2, s3;											//s1-Read for initial print, s2-Input, s3-Read for final print
	    	File temp = new File("src/userlogs.txt");
	        
	        if(temp.exists()==false) {
	        	temp.createNewFile();
	        	System.out.println("File has been created");
	        }
	        else { System.out.println("File userlogs exists"); }
	        //Initial Print
	        FileWriter writer2 = new FileWriter(temp,true); ////////////////////////CHANGE TRUE IF ERROR
	        BufferedWriter Buffer2 = new BufferedWriter(writer2);
	        PrintWriter printWriter2 = new PrintWriter(Buffer2);
	        
	        //write new username and pw into userlogs second print
	        FileWriter writer = new FileWriter(temp,true);
	        BufferedWriter Buffer = new BufferedWriter(writer);
	        PrintWriter printWriter = new PrintWriter(Buffer);
	        
	        s1=new Scanner(temp);									// Read UserLog
	        s2=new Scanner(System.in);
	        s3=new Scanner(temp);									// Scan in info
	        boolean RegisterSuccesful = false;
	        String username, password, name = null, pass = null;
	        
	        while(RegisterSuccesful == false) 
	        {
	        	System.out.println("Enter desired Username:");
	        	name=s2.next();
	        	System.out.println("Enter desired Password:");
	        	pass=s2.next();
    				if(!s1.hasNext()) {										//Initial print if there is none
    					printWriter2.println("Master");
    					printWriter2.println("Password");
    					printWriter2.flush();
    					printWriter2.close();
    					s1.close();
    				}
	        		while(s3.hasNext()) 
	        		{
	        			//Check if login matches User
	        			username=s3.next();									//Read in all User Info
	        			password=s3.next();
	        			if(name.equals(username)) 
	        			{													//Check if User Info matches
	        				System.out.println("Username already in use.");
	        			}
	        			else{
	        				RegisterSuccesful = true;						//break out if name is not on list
	        		        printWriter.println(name);
	        		        printWriter.println(pass);
	        				System.out.println("Registration Succesful");
	        				break;
	        			}
	        		}
	        		
	        }
	        System.out.println("File printed");
	        printWriter.flush();
	        printWriter.close();
	 }



	
}
