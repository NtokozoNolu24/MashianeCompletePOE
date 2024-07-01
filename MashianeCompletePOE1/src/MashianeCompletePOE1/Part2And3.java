//This is part 2 and part 3 of the POE combined
package MashianeCompletePOE1;

import static MashianeCompletePOE1.CompletePOE.objTask;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Ntokozo Noluthando Mashiane (ST10455454)
 */
public class Part2And3 {
    
   // Declare Variables
private ArrayList<String> developers = new ArrayList<>();
private ArrayList<String> taskNames = new ArrayList<>();
private ArrayList<Integer> taskDurations = new ArrayList<>();
private ArrayList<String> taskStatuses = new ArrayList<>();
private static ArrayList<Integer> taskIds = new ArrayList<>();

public static int origNum = 0;
private static int totalTaskDuration = 0;

// Method to add a new task
public void AddTask() {
    String[] statusOptions = {"To Do", "Done", "Doing"};


    // Prompt user for task name
    String taskName = JOptionPane.showInputDialog(null, "Please enter a task name :");

    // Prompt the user for task number with validation
    int taskNum;
    while (true) {
        String taskNumStr = JOptionPane.showInputDialog("Please enter task number");
        try {
            taskNum = Integer.parseInt(taskNumStr);
            if (taskNum >= origNum) {
                origNum = taskNum + 1;
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Invalid task number added");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid Task Number");
        }
    }

    // Prompt user for task description with length validation
    String taskDescription;
      for(int i=0;i<2;i++){
        taskDescription = JOptionPane.showInputDialog("Please enter task description");
        if (taskDescription.length() >= 50) {
            JOptionPane.showMessageDialog(null, "Task description must not exceed 50 characters !");
        } else {
            break;
        }
    }

    // Prompt user for developer details
    String developerDetails = JOptionPane.showInputDialog("Please enter developer details");

    // Prompt user for task duration
    int taskDuration = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter task duration"));

    // Update total task duration
    totalTaskDuration += taskDuration;

    // Generate task ID
    String firstTwoLetters = taskName.substring(0, Math.min(taskName.length(), 2)).toUpperCase();
    String lastThreeLetters = developerDetails.substring(Math.max(0, developerDetails.length() - 3)).toUpperCase();
    String taskId = firstTwoLetters + ":" + taskNum + ":" + lastThreeLetters;

    // Prompt user for task status
    String taskStatus;
    while (true) {
        int choice = JOptionPane.showOptionDialog(null, "Select a Task Status below", "Task Status Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, statusOptions, statusOptions[0]);
        if (choice == -1) {
            JOptionPane.showMessageDialog(null, "Exiting program. Goodbye");
            System.exit(0);
        } else {
            taskStatus = statusOptions[choice];
            break;
        }
    }

    // Add task details to arrays
    developers.add(developerDetails);
    taskNames.add(taskName);
    taskDurations.add(taskDuration);
    taskIds.add(taskNum);
    taskStatuses.add(taskStatus);
}

// Method to display a single task's details
public void Display(String taskName, int taskNum, String taskDescription, String developerDetails, int taskDuration, String taskStatus) {
    String message = "Task Name: " + taskName + "\n"
                   + "Task Number: " + taskNum + "\n"
                   + "Task Description: " + taskDescription + "\n"
                   + "Developer Details: " + developerDetails + "\n"
                   + "Task Duration: " + taskDuration + "\n"
                   + "Task Status: " + taskStatus + "\n";

    JOptionPane.showMessageDialog(null, "Task Details", message, JOptionPane.INFORMATION_MESSAGE);
}

// Method to display tasks with status 'Done'
public void displayTaskWithDone() {
    StringBuilder message = new StringBuilder("Tasks with status 'Done':\n");
    for (int i = 0; i < taskStatuses.size(); i++) {
        if (taskStatuses.get(i).equalsIgnoreCase("Done")) {
            message.append("Developer: ").append(developers.get(i))
                   .append(", Task Name: ").append(taskNames.get(i))
                   .append(", Task Duration: ").append(taskDurations.get(i)).append("\n");
        }
    }
    JOptionPane.showMessageDialog(null, message.toString(), "Tasks Done", JOptionPane.INFORMATION_MESSAGE);
}

// Method to display the task with the longest duration
public void displayTaskWithLongestDuration() {
    int maxDuration = 0;
    for (int i = 1; i < taskDurations.size(); i++) {
        if (taskDurations.get(i) > taskDurations.get(maxDuration)) {
            maxDuration = i;
        }
    }
    String message = "Developer: " + developers.get(maxDuration) + ", Duration: " + taskDurations.get(maxDuration);
    JOptionPane.showMessageDialog(null, message, "Longest Task Duration", JOptionPane.INFORMATION_MESSAGE);
}

// Method to search for tasks by developer
public void SearchTaskByDeveloper(String developer) {
    StringBuilder message = new StringBuilder("Tasks by developer " + developer + ":\n");
    boolean found = false;
    for (int i = 0; i < developers.size(); i++) {
        if (developers.get(i).equalsIgnoreCase(developer)) {
            message.append("Task Name: ").append(taskNames.get(i))
                   .append(", Task Status: ").append(taskStatuses.get(i)).append("\n");
            found = true;
        }
    }
    if (found) {
        JOptionPane.showMessageDialog(null, message.toString(), "Tasks by Developer", JOptionPane.INFORMATION_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(null, "Developer not found", "Search Developer", JOptionPane.INFORMATION_MESSAGE);
    }
}

// Method to search for tasks by task name
public void SearchTaskByTaskName(String taskName) {
    StringBuilder message = new StringBuilder("Tasks with name " + taskName + ":\n");
    boolean found = false;
    for (int i = 0; i < taskNames.size(); i++) {
        if (taskNames.get(i).equalsIgnoreCase(taskName)) {
            message.append("Developer: ").append(developers.get(i))
                   .append(", Task Status: ").append(taskStatuses.get(i)).append("\n");
            found = true;
        }
    }
    if (found) {
        JOptionPane.showMessageDialog(null, message.toString(), "Task Name Search", JOptionPane.INFORMATION_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(null, "No tasks found with name: " + taskName, "Task Name Search", JOptionPane.INFORMATION_MESSAGE);
    }
}

// Method to delete a task by name
public void deleteTaskByName(String taskName) {
    for (int i = 0; i < taskNames.size(); i++) {
        if (taskNames.get(i).equalsIgnoreCase(taskName)) {
            developers.remove(i);
            taskNames.remove(i);
            taskIds.remove(i);
            taskDurations.remove(i);
            taskStatuses.remove(i);
            JOptionPane.showMessageDialog(null, "Task successfully deleted", "Delete Task", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
    }
    JOptionPane.showMessageDialog(null, "Task not found", "Delete Task", JOptionPane.INFORMATION_MESSAGE);
}

// Method to display a report of all tasks
public void displayReport() {
    StringBuilder report = new StringBuilder("All Captured Tasks:\n");
    for (int i = 0; i < taskNames.size(); i++) {
        report.append("Task Name: ").append(taskNames.get(i))
              .append(", Developer: ").append(developers.get(i))
              .append(", Duration: ").append(taskDurations.get(i))
              .append(", Status: ").append(taskStatuses.get(i)).append("\n");
    }
    JOptionPane.showMessageDialog(null, report.toString(), "Task Report", JOptionPane.INFORMATION_MESSAGE);
}

// Method to get the total duration of all tasks
public static int getTotalTaskDuration() {
    return totalTaskDuration;
}
}