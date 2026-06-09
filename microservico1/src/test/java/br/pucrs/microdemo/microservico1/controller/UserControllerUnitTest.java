package br.pucrs.microdemo.microservico1.controller;

import br.pucrs.microdemo.microservico1.domain.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class UserControllerUnitTest {

    @Test
    void testGetUser() {
        UserController userController = new UserController();
        User result = userController.getUser("Alice", "Bob");

        assertNotNull(result);
        assertEquals("AliceAlice", result.getFirstName());
        assertEquals("BobBob", result.getLastName());
    }
}
