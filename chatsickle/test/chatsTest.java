/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author RC_Student_lab
 */
public class chatsTest {
    
     private chats chatInstance;

    @BeforeEach
    public void setup() {
        chatInstance = new chats();
    }

    @Test
    public void testMessIDLength() {
        String id = chatInstance.messID();
        assertNotNull(id, "Message ID should not be null");
        assertEquals(10, id.length(), "Message ID should be 10 digits long");
        assertTrue(id.matches("\\d{10}"), "Message ID should contain only digits");
    }

    @Test
    public void testMessHashFormat() {
        String messageID = "1234567890";
        int messageNumber = 1;
        String messageText = "Hello world";
        String hash = chatInstance.messHash(messageID, messageNumber, messageText);
        String expected = "12:1:HELLOWORLD";
        assertEquals(expected, hash, "Hash format mismatch");
    }

    @Test
    public void testSendTwoMessagesAndCount() {
        String recipient1 = "+27718693002";
        String message1 = "Hi Mike, can you join us for dinner tonight";

        
        String messageID1 = chatInstance.messID();
        String hash1 = chatInstance.messHash(messageID1, 1, message1);
        chatInstance.collectMessages(1, recipient1, hash1);

        String recipient2 = "08575975889";
        String message2 = "Hi Keagan, did you recieve my payment";
        
        String messageID2 = chatInstance.messID();
        String hash2 = chatInstance.messHash(messageID2, 2, message2);
        chatInstance.collectMessages(2, recipient2, hash2);

        
        int totalSent = chatInstance.messTotal();
        assertEquals(2, totalSent, "Expected 2 messages to be sent");
    }
}
