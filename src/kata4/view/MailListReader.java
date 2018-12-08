package kata4.view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kata4.model.Mail;

public class MailListReader {
    public List<Mail> read (String name) throws FileNotFoundException, IOException {
        File file = new File(name);
        FileReader fr = new FileReader(file);
        String mail = "";
        List<Mail> mailList = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(fr)) {
            while((mail=br.readLine()) != null) {
                if (mail.contains("@")) {
                    mailList.add(new Mail(mail));
                }
            }
            br.close();
            fr.close();
        }
        return mailList;
    } 
}