package Nov17;

import java.util.Scanner;

class Task

{

	private String task;

	private int priority;

	private static boolean order = true;

	Task()

	{

		task = "none";

		priority = 1;

		Task.order = true;R*

	}

	Task(String task, int priority)

	{

		this.task = task;

		this.priority = priority;

	}

	// getters and setters

	public String getTask() {

		return task;

	}

	public void setTask(String task) {

		this.task = task;

	}

	public int getPriority() {

		return priority;

	}

	public void setPriority(int priority) {

		this.priority = priority;

	}

	public static boolean getOrder() {

		return order;

	}

	public static void setOrder(boolean order) {

		Task.order = order;

	}

	public String toString()

	{

		return this.task + " : " + this.priority;

	}

	public boolean equals(Object obj)

	{

		Task t = (Task) obj;

		return (t.getTask().equals(this.getTask()) && t.getPriority() == this.getPriority());

	}

}

class TaskList

{

	public final int MAX = 20;

	private Task[] list;

	private int count;

	TaskList()

	{

		list = new Task[MAX];

		count = 0;

	}

TaskList(Task[] tasks)

{

// initialize empty list first.

this();

// deep copy.

for(int i=0, count=0;i<tasks.length; i++)

{

list[count] = tasks[i];

}

}

	public int getCount()

	{

		return this.count;

	}

	public void addTask(Task t)

	{

		// to make a copy of the object (deep copy).

		Task taskToBeAdded = new Task(t.getTask(), t.getPriority());

		if (count + 1 < MAX)

		{

			list[count++] = taskToBeAdded;

		}

	}

/**

* Deletes a task at given position.

* No effect when out of index position is given.

* @param position - 1 indexed position

*/

public void deleteTask(int position)

{

if(position <= count)

{

position--; // since arrays are 0 indexed.

for(int i=position+1; i<list.length;i++)

{

list[i-1] = list[i];

}

count--;

}

}

public Task[] sort()

{

Task[] sortedTasks = new Task[count];

// deep clone/copy the existing tasks.

for(int i=0; i<list.length;i++)

{

sortedTasks[i] = new Task(list[i].getTask(), list[i].getPriority());

}

for (int i=0; i<sortedTasks.length;i++)

{

for (int j=0; j<sortedTasks.length;j++)

{

if(Task.getOrder())

{

if(sortedTasks[j].getPriority() > sortedTasks[j+1].getPriority())

{

Task temp = sortedTasks[j];

sortedTasks[j] = sortedTasks[j+1];

sortedTasks[j+1] = temp;

}

}

else

{

if(sortedTasks[j].getPriority() < sortedTasks[j+1].getPriority())

{

Task temp = sortedTasks[j];

sortedTasks[j] = sortedTasks[j+1];

sortedTasks[j+1] = temp;

}

}

}

}

return sortedTasks;

}

	public Task next()

	{

		Task[] sortedTasks = this.sort();

		return sortedTasks[0];

	}

public String toString()

{

// we'll use a string builder since it involves too many appends.

StringBuilder sb = new StringBuilder();

for(int i=0; i<list.length;i++)

{

sb.append((i+1) + ". " + list[i].toString() + "\n");

}

return sb.toString();

}

public boolean equals(Object obj)

{

// first get sorted lists of both.

Task[] currentTasksList = this.sort();

Task[] tasksListToBeCompared = ((TaskList)obj).sort();

// check if their sizes are same.

if(currentTasksList.length != tasksListToBeCompared.length) return false;

// compare each task from both.

for(int i=0; i<tasksListToBeCompared.length;i++)

{

if(!currentTasksList[i].equals(tasksListToBeCompared[i]))

{

return false;

}

}

return true;

}

}

class TaskDriver

{

	private static Scanner sc = new Scanner(System.in);

	private static TaskList taskList = new TaskList();

	private static void printMenu()

	{

		System.out.println();

		System.out.println("1. Print the task list");

		System.out.println("2. Print the number of tasks");

		System.out.println("3. Add a task");

		System.out.println("4. Remove a task");

		System.out.println("5. Print the next task to be done");

		System.out.println("6. Sort the tasks by priority");

		System.out.println("7. Change the priority scale");

		System.out.println("8. Quit");

		System.out.print("Your choice: ");

	}

	private static void addTask()

	{

		System.out.print("Enter task name: ");

		String taskName = sc.nextLine();

		int taskPriority = 1;

		while (true)

		{

			System.out.print("Enter task priority (1-5): ");

			taskPriority = sc.nextInt();

			sc.nextLine();

			if (taskPriority >= 1 && taskPriority <= 5)
				break;

			else
				System.out.println("That's not a valid priority. Please enter again.");

		}

		taskList.addTask(new Task(taskName, taskPriority));

	}

	private static void deleteTask()

	{

		System.out.print("Enter the task # to be removed: ");

		int taskNum = sc.nextInt();

		sc.nextLine();

		taskList.deleteTask(taskNum);

	}

	private static void printSortedTasks()

	{

		Task[] sortedTasks = taskList.sort();

		System.out.println("Sorted tasks are : ");

		for (Task taskInSortedTasks : sortedTasks)

		{

			System.out.println(taskInSortedTasks);

		}

	}

	private static void changeTaskPriorityScale()

	{

		System.out.print("Enter 1 to make 1 highest priority. Anything else will make 5 highest priority: ");

		int priority = sc.nextInt();

		sc.nextLine();

		if (priority == 1)

		{

			Task.setOrder(true);

		}

		else

		{

			Task.setOrder(false);

		}

	}

	private static void printTaskList()

	{

		System.out.println("Task list is: ");

		System.out.println(taskList);

	}

	public static void main(String[] args)

	{

		while (true)

		{

			printMenu();

			int userSelection = sc.nextInt();

			sc.nextLine(); // to skip the new line character

			// validate selection.

			if (userSelection < 1 && userSelection > 8)

			{

				System.out.println("That's not a valid selection. Please try again.");

				continue;

			}

			switch (userSelection)

			{

			case 1:
				printTaskList();

				break;

			case 2:
				System.out.println("Number of tasks: " + taskList.getCount());
				break;

			case 3:
				addTask();

				break;

			case 4:
				deleteTask();

				break;

			case 5:
				System.out.println("Next task to be done is :" + taskList.next());

				break;

			case 6:
				printSortedTasks();

				break;

			case 7:
				changeTaskPriorityScale();

				break;

			case 8:
				return;

			}

		}

	}

}
