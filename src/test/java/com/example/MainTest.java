package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for the Main class
 */
public class MainTest {
    
    @Test
    @DisplayName("Test main method runs without exception")
    public void testMainMethod() {
        // This test ensures the main method can be called without throwing an exception
        assertDoesNotThrow(() -> {
            Main.main(new String[]{});
        });
    }
}
