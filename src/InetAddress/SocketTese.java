package InetAddress;

import java.io.*;
import java.net.*;

public class SocketTese {

    public static void main(String[] args) throws IOException {
        SocketTese socketTese=new SocketTese();
        socketTese.serverSockt();
    }

    public void serverSockt() throws IOException {
        ServerSocket ss=new ServerSocket(8099);
        Socket sk=ss.accept();
        InputStream inputStream = sk.getInputStream();
        byte[] bytes=new byte[1024];
        int longs;
        while((longs=inputStream.read(bytes))!=-1){
            String os=new String(bytes,0,longs);
            System.out.println(os);
        }
    }

}
