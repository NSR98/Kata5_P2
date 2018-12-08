package kata4.model;

public class Mail {
    String mail;
    
    public Mail (String mail) {
        this.mail = mail;
    }
    
    public String getDomain (){
        if(mail.contains("@")) {
            return mail.substring(mail.indexOf("@")+1);
        }
        return "";
    }
}