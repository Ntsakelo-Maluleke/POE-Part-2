/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class loginTest {
    
    public loginTest() {
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
     * Test of chkLogin method, of class login.
     */
    @Test
    public void testChkLogin() {
        System.out.println("chkLogin");
        String username = "";
        String password = "";
        login instance = new login();
        instance.chkLogin(username, password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isValidUsername method, of class register.
     */
    @Test
    public void testIsValidUsername() {
         login Login = new login();
        assertTrue(Login.isValidUsername("kyl_1"));
        assertFalse(Login.isValidUsername("kyle!!!!!!!!!"));
        
        String expected = "kyl_1";
        String actual = Login.UserName();
        
        assertEquals(expected, actual);
    }

    /**
     * Test of isValidPassword method, of class register.
     */
    @Test
    public void testIsValidPassword() {
        login Login = new login();
        assertTrue(Login.isValidPassword("Ch&&sec@ke99!"));
        assertFalse(Login.isValidPassword("password"));
        
        String expected = "Ch&&sec@ke99!";
        String actual = Login.Pass();
        
        assertEquals(expected, actual);
    }

    /**
     * Test of chats method, of class login.
     */
    @Test
    public void testChats() {
        System.out.println("chats");
        login instance = new login();
        instance.chats();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of register method, of class login.
     */
    @Test
    public void testRegister() {
        System.out.println("register");
        login instance = new login();
        instance.register();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    /**
     * Test of main method, of class login.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        login.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
