
/**
 * Write a description of class MailItem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MailItem
{
    // instance variables - replace the example below with your own
    private String from;

    private String to;

    private String message;
    
    private String subject;

    public MailItem(String from, String to, String message, String subject){
        this.from = from;
        this.to = to;
        this.message = message;
        this.subject = subject;

    }

    public String getFrom(){
        return from;
    } 
    
    public String getTo(){
        return to;
    }
    public String getMessage(){
        return message;
    }
    
    public String getSubject(){
        return subject;
    }
    
    public void print(){
        System.out.println("De: " + from); 
        System.out.println("Para: " + to );
        System.out.println("Mensaje: " + message );
        System.out.println("Asunto: " + subject);
    }
}
