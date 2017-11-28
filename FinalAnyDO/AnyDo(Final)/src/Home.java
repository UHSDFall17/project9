import java.io.*;
import java.lang.*;
import java.util.*;    

public class Home {
	
	public static String ListChoice;//Choice of list
	
	public static void main(String args) throws IOException {
		
	Login login = new Login();
	main mainDriver = new main();
	TaskList tasklist = new TaskList();
	
	// Create File With Username as name
	File userInfo = new File("src/"+login.Username()+".txt");
	
	// Check if file exists, create and add 3 lists if it does not
	if(userInfo.exists()==false) {
    	userInfo.createNewFile();
    	System.out.println("File has been created");
    }
    else {
    	System.out.println("File " + login.Username() + " exists");
    }
	
	// Setup Writer default
	FileWriter writer = new FileWriter(userInfo,true);
    BufferedWriter Buffer = new BufferedWriter(writer);
    PrintWriter printWriter = new PrintWriter(Buffer);
	// Setup Writer initial
	FileWriter writer2 = new FileWriter(userInfo,true);
    BufferedWriter Buffer2 = new BufferedWriter(writer2);
    PrintWriter printWriter2 = new PrintWriter(Buffer2);
    
	//Scan in List and user input
	Scanner list, input, check;
	list = new Scanner(userInfo);
	input = new Scanner(System.in);
	check = new Scanner(userInfo);
	
	//Create list to hold all listNames
	List<String> listNames = new ArrayList<String>();
	
	//Initial Check and print, prints listnames to file
	if(!check.hasNext()) {   	
		printWriter2.println("All");
    	printWriter2.println("PersonalErrands");
    	printWriter2.println("GroceryList");
    	printWriter2.flush();
    	printWriter2.close();
    	check.close();
	}
	
	//Welcome Message
	System.out.println("Welcome to the homepage " + login.Username());
	
	//Add info from file into list
	while(list.hasNext()) {
		listNames.add(list.next());
	}
	
	// user choice
	System.out.println("Please select list to enter, or enter 'Add' to create an additional list or 'Delete' to remove a list");
	System.out.println(listNames);
	ListChoice = input.next();
	
	//Add list
	while(ListChoice.equals("Add")) {
		
		String newList;
		System.out.println("Please select a name for list");
		newList = input.next();
		if(ListChoice.equals("Add")) {
			printWriter.println(newList);
			listNames.add(newList);
			System.out.println("new list has been added");
			System.out.println("To Add another enter 'Add' or select a list to enter");
			System.out.println(listNames);
		}
		/*if(ListChoice.equals("Delete")) {
			//remove from file
			String delete = newList;
			
			listNames.remove(newList);
			System.out.println("list has been deleted");
			System.out.println("To Add or Delete another enter 'Add' or 'Delete' or select a list to enter");
			System.out.println(listNames);
		}*/

		ListChoice = input.next();	
	}
	printWriter.flush();
	printWriter.close();
	// check if listchoice is a legitimate choice, if so go to TaskList.
	for(int i=0; i<listNames.size(); i++) {
		//if equals one of the items in list
		if(ListChoice.equals(listNames.get(i))) {
			tasklist.main(null);
		}
	}

	}
	
	public String ListChoice() {
		return ListChoice;
	}
}	

