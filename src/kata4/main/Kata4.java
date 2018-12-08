package kata4.main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;

public class Kata4 {
    List<Mail> mailList = new ArrayList<>();
    MailHistogramBuilder mhb = new MailHistogramBuilder();
    Histogram hs;

    public static void main(String[] args) throws IOException {
        Kata4 kata4 = new Kata4();
        kata4.control();
    }
    
    public void control() throws IOException {
        input();
        process();
        output();
    }
    
    public void input() {
        try {
            mailList = new MailListReader().read("email.txt");
        } catch (IOException ex) {
            System.out.println("No se pudo leer el fichero");
        }
    }

    public void process() throws IOException{
        hs = mhb.build(mailList);
    }
    
    public void output() {
        new HistogramDisplay(hs).execute();
    }
    
}