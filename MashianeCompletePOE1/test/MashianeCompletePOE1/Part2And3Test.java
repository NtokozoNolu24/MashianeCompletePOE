
package MashianeCompletePOE1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Ntokozo Noluthando Mashaine (ST10455454)
 */
public class Part2And3Test {
    
    public Part2And3Test() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }
 
    //Declaring arrays
    String[]developers={"Mike Smith","Edward Harrison","Samantha Paulson","Glenda Oberholzer"};
    String[]taskNames={"Create Login","Create Add Features","Create Reports","Add Arrays"};
    int[]duration ={5, 8, 2, 11};
    String[]taskStatuses={"To Do","Doing","Done","To do"};
    int size =4;
    
    
    @Test
    public void populateDeveloperArray(){
        
        StringBuilder printArray = new StringBuilder();
        
        for (int i = 0; i < size; i++){
        
        printArray.append(developers[i] + " ");  
    }
    assertEquals("Mike Smith Edward Harrison Samantha Paulson Glenda Oberholzer",printArray.toString());
    }
    /**
     * Test of AddTask method, of class Part2And3.
     */
    @Test
    public void testAddTask() {
        System.out.println("Add Tasks");
        Part2And3 instance = new Part2And3();
        instance.AddTask();
    }
    
    /**
     * Test of Display method, of class Part2And3.
     */
    @Test
    public void testDisplay() {
        System.out.println("Display");
        String taskName = "";
        int taskNum = 0;
        String taskDescription = "";
        String developerDetails = "";
        int taskDuration = 0;
        String taskStatus = "";
        Part2And3 instance = new Part2And3();
        instance.Display(taskName, taskNum, taskDescription, developerDetails, taskDuration, taskStatus);
    }

    /**
     * Test of displayTaskWithDone method, of class Part2And3.
     */
    @Test
    public void testDisplayTaskWithDone() {
       
        System.out.println(developers[3]+taskStatuses[3]);
        Part2And3 instance = new Part2And3();
        instance.displayTaskWithDone();
    }

    /**
     * Test of displayTaskWithLongestDuration method, of class Part2And3.
     */
    @Test
    public void testDisplayTaskWithLongestDuration() {
        System.out.println("displayTaskWithLongestDuration");
        Part2And3 instance = new Part2And3();
        instance.displayTaskWithLongestDuration();
    }

    /**
     * Test of SearchTaskByDeveloper method, of class Part2And3.
     */
    @Test
    public void testSearchTaskByDeveloper() {
        System.out.println("SearchTaskByDeveloper");
        String developer = "";
        Part2And3 instance = new Part2And3();
        instance.SearchTaskByDeveloper(developer);
    }

    /**
     * Test of SearchTaskByTaskName method, of class Part2And3.
     */
    @Test
    public void testSearchTaskByTaskName() {
        System.out.println("SearchTaskByTaskName");
        String taskName = "";
        Part2And3 instance = new Part2And3();
        instance.SearchTaskByTaskName(taskName);
    }

    /**
     * Test of deleteTaskByName method, of class Part2And3.
     */
    @Test
    public void testDeleteTaskByName() {
        System.out.println("deleteTaskByName");
        String taskName = "";
        Part2And3 instance = new Part2And3();
        instance.deleteTaskByName(taskName);
    }

    /**
     * Test of displayReport method, of class Part2And3.
     */
    @Test
    public void testDisplayReport() {
        System.out.println("displayReport");
        Part2And3 instance = new Part2And3();
        instance.displayReport();
    }

    /**
     * Test of getTotalTaskDuration method, of class Part2And3.
     */
    @Test
    public void testGetTotalTaskDuration() {
        System.out.println("getTotalTaskDuration");
        int expResult = 0;
        int result = Part2And3.getTotalTaskDuration();
        assertEquals(expResult, result);
    }
    
}
