
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
    private MailItem ultimoMensaje;

    public MailClient(MailServer server, String user){

        this.server = server;
        this.user = user;
        ultimoMensaje = null;

    }

    public MailItem getNextMailItem(){
        MailItem correo = null;
        if(server.howManyMailItems(user) >0){
            ultimoMensaje = server.getNextMailItem(user);
            correo = ultimoMensaje;
        }
        return correo;

    }

    public void printNextMailItem(){
        MailItem mensaje = getNextMailItem();

        if(mensaje != null){
            mensaje.print();

        }
        else{
            System.out.println("No tiene mensajes");
        }

    }

    public void sendMailItem(String to, String mensajeEnviado, String asunto){
        MailItem mensaje = new MailItem(user,to,mensajeEnviado,asunto);
        server.howManyMailItems(user);
        server.post(mensaje);

    }
    public MailItem  getNextMailItemAndAutorespond(String to, String mensajeEnviado, String asunto){
        MailItem mensaje = new MailItem(user,to,mensajeEnviado,asunto);
        server.getNextMailItem(user);
        server.post(mensaje);
        mensaje.print();
        System.out.println("Re " + asunto);
        System.out.println("Sentimos no poder atenderle, estamos de vacaciones ");
        return mensaje;

    }

    public void ultimoMensajeRecibido(){
        if(ultimoMensaje != null){  
             ultimoMensaje.print();
        }
        else{
            System.out.println("No hay mensajes en su bandeja ");
        
        }

    }
}