package SingleResponsibility.example2.before_apply_it;

import org.apache.commons.validator.EmailValidator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {
    private String name;

    private String email;

    public Person(String name, String email) {
        this.name = name;

        if (isValidEmailAddress(email))
            this.email = email;
        else {
            throw new Error("Invalid Email");
        }
    }

    public boolean isValidEmailAddress(String email) {
       //check email
        return EmailValidator.getInstance().isValid(email);
    }


    public String getName() {
        return name;
    }



    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setEmail(String email) {
        this.email = email;
    }
}
