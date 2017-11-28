import java.io.*;
import java.lang.*;
import java.util.*;  


public class TaskList {
	
	public static String taskChoice;
	private static File userInfo2;
	
	public static void main(String args) throws IOException {
		
		Home home = new Home();
		Login login = new Login();
		TaskInfo taskInfo = new TaskInfo();
		

		//Create list to hold all listNames
		List<String> listTasks = new ArrayList<String>();
		
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Welcome "+login.Username()+" to "+home.ListChoice()+" task list");
		System.out.println("----------------------------------------------------------------------");
		//create file for listChoice to store data.
		// Create File With UsernameList as name
		userInfo2 = new File("src/" + login.Username() + home.ListChoice() + ".txt");
		
		// Check if file exists, create and add 3 lists if it does not
		if(userInfo2.exists()==false) {
	    	userInfo2.createNewFile();
	    	System.out.println("File has been created");
	    }
	    else {
	    	System.out.println("File " + login.Username() + home.ListChoice() + " exists");
	    }
		
		// Setup Writer default
		FileWriter writer = new FileWriter(userInfo2,true);
	    BufferedWriter Buffer = new BufferedWriter(writer);
	    PrintWriter printWriter = new PrintWriter(Buffer);
		// Setup Writer initial
		FileWriter writer2 = new FileWriter(userInfo2,true);
	    BufferedWriter Buffer2 = new BufferedWriter(writer2);
	    PrintWriter printWriter2 = new PrintWriter(Buffer2);
	    
		//Scan in List and user input
		Scanner list, inputTaskList, check;
		list = new Scanner(userInfo2);
		inputTaskList = new Scanner(System.in);
		check = new Scanner(userInfo2);
		
		//initial print
		if(!check.hasNext()) {   	
			printWriter2.println("Today");
			printWriter2.println("Tomorrow");
			printWriter2.println("Upcoming");
			printWriter2.println("Someday");
	    	printWriter2.flush();
	    	printWriter2.close();
	    	check.close();
		}
		
		//Add info from file into list
		while(list.hasNext()) {
			listTasks.add(list.next());
		}
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Welcome to the Taskpage " + login.Username());
		System.out.println("----------------------------------------------------------------------");
		
		// user choice
		System.out.println("Please select list to enter, or enter 'Add' to create an additional task or 'Delete' to remove a task");
		System.out.println(listTasks);
		taskChoice = inputTaskList.next();
		
		//Add list
		while(taskChoice.equals("Add")||taskChoice.equals("Delete")) {
			
			String newTask;
			System.out.println("Please select a name for task");
			newTask = inputTaskList.next();
			if(taskChoice.equals("Add")) {
				printWriter.println(newTask);
				listTasks.add(newTask);
				System.out.println("new task has been added");
				System.out.println("To Add another task enter 'Add' or select a task to view, or exit to return home");
				System.out.println(listTasks);
			}
			if(taskChoice.equals("Delete")) {
				//remove from file
				removeLineFromFile(newTask);
				listTasks.remove(newTask);
				System.out.println("list has been deleted");
				System.out.println("To Add or Delete another enter 'Add' or 'Delete', to enter a list select a list to enter or 'Back' to go back");
				System.out.println(listTasks);
			}

			taskChoice = inputTaskList.next();	
		}
		printWriter.flush();
		printWriter.close();
		
		for(int i=0; i<listTasks.size(); i++) {
			//if equals one of the items in list
			if(taskChoice.equals(listTasks.get(i))) {
				taskInfo.main(null);
			}
		}
		home.main(null);
	}
	
	public String taskChoice() {
		return taskChoice;
	}
	
	 public static void removeLineFromFile(String lineToRemove) {


	        //if file does not exist, a file is created
		 	System.out.println("remove line called");
	            if (!userInfo2.exists()) {
	                try {
	                    userInfo2.createNewFile();
	                } catch (IOException e) {
	                    System.out.println("File "+userInfo2.getName()+" not created successfully");
	                }
	            }

	            // Construct the new temporary file that will later be renamed to the original
	            // filename.
	            File tempFile = new File(userInfo2.getAbsolutePath()+"Temp.txt");
	            System.out.println("temp file is " + tempFile);
	           //Two Embedded Automatic Resource Managers used
	            // to effectivey handle IO Responses
	          try(Scanner scanner = new Scanner(userInfo2)) {
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
	                  real = new Scanner(userInfo2);
	                  temp = new Scanner(tempFile);
	                  //printWriter real
	              	FileWriter writerReal = new FileWriter(userInfo2);
	                BufferedWriter BufferReal = new BufferedWriter(writerReal);
	                PrintWriter printWriterReal = new PrintWriter(BufferReal);
	                  //printWriter temp
	            	FileWriter writerTemp = new FileWriter(userInfo2,true);
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

