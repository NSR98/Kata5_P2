package kata4.view;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;

public class MailHistogramBuilder {
    private static Histogram<String> histogram = new Histogram();
    
    public Histogram<String> build (List<Mail> mailList) throws IOException {
        mailList.forEach((mail) -> {
            histogram.increment(mail.getDomain());
        });
        return histogram;
    }

    public MailHistogramBuilder() {
        
    }

}