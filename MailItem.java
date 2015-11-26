
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

    public MailItem(String origen, String destinatario, String contenido){
        from = origen;
        to = destinatario;
        message = contenido;    

    }

    public String getOrigen(){
        return from;
    } 
    
    public String getDestino(){
        return to;
    }
    public String getMensaje(){
        return message;
    }
    
    public void print(){
        System.out.println("De: " + from); 
        System.out.println("Para: " + to );
        System.out.println("Mensaje: " + message );
    }
}
