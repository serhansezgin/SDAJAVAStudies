package nine.two.after;

import java.util.Date;

public class PassBooleanArgument {

    /**
     *  Problem :
     *  Get user from database,
     *  if a request comes from login, then get user with username and password
     *  if a request does not come from login, then just get user with username
     */
}

class UserService{

    private UserDbContext userDbContext = new UserDbContext();

    public void Run()
    {
        UserService userService = new UserService();

        User user = userService.getUser("username", "password", true);
        User anotherUser = userService.getUser("username", null, false);



        User userRefactored = userService.login("username", "password");
        User anotherUserRefactored = userService.getUser("username");


    }

    public User getUser(String username, String password, boolean login)
    {
        if (login)
        {
            // Check if there is a user with the given username and password in db
            // If yes, set the last login date and then return the user.
            User user = userDbContext.findUser(username,password);
            if (user != null)
                user.lastLogin = new Date();
            return user;
        }
        else
        {
            // Check if there is a user with the given username
            // If yes, return it, otherwise return null
            User user = userDbContext.findUser(username);
            return user;
        }
    }

    public User login(String username, String password){
        User user = userDbContext.findUser(username,password);
        if (user != null)
            user.lastLogin = new Date();
        return user;
    }

    public User getUser(String username){
        User user = userDbContext.findUser(username);
        return user;
    }

}

class UserDbContext{

    public User findUser(String username, String password) {
        return new User();
    }

    public User findUser(String username) {
        return new User();
    }
}

class User{

    public Date lastLogin;
}