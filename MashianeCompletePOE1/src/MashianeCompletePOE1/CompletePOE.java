package MashianeCompletePOE1;

import javax.swing.JOptionPane;

/**
 *
 * @author Ntokozo Noluthando Mashiane (ST10455454) 
 */
public class CompletePOE {
    public static int options ;
    public static int origNum = 0;
    public static int reportChoice;
 //Create register and login objects
 static Part1 objLogin = new Part1 ();
 static Part2And3 objTask = new Part2And3 ();
 
    public static void main(String[] args) {
        
    // Call a method to get user input
        getRegisterInput(); 
        
    // Call a method to add tasks
       getTaskClass ();
    }
    
   
public static void getRegisterInput (){
        JOptionPane.showMessageDialog(null,"Hi There! \n"+"To register an account, Please follow the instructions.");
        objLogin.setFirstName(JOptionPane.showInputDialog("Please enter your first name : "));
        objLogin.setLastName(JOptionPane.showInputDialog("Please enter your last name : "));
        objLogin.checkUserName();
        objLogin.checkPasswordComplexity();
        objLogin.registerUser();
        objLogin.setLoginUsername(JOptionPane.showInputDialog("To login, please enter your username : ")); 
        objLogin.setLoginPassword(JOptionPane.showInputDialog("To login, please enter your password :"));
        objLogin.loginUser();
        objLogin.returnLoginStatus();  
        
}
public static void getTaskClass (){
       JOptionPane.showMessageDialog(null,"Welcome to EasyKanBan ! ");
     while (options != 8){
    // This code allows the user to make a selection from a numeric menu which I have named ' options'
        options = Integer.parseInt(JOptionPane.showInputDialog("Please select an option then press OK : \n1. Add tasks \n" + "2. Show tasks that are done \n"+"3. Task with longest duration \n"+"4. Search for a task \n"+"5. Search for tasks assigned to developer \n"+"6. Delete a task \n"+"7. Display Report \n"+ "8. Quit"));
           
            try {
        // Handle the user's choice
        switch (options) {
            case 1:
                // Add a new task
                objTask.AddTask();
                break;
            case 2:
                // Display tasks marked as done
                objTask.displayTaskWithDone();
                break;
            case 3:
                // Display the task with the longest duration
                objTask.displayTaskWithLongestDuration();
                break;
            case 4:
                // Prompt the user to enter a task name to search for
                String taskNameSearch = JOptionPane.showInputDialog("Enter task name to search");
                objTask.SearchTaskByTaskName(taskNameSearch);
                break;
            case 5:
                // Prompt the user to enter a developer's name to search for tasks assigned to them
                String developerSearch = JOptionPane.showInputDialog("Enter Developer Name to search");
                objTask.SearchTaskByDeveloper(developerSearch);
                break;
            case 6:
                // Prompt the user to enter a task name to delete
                String taskNameDelete = JOptionPane.showInputDialog("Enter Task Name to Delete");
                objTask.deleteTaskByName(taskNameDelete);
                break;
            case 7:
                // Display a report of tasks
                objTask.displayReport();
                break;
            case 8:
                // Show the total duration of all tasks and exit the application
                JOptionPane.showMessageDialog(null, "Total Task Duration: " + Part2And3.getTotalTaskDuration() + " hours");
                JOptionPane.showMessageDialog(null, "See you soon! \n"+"Bye for now :)");
                System.exit(0);
                break;
            default:
                // Handle invalid menu options
                JOptionPane.showMessageDialog(null, "Invalid Option");
                break;
        }

    } catch (NumberFormatException e) {
        // Handle invalid input format (non-integer values)
        JOptionPane.showMessageDialog(null, "Invalid Option Format");
    }
}
    }
}
   







              
           
    
    
        
    
      