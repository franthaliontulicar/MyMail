
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
    
    public MailClient(MailServer server, String user){

        this.server = server;
        this.user = user;

    }

    public MailItem getNextMailItem(){

        return server.getNextMailItem(user);

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
    
    public void getNextMailItemAndAutorespond(String to, String mensajeEnviado, String asunto){
        MailItem mensaje = new MailItem(user,to,mensajeEnviado,asunto);
        server.getNextMailItem(user);
        server.post(mensaje);
        mensaje.print();
        System.out.println("Re " + asunto + " Sentimos no poder atenderle, estamos de vacaciones ");
       
      
    }
}

