package com.example.tutoring_app_project.data;

import com.example.tutoring_app_project.data.model.LoggedInUser;

import java.io.IOException;

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
public class LoginDataSource {

    public Result<LoggedInUser> login(String username, String password) {

        try {
            // TODO: handle loggedInUser authentication
            if (username.equals("student") && password.equals("password")) {
                LoggedInUser student = new LoggedInUser(username, "Student");
                return new Result.Success<>(student);
            }
            else if (username.equals("teacher") && password.equals("password")) {
                LoggedInUser teacher = new LoggedInUser(username, "Teacher");
                return new Result.Success<>(teacher);
            }
            else {
                return new Result.Error(new IOException("Incorrect username or password."));
            }
        } catch (Exception e) {
            return new Result.Error(new IOException("Error logging in", e));
        }
    }

    public void logout() {
        // TODO: revoke authentication
    }
}