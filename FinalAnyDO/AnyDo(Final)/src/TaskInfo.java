import java.io.*;
import java.lang.*;
import java.util.*;  


public class TaskInfo {

	public static String taskChoice;
	
	public static void main(String args) throws IOException {
		
		//Get info from other classes
		Home home = new Home();
		Login login = new Login();
		TaskList taskListInfo = new TaskList();
		Date date = new Date();
		
		String newTaskInfo, newTaskDay, newTaskMonth, newTaskYear;
		String taskInfoChoice;
		//Create list to hold all listNames
		List<String> listTaskInfo = new ArrayList<String>();
		
		// welcome user to task info
		System.out.println("Welcome "+login.Username()+" to "+taskListInfo.taskChoice()+" task info");
		
		//create file for listChoice to store data.
		// Create File With UsernameList as name
		File userInfo = new File("src/" + login.Username() + home.ListChoice() + taskListInfo.taskChoice() +".txt");
		
		// Check if file exists, if not create a file
		if(userInfo.exists()==false) {
	    	userInfo.createNewFile();
	    	System.out.println("File has been created");
	    }
	    else {
	    	System.out.println("File " + login.Username() + home.ListChoice() + " exists");
	    }
		
		// Setup Writer default
		FileWriter writer = new FileWriter(userInfo);
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
		
		if(!check.hasNext()) {   	
			System.out.println("Please Enter a name for the task");
			newTaskInfo = input.next();
			System.out.println("Please Enter year task is due");
			newTaskYear = input.next();
			System.out.println("Please Enter month task is due (format = m, example January would be '1')");
			newTaskMonth = input.next();
			System.out.println("Please Enter Day task is due (Mon = 1, Tues = 2...)");
			newTaskDay = input.next();
			
			printWriter2.println(newTaskInfo);
			printWriter2.println(newTaskDay);
			printWriter2.println(newTaskMonth);
			printWriter2.println(newTaskYear);
			printWriter2.flush();
			printWriter2.close();
		}
		
		//Add info from file into list
		while(list.hasNext()) {
			listTaskInfo.add(list.next());
		}
		
		// user choice
		System.out.println("Please select list to enter, or enter 'Add' to add additional info to task");
		System.out.println(listTaskInfo);
		taskChoice = input.next();
		
		//Add task info
		while(taskChoice.equals("Add")) {
			

			
			if(taskChoice.equals("Add")) {
				
				System.out.println("Please Enter a name for the task");
				newTaskInfo = input.next();
				System.out.println("Please Enter year task is due");
				newTaskYear = input.next();
				System.out.println("Please Enter month task is due (format = m, example January would be '1')");
				newTaskMonth = input.next();
				System.out.println("Please Enter Day task is due (Mon = 1, Tues = 2...)");
				newTaskDay = input.next();
				
				printWriter.println(newTaskInfo);
				printWriter.println(newTaskDay);
				printWriter.println(newTaskMonth);
				printWriter.println(newTaskYear);
				listTaskInfo.add(newTaskInfo);
				System.out.println("new task has been added");
				System.out.println("To Add another task enter 'Add' or select a task to view, or 'exit' to return to task list");
				System.out.println(listTaskInfo);
			}
			//Can Add Delete Func
			taskChoice = input.next();	
		}
		printWriter.flush();
		printWriter.close();
		taskListInfo.main(null);
		/*for(int i=0; i<listTaskInfo.size(); i++) {
			//if equals one of the items in list
			if(newTaskInfo.equals(check.nextLine())) {
				
			}
		}*/
	}
	
}
