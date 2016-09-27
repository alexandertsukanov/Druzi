package form;

import constraints.EnglishLanguage;
import constraints.FieldMatch;
import constraints.PasswordStrength;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;



@FieldMatch(first = "password", second = "confirmPassword", message = "The password fields must match")
public class RegistrationForm implements Serializable {
    private static final long serialVersionUID = 185151345117447819L;

    @NotNull
    @Size(max=50)
    @EnglishLanguage(withNumbers=false, withSpechSymbols=false)
    private String firstName;

    @NotNull
    @Size(max=50)
    @EnglishLanguage(withNumbers=false, withSpechSymbols=false)
    private String lastName;


    private String email;

    private String phone;

    @PasswordStrength
    private String password;

    private String confirmPassword;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}