package SingleResponsibility.example1.after_apply_it;

import SingleResponsibility.example1.after_apply_it.EmailService2;
import SingleResponsibility.example1.after_apply_it.Printer;

public class SalesInvoice {

    // create invoice
    //print

    // send email to customer

    public void createInvoice(){
        // create invoice
        Printer.print();
        // send email
        EmailService2.sendEmail();
    }
}
