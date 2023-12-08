package SingleResponsibility.example2.after_apply_it;

import org.apache.commons.validator.EmailValidator;

public class EmailService {
    private String email;

    public EmailService(String email) {
        if (isValidEmailAddress(email))
            this.email = email;

        else {
            System.out.println("enter valid email");
            throw new Error("");
        }
    }

    public boolean isValidEmailAddress(String email) {
        //check email
        return EmailValidator.getInstance().isValid(email);
    }

}
