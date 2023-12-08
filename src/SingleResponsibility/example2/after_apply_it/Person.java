package SingleResponsibility.example2.after_apply_it;

import org.apache.commons.validator.EmailValidator;

public class Person {
    private String name;

    private EmailService email;

    public Person(String name, EmailService email) {
        this.name = name;
       this.email=email;
    }



    public String getName() {
        return name;
    }



    public EmailService getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setEmail(EmailService email) {
        this.email = email;
    }
}
