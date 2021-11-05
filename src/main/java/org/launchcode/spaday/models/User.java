package org.launchcode.spaday.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {
    @NotBlank(message = "Cannot be blank.")
    @NotNull(message = "Cannot be null.")
    @Size(min = 5, max = 15, message = "Minimum characters must be 5. Max characters must be 15.")
    private String username;

    @Email
    private String email;

    @Size(min = 6, message = "Password must be at least 6 characters.")
    @NotBlank(message = "Cannot be blank.")
    @NotNull(message = "Cannot be null.")
    private String password;

    @Size(min = 6, message = "Password must be at least 6 characters.")
    @NotBlank(message = "Cannot be blank.")
    @NotNull(message = "Cannot be null.")
    private String verify;
    public User() {

    }

    public User(String username, String email, String password, String verify) {
        this();
        this.username = username;
        this.email = email;
        this.password = password;
        this.verify = verify;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getVerify() {
        return verify;
    }

    public void setVerify(String verify) {
        this.verify = verify;
    }
}
