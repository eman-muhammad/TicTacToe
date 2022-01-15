package xogaming;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GamePlayer {
    Socket socket; 
    DataInputStream dis;
    DataOutputStream dos;
    AllProject pr;
    Thread t ;
    
    public  GamePlayer()
    {
        try {
            socket= new Socket("127.0.0.1" , 5050);
            dis = new DataInputStream(socket.getInputStream());
           dos = new DataOutputStream(socket.getOutputStream());
           

        } catch (IOException ex) {
            Logger.getLogger(GamePlayer.class.getName()).log(Level.SEVERE, null, ex);
        }
        t= new Thread(() ->{
        while (true)
        {
            try {
                String s= dis.readUTF();
               
                switch (s)
                {
                    case "SignUp":
                        pr.SignUp();
                        break;
                    case "vailed" :
                      pr.Signin();
                        break;
                }
                        
            } catch (IOException ex) {
                Logger.getLogger(GamePlayer.class.getName()).log(Level.SEVERE, null, ex);
            }
          
        }
        
        });
                
        
    }
    public void sendToServer(String x )
    {
        try {
            dos. writeUTF(x);
            dos .flush();

        } catch (IOException ex) {
            Logger.getLogger(GamePlayer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
