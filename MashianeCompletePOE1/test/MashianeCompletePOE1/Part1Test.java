
package MashianeCompletePOE1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Ntokozo Noluthando Mashaine(ST10455454)
 */
public class Part1Test {
    
    public Part1Test() {
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

    /**
     * Test of getFirstName method, of class Part1.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        Part1 instance = new Part1();
        String expResult = "";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLastName method, of class Part1.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        Part1 instance = new Part1();
        String expResult = "";
        String result = instance.getLastName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getUsername method, of class Part1.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        Part1 instance = new Part1();
        String expResult = "";
        String result = instance.getUsername();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPassword method, of class Part1.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Part1 instance = new Part1();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLoginUsername method, of class Part1.
     */
    @Test
    public void testGetLoginUsername() {
        System.out.println("getLoginUsername");
        Part1 instance = new Part1();
        String expResult = "";
        String result = instance.getLoginUsername();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLoginPassword method, of class Part1.
     */
    @Test
    public void testGetLoginPassword() {
        System.out.println("getLoginPassword");
        Part1 instance = new Part1();
        String expResult = "";
        String result = instance.getLoginPassword();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFirstName method, of class Part1.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String firstName = "";
        Part1 instance = new Part1();
        instance.setFirstName(firstName);
    }

    /**
     * Test of setLastName method, of class Part1.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String lastName = "";
        Part1 instance = new Part1();
        instance.setLastName(lastName);
    }

    /**
     * Test of setUsername method, of class Part1.
     */
    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String username = "";
        Part1 instance = new Part1();
        instance.setUsername(username);
    }

    /**
     * Test of setPassword method, of class Part1.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        Part1 instance = new Part1();
        instance.setPassword(password);
    }

    /**
     * Test of setLoginUsername method, of class Part1.
     */
    @Test
    public void testSetLoginUsername() {
        System.out.println("setLoginUsername");
        String loginUsername = "";
        Part1 instance = new Part1();
        instance.setLoginUsername(loginUsername);
    }

    /**
     * Test of setLoginPassword method, of class Part1.
     */
    @Test
    public void testSetLoginPassword() {
        System.out.println("setLoginPassword");
        String loginPassword = "";
        Part1 instance = new Part1();
        instance.setLoginPassword(loginPassword);
    }

    /**
     * Test of checkUserName method, of class Part1.
     */
    @Test
    public void testCheckUserName() {
        System.out.println("checkUserName");
        Part1 instance = new Part1();
        boolean expResult = true;
        boolean result = instance.checkUserName();
        assertEquals(expResult, result);
    }

    /**
     * Test of checkPasswordComplexity method, of class Part1.
     */
    @Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        Part1 instance = new Part1();
        boolean expResult = false;
        boolean result = instance.checkPasswordComplexity();
        assertEquals(expResult, result);
    }

    /**
     * Test of registerUser method, of class Part1.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        Part1 instance = new Part1();
        String expResult = "";
        String result = instance.registerUser();
        assertEquals(expResult, result);
    }

    /**
     * Test of loginUser method, of class Part1.
     */
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        Part1 instance = new Part1();
        boolean expResult = false;
        boolean result = instance.loginUser();
        assertEquals(expResult, result);
    }

    /**
     * Test of returnLoginStatus method, of class Part1.
     */
    @Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        Part1 instance = new Part1();
        String expResult = "";
        String result = instance.returnLoginStatus();
        assertEquals(expResult, result);
    }
    
}
