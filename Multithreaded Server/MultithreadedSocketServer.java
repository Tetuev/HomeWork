import java.net.ServerSocket;
import java.net.Socket;

public class MultithreadedSocketServer {
    public static void main(String[] args) throws Exception {
        try{
            ServerSocket server=new ServerSocket(8888);
            int counter=0;
            System.out.println("Cервер запущен ....");
            while(true){
                counter++;
                Socket serverClient=server.accept();  //сервер ждет запроса клиента
                System.out.println(" >> " + "Клиент №:" + counter + " запущен!");
                ServerClientThread sct = new ServerClientThread(serverClient,counter); //посылает запрос в отдельный thread
                sct.start();
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
