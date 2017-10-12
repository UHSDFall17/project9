package com.sdproject.group9;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String args[]) {

		ArrayList lists = new ArrayList();
		lists.add("All");
		lists.add("To Do");
		lists.add("Grocery");
		lists.add("Add list");

		ArrayList completed = new ArrayList(); // ALL List
		ArrayList ongoing = new ArrayList();
		ArrayList coming = new ArrayList();

		ArrayList TDcompleted = new ArrayList(); // To do list
		ArrayList TDongoing = new ArrayList();
		ArrayList TDcoming = new ArrayList();

		ArrayList Gcompleted = new ArrayList(); // Grocery List
		ArrayList Gongoing = new ArrayList();
		ArrayList Gcoming = new ArrayList();

		completed.add("CompTaskAll"); // Adding default lists to ALL
		ongoing.add("OngoTaskAll");
		coming.add("ComingTaskAll");

		TDcompleted.add("CompTaskToDo"); // Adding default lists to To Do
		TDongoing.add("OngoTaskToDo");
		TDcoming.add("ComingTaskToDo");
		completed.add("CompTaskToDo"); // Adding ToDo lists to ALL
		ongoing.add("OngoTaskToDo");
		coming.add("ComingTaskToDo");

		Gcompleted.add("CompTaskGrocery"); // Adding default lists to Grocery
		Gongoing.add("OngoTaskGrocery");
		Gcoming.add("ComingTaskGrocery");
		completed.add("CompTaskGrocery"); // Adding Grocery lists to ALL
		ongoing.add("OngoTaskGrocery");
		coming.add("ComingTaskGrocery");

		String choiceHome = "home";
		do {
			System.out.println("==========================================================");
			System.out.println("Welcome to Any.Do Demo");
			System.out.println("Please select a List from below");
			System.out.println("=========================================================="); // welcome message, home
																								// setting
			System.out.println(lists);
			System.out.println("==========================================================");

			Scanner reader = new Scanner(System.in); // Setting Reader
			System.out.println("Enter the list you'd like to enter with no space: ");
			String choice = reader.next(); // Getting choice to enter which main list

			if (choice.equalsIgnoreCase("All")) { // Entering ALL List

				String choiceALLLoop = "all";
				do {
					// While(choiceALLLoop="all"){
					System.out.println("==========================================================");
					System.out.println("entered all List");
					System.out.println("==========================================================");
					System.out.println(" completed ");
					System.out.println(completed);
					System.out.println(" ongoing ");
					System.out.println(ongoing);
					System.out.println(" coming");
					System.out.println(coming);
					System.out.println("==========================================================");
					System.out.println(" ");
					System.out.println("To Add a task to list please type - add");
					System.out.println("to Delete from all list please type- del");
					System.out.println("to return please type - return");
					System.out.println("==========================================================");
					String choice2 = reader.next(); // Getting choice of task within All list

					System.out.println("==========================================================");
					/////////////////////////////////////////////////////////////////////////////////////
					if (choice2.equalsIgnoreCase("Add")) { // Add function in all list
						System.out.println("please specify which list to add item to");
						System.out.println(" Completed, ongoing, coming");
						System.out.println("==========================================================");
						String addTaskList = reader.next(); // Choice of list to add to

						if (addTaskList.equalsIgnoreCase("completed")) { // Add to completed list within ALL list
							System.out.println("Please enter task(one word for now)");
							String addtask = reader.next(); // Add Name of Task
							completed.add(addtask); // Added to completed List
							System.out.println("==========================================================");
							System.out.println("Task added, new completed list");
							System.out.println(completed);
							System.out.println("Task added, new ALL list");
							System.out.println(completed);
							System.out.println("==========================================================");
						}
						;
						if (addTaskList.equalsIgnoreCase("ongoing")) { // Add to ongoing list, in all list
							System.out.println("Please enter task(one word for now)");
							String addtask = reader.next();
							completed.add(addtask); // Added task to list
							System.out.println("==========================================================");
							System.out.println("Task added, new ongoing list");
							System.out.println(ongoing);
							System.out.println("Task added, new ALL list");
							System.out.println(ongoing);
							System.out.println("==========================================================");
						}
						;
						if (addTaskList.equalsIgnoreCase("coming")) { // Add to comeing list, in all list
							System.out.println("Please enter task(one word for now)");
							String addtask = reader.next();
							completed.add(addtask); // Added task to list
							System.out.println("==========================================================");
							System.out.println("Task added, new coming list");
							System.out.println(coming);
							System.out.println("Task added, new ALL list");
							System.out.println(coming);
						}
						;

					}
					;
					//////////////////////////////////////////////////////////////////////////////////////
					if (choice2.equalsIgnoreCase("del")) { // Delete task from ALL list
						System.out.println("please specify which list to delete item from");
						System.out.println(" Completed, ongoing, coming");
						System.out.println("==========================================================");
						String listremoveItem = reader.next(); // list to del in ALL list

						if (listremoveItem.equalsIgnoreCase("completed")) {
							System.out.println("please select index of item to remove from list");
							System.out.println(completed);
							int removetask = reader.nextInt();
							completed.remove(removetask - 1);
							System.out.println("==========================================================");
							System.out.println("Task removed, new completed list");
							System.out.println(completed);
							System.out.println("Task removed, new ALL list");
							System.out.println(completed);
							System.out.println("==========================================================");
						}
						;
						if (listremoveItem.equalsIgnoreCase("ongoing")) {
							System.out.println("please select index of item to remove from list");
							System.out.println("==========================================================");
							System.out.println(ongoing);
							int removetask = reader.nextInt();
							completed.remove(removetask - 1);
							System.out.println("==========================================================");
							System.out.println("Task removed, new completed list");
							System.out.println(ongoing);
							System.out.println("Task removed, new ALL list");
							System.out.println(ongoing);
							System.out.println("==========================================================");
						}
						;
						if (listremoveItem.equalsIgnoreCase("coming")) {
							System.out.println("please select index ofitem to remove from list");
							System.out.println("==========================================================");
							System.out.println(coming);
							int removetask = reader.nextInt();
							completed.remove(removetask - 1);
							System.out.println("==========================================================");
							System.out.println("Task removed, new completed list");
							System.out.println(coming);
							System.out.println("Task removed, new ALL list");
							System.out.println(coming);
							System.out.println("==========================================================");
						}
						;

						///////////////////////////////////////////////////////////////////////////////////////////////////////////
					}
					;
					if (choice2.equalsIgnoreCase("return")) {
						break;
						// System.out.println("=========================================================="
						// );
						// System.out.println("Please enter 'home' to return home, or exit to quit");
						// //return home or quit
						// choiceALLLoop= reader.next(); // return to home page
					}
					;// ALL List Return
				} while (choiceALLLoop.equalsIgnoreCase("all"));// End All Loop
			}
			;// End ALL list
			///////////////////////////////////////////////////////////////////////////////////////////////////////////
			//////////////////////////////////////////////////////////////////////////////////////////////////////////
			if (choice.equalsIgnoreCase("ToDo")) {

				String choiceTODOLoop = "TODO";
				do {
					// While(choiceTODOLoop="TODO"){
					System.out.println("==========================================================");
					System.out.println("entered To do List");
					System.out.println("==========================================================");
					System.out.println(" completed ");
					System.out.println(TDcompleted);
					System.out.println(" ongoing ");
					System.out.println(TDongoing);
					System.out.println(" coming");
					System.out.println(TDcoming);
					System.out.println("==========================================================");
					System.out.println(" ");
					System.out.println("To Add a task to list please type - add");
					System.out.println("to Delete from all list please type- del");
					System.out.println("to return please type - return");
					String choice2 = reader.next();
					System.out.println("==========================================================");
					/////////////////////////////////////////////////////////////////////////////////////
					if (choice2.equalsIgnoreCase("Add")) {
						System.out.println("please specify which list to add item to");
						System.out.println(" Completed, ongoing, coming");
						System.out.println("==========================================================");
						String addTaskList = reader.next();

						if (addTaskList.equalsIgnoreCase("completed")) {
							System.out.println("Please enter task(one word for now)");
							System.out.println("==========================================================");
							String addtask = reader.next();
							TDcompleted.add(addtask);
							completed.add(addtask);
							System.out.println("==========================================================");
							System.out.println("Task added, new completed list");
							System.out.println(TDcompleted);
							System.out.println("Task added, new ALL list");
							System.out.println(completed);
						}
						;
						if (addTaskList.equalsIgnoreCase("ongoing")) {
							System.out.println("Please enter task(one word for now)");
							String addtask = reader.next();
							TDcompleted.add(addtask);
							completed.add(addtask);
							System.out.println("==========================================================");
							System.out.println("Task added, new ongoing list");
							System.out.println(TDongoing);
							System.out.println("Task added, new ALL list");
							System.out.println(ongoing);
							System.out.println("==========================================================");
						}
						;
						if (addTaskList.equalsIgnoreCase("coming")) {
							System.out.println("Please enter task(one word for now)");
							System.out.println("==========================================================");
							String addtask = reader.next();
							TDcompleted.add(addtask);
							completed.add(addtask);
							System.out.println("==========================================================");
							System.out.println("Task added, new coming list");
							System.out.println(TDcoming);
							System.out.println("Task added, new ALL list");
							System.out.println(coming);
							System.out.println("==========================================================");
						}
						;

					}
					;
					//////////////////////////////////////////////////////////////////////////////////////
					if (choice2.equalsIgnoreCase("del")) {
						System.out.println("please specify which list to del item from");
						System.out.println(" Completed, ongoing, coming");
						System.out.println("==========================================================");
						String listremoveItem = reader.next();

						if (listremoveItem.equalsIgnoreCase("completed")) {
							System.out.println("please select index of item to remove from list");
							System.out.println("==========================================================");
							System.out.println(completed);
							int removetask = reader.nextInt();
							completed.remove(removetask - 1);
							TDcompleted.remove(removetask - 1);
							System.out.println("==========================================================");
							System.out.println("Task removed, new completed list");
							System.out.println(TDcompleted);
							System.out.println("Task removed, new ALL list");
							System.out.println(completed);
							System.out.println("==========================================================");
						}
						;
						if (listremoveItem.equalsIgnoreCase("ongoing")) {
							System.out.println("please select index of item to remove from list");
							System.out.println("==========================================================");
							System.out.println(ongoing);
							int removetask = reader.nextInt();
							completed.remove(removetask - 1);
							TDcompleted.remove(removetask - 1);
							System.out.println("==========================================================");
							System.out.println("Task removed, new completed list");
							System.out.println(TDongoing);
							System.out.println("Task removed, new ALL list");
							System.out.println(ongoing);
							System.out.println("==========================================================");
						}
						;
						if (listremoveItem.equalsIgnoreCase("coming")) {
							System.out.println("please select index item to remove from list");
							System.out.println("==========================================================");
							System.out.println(coming);
							int removetask = reader.nextInt();
							completed.remove(removetask - 1);
							TDcompleted.remove(removetask - 1);
							System.out.println("==========================================================");
							System.out.println("Task removed, new completed list");
							System.out.println(TDcoming);
							System.out.println("Task removed, new ALL list");
							System.out.println(coming);
							System.out.println("==========================================================");
						}
						;

						//////////////////////////////////////////////////////////////////////////////////////////////////////////
						//////////////////////////////////////////////////////////////////////////////////////
					}
					;
					if (choice2.equalsIgnoreCase("return")) {
						break;
					}
					;// choice2 return

				} while (choiceTODOLoop.equalsIgnoreCase("TODO"));// TODO Loop
			}
			;// End TODO List
				//////////////////////////////////////////////////////////////////////////////////////////
				//////////////////////////////////////////////////////////////////////////////////////////
			if (choice.equalsIgnoreCase("Grocery")) {

				String choiceGroceryLoop = "grocery";
				do {
					// While(choiceGroceryLoop="grocery"){
					System.out.println("==========================================================");
					System.out.println("entered Grocery List");
					System.out.println("==========================================================");
					System.out.println(" completed ");
					System.out.println(Gcompleted);
					System.out.println(" ongoing ");
					System.out.println(Gongoing);
					System.out.println(" coming");
					System.out.println(Gcoming);
					System.out.println("==========================================================");
					System.out.println(" ");
					System.out.println("To Add a task to list please type - add");
					System.out.println("to Delete from all list please type- del");
					System.out.println("to return please type - return");
					String choice2 = reader.next();
					System.out.println("==========================================================");
					/////////////////////////////////////////////////////////////////////////////////////

					if (choice2.equalsIgnoreCase("Add")) {
						System.out.println("please specify which list to add item to");
						System.out.println(" Completed, ongoing, coming");
						System.out.println("==========================================================");
						String addTaskList = reader.next();

						if (addTaskList.equalsIgnoreCase("completed")) {
							System.out.println("Please enter task(one word for now)");
							System.out.println("==========================================================");
							String addtask = reader.next();
							Gcompleted.add(addtask);
							completed.add(addtask);
							System.out.println("==========================================================");
							System.out.println("Task added, new completed list");
							System.out.println(Gcompleted);
							System.out.println("Task added, new ALL list");
							System.out.println(completed);
							System.out.println("==========================================================");
						}
						;
						if (addTaskList.equalsIgnoreCase("ongoing")) {
							System.out.println("Please enter task(one word for now)");
							String addtask = reader.next();
							Gcompleted.add(addtask);
							completed.add(addtask);
							System.out.println("==========================================================");
							System.out.println("Task added, new ongoing list");
							System.out.println(Gongoing);
							System.out.println("Task added, new ALL list");
							System.out.println(ongoing);
							System.out.println("==========================================================");
						}
						;
						if (addTaskList.equalsIgnoreCase("coming")) {
							System.out.println("Please enter task(one word for now)");
							System.out.println("==========================================================");
							String addtask = reader.next();
							Gcompleted.add(addtask);
							completed.add(addtask);
							System.out.println("==========================================================");
							System.out.println("Task added, new coming list");
							System.out.println(Gcoming);
							System.out.println("Task added, new ALL list");
							System.out.println(coming);
							System.out.println("==========================================================");
						}
						;

					}
					;
					//////////////////////////////////////////////////////////////////////////////////////
					if (choice2.equalsIgnoreCase("del")) {
						System.out.println("please specify which list to del item from");
						System.out.println(" Completed, ongoing, coming");
						System.out.println("==========================================================");
						String listremoveItem = reader.next();

						if (listremoveItem.equalsIgnoreCase("completed")) {
							System.out.println("please select index of item to remove from list");
							System.out.println("==========================================================");
							System.out.println(completed);
							int removetask = reader.nextInt();
							completed.remove(removetask - 1);
							Gcompleted.remove(removetask - 1);
							System.out.println("==========================================================");
							System.out.println("Task removed, new completed list");
							System.out.println(Gcompleted);
							System.out.println("Task removed, new ALL list");
							System.out.println(completed);
							System.out.println("==========================================================");
						}
						;
						if (listremoveItem.equalsIgnoreCase("ongoing")) {
							System.out.println("please select index of item to remove from list");
							System.out.println(ongoing);
							int removetask = reader.nextInt();
							completed.remove(removetask - 1);
							Gcompleted.remove(removetask - 1);
							System.out.println("==========================================================");
							System.out.println("Task removed, new completed list");
							System.out.println(Gongoing);
							System.out.println("Task removed, new ALL list");
							System.out.println(ongoing);
						}
						;
						if (listremoveItem.equalsIgnoreCase("coming")) {
							System.out.println("please select index of item to remove from list");
							System.out.println("==========================================================");
							System.out.println(coming);
							int removetask = reader.nextInt();
							completed.remove(removetask - 1);
							Gcompleted.remove(removetask - 1);
							System.out.println("==========================================================");
							System.out.println("Task removed, new completed list");
							System.out.println(Gcoming);
							System.out.println("Task removed, new ALL list");
							System.out.println(coming);
							System.out.println("==========================================================");
						}
						;

					}
					;
					//////////////////////////////////////////////////////////////////////////////////////////////////////////
					//////////////////////////////////////////////////////////////////////////////////////

					if (choice2.equalsIgnoreCase("return")) {
						break;
					}
					;// Grocery choice2 return

					System.out.println("Please enter 'grocery' to return to grocery list, or exit to quit"); // return
																												// home
																												// or
																												// quit
					choiceGroceryLoop = reader.next(); // return to home page
					if (choiceGroceryLoop != "grocery") {
						System.out.println(
								"You have made a mistake, please enter 'grocery' to return home, or exit to quit"); // return
																													// home
																													// or
																													// quit
						choiceGroceryLoop = reader.next();
					}
				} while (choiceGroceryLoop.equalsIgnoreCase("grocery"));// Grocery Loop End
			}
			;// Grocery end

			System.out.println("Please enter 'home' to return home, or exit to quit"); // return home or quit
			choiceHome = reader.next();
			if (choiceHome.equalsIgnoreCase("exit")) {
				System.exit(0);
			}
		} while (choiceHome.equalsIgnoreCase("home"));// While Home loop
	}
}
