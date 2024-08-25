package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {
    private UserList users;


    @BeforeEach
    void init(){
        users = new UserList();
        users.addUser("Pawaret1","2512");
        users.addUser("Pawaret2","25123");
        users.addUser("Pawaret3","251234");
    }

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList

        // TODO: find one of them
        User user = users.findUserByUsername("Pawaret1");

        // TODO: assert that UserList found User
         String expected = "Pawaret1";
         String actual = user.getUsername();
         assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList

        // TODO: change password of one user
        // TODO: assert that user can change password
         assertTrue(users.changePassword("Pawaret1","2512","25123"));
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList

        // TODO: call login() with correct username and password
        User user = users.login("Pawaret1","2512");
        String expected = "Pawaret1";
        String actual = user.getUsername();
        // TODO: assert that User object is found
         assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList

        // TODO: call login() with incorrect username or incorrect password
        User user = users.login("Pawaret1","251234");

        // TODO: assert that the method return null
         assertNull(user);
    }

}