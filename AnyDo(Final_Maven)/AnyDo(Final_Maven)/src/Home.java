import java.io.*;
import java.lang.*;
import java.util.*;    

public class Home {
	
	private static File userInfo;
	
	public static String ListChoice;//Choice of list
	
	public static void main(String args) throws IOException {
		
	Login login = new Login();
	main mainDriver = new main();
	TaskList tasklist = new TaskList();
	
	// Create File With Username as name
	userInfo = new File("src/"+login.Username()+".txt");
	
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
	Scanner list, input, check, deleteScan;
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
    	//check.close();
	}
	
	//Welcome Message
	System.out.println("----------------------------------------------------------------------");
	System.out.println("Welcome to the homepage " + login.Username());
	System.out.println("----------------------------------------------------------------------");
	
	//Add info from file into list
	while(list.hasNext()) {
		listNames.add(list.next());
	}
	//list.close();
	// user choice
	System.out.println("Please select list to enter, or enter 'Add' to create an additional list or 'Delete' to remove a list");
	System.out.println(listNames);
	ListChoice = input.next();
	
	//Add list
	while(ListChoice.equals("Add") || ListChoice.equals("Delete")){
		
		String newList;
		System.out.println("Please select a name for list");
		newList = input.next();
		if(ListChoice.equals("Add")) {
			printWriter.println(newList);
			listNames.add(newList);
			System.out.println("new list has been added");
			System.out.println("To Add or Delete another enter 'Add' or 'Delete', to enter a list select a list to enter or 'Back' to go back");
			System.out.println(listNames);
		}
		if(ListChoice.equals("Delete")) {
			//remove from file
			removeLineFromFile(newList);
			listNames.remove(newList);
			System.out.println("list has been deleted");
			System.out.println("To Add or Delete another enter 'Add' or 'Delete', to enter a list select a list to enter or 'Back' to go back");
			System.out.println(listNames);
		}
		ListChoice = input.next();	
		if(ListChoice.equals("Back")) {
			break;
		}
		if(!ListChoice.equals("Add")&&!ListChoice.equals("Delete")) {
			System.out.println("To Add or Delete another enter 'Add' or 'Delete', to enter a list select a list to enter");
		}
	}
	printWriter.flush();
	printWriter.close();
	//input.close();
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
	 public static void removeLineFromFile(String lineToRemove) {


	        //if file does not exist, a file is created
		 	System.out.println("remove line called");
	            if (!userInfo.exists()) {
	                try {
	                    userInfo.createNewFile();
	                } catch (IOException e) {
	                    System.out.println("File "+userInfo.getName()+" not created successfully");
	                }
	            }

	            // Construct the new temporary file that will later be renamed to the original
	            // filename.
	            File tempFile = new File(userInfo.getAbsolutePath()+"Temp.txt");
	            System.out.println("temp file is " + tempFile);
	           //Two Embedded Automatic Resource Managers used
	            // to effectivey handle IO Responses
	          try(Scanner scanner = new Scanner(userInfo)) {
	              try (PrintWriter pw = new PrintWriter(new FileWriter(tempFile))) {

	                  //a declaration of a String Line Which Will Be assigned Later
	                  String line;

	                  // Read from the original file and write to the new
	                  // unless content matches data to be removed.
	                  
	                  while (scanner.hasNext()) {
	                      line = scanner.next();
	                      if (!line.trim().equals(lineToRemove)) {

	                          pw.println(line);
	                          pw.flush();
	                      }
	                  }
	                  pw.close();
	                  // Delete the original file
	                  
	                  ///////////////// could read new file, set old file to "" and print to old File ///////////////
	                  //file names userInfo and tempFile
	                  
	                  //Scan in both files
	                  Scanner temp, real;
	                  real = new Scanner(userInfo);
	                  temp = new Scanner(tempFile);
	                  //printWriter real
	              	FileWriter writerReal = new FileWriter(userInfo);
	                BufferedWriter BufferReal = new BufferedWriter(writerReal);
	                PrintWriter printWriterReal = new PrintWriter(BufferReal);
	                  //printWriter temp
	            	FileWriter writerTemp = new FileWriter(userInfo,true);
	                BufferedWriter BufferTemp = new BufferedWriter(writerTemp);
	                PrintWriter printWriterTemp = new PrintWriter(BufferTemp);
	                  //print blank, so userInfo is now blank
	                printWriterReal.println("");
	                printWriterReal.flush();
	                printWriterReal.close();
	                	while(temp.hasNext()) {
	                		printWriterTemp.println(temp.next());
	                	}
	                	printWriterTemp.flush();
	                	printWriterTemp.close();
	              }
	          }
	        catch (IOException e)
	        {
	            System.out.println("IO Exception Occurred");
	        }

	    }
}	





