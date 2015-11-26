
/**
 * Write a description of class MailClient here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MailClient
{
    // instance variables - replace the example below with your own
    private MailServer server;
    private String user;
    public MailClient(MailServer server, String nombreUsuario){
    
    user = nombreUsuario;
    server = server;
    
    }
    
    public MailItem getNextMailItem(){
    
    MailItem correoRecuperado = Integer.toString(correoRecuperado);
    correoRecuperado = user;
    return correoRecuperado;
    
    }
    
    public void printNextMailItem(){
        MailItem correoRecuperado = Integer.toString(correoRecuperado);
        if(correoRecuperado == user){
        System.out.println("El usuario "+ user + "tiene elmensaje "+ correoRecuperado);        
        } else {
        System.out.println("Lo sentimos, su mensaje no ha sido localizado");  
        }
        
    
    }
    
    public void sendMailItem(String destinatario, String mensaje){
        destiantario = "";
        mensaje = "";
        MailItem email;
        String correo = Integer.toString(email);
        correo = " El mensaje " + mensaje + " es para " + destinatario;
        
    }
    
}
