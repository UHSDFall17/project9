import java.io.*;
import java.lang.*;
import java.util.*;  


public class TaskList {
	
	public static void main(String args) throws IOException {
		
		Home home = new Home();
		Login login = new Login();
		TaskInfo taskInfo = new TaskInfo();
		
		String taskChoice;
		//Create list to hold all listNames
		List<String> listTasks = new ArrayList<String>();
		
		System.out.println("Welcome "+login.Username()+" to "+home.ListChoice()+" task list");
		//create file for listChoice to store data.
		// Create File With UsernameList as name
		File userInfo = new File("src/" + login.Username() + home.ListChoice() + ".txt");
		
		// Check if file exists, create and add 3 lists if it does not
		if(userInfo.exists()==false) {
	    	userInfo.createNewFile();
	    	System.out.println("File has been created");
	    }
	    else {
	    	System.out.println("File " + login.Username() + home.ListChoice() + " exists");
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
		
		// user choice
		System.out.println("Please select list to enter, or enter 'Add' to create an additional task or 'Delete' to remove a task");
		System.out.println(listTasks);
		taskChoice = input.next();
		
		//Add list
		while(taskChoice.equals("Add")) {
			
			String newTask;
			System.out.println("Please select a name for task");
			newTask = input.next();
			if(taskChoice.equals("Add")) {
				printWriter.println(newTask);
				listTasks.add(newTask);
				System.out.println("new task has been added");
				System.out.println("To Add another task enter 'Add' or select a task to view, or exit");
				System.out.println(listTasks);
			}
			/*if(ListChoice.equals("Delete")) {
				//remove from file
				String delete = newList;
				
				listNames.remove(newList);
				System.out.println("list has been deleted");
				System.out.println("To Add or Delete another enter 'Add' or 'Delete' or select a list to enter");
				System.out.println(listNames);
			}*/

			taskChoice = input.next();	
		}
		printWriter.flush();
		printWriter.close();
		
		for(int i=0; i<listTasks.size(); i++) {
			//if equals one of the items in list
			if(taskChoice.equals(listTasks.get(i))) {
				taskInfo.main(null);
			}
		}
	}
}
