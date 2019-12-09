package ov.day9.TCP;/*
@outhor shkstart
@date 2019/12/5-15:28
ConnectException: Connection refused: connect:不能连接异常
*/

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 8888);
        OutputStream os = socket.getOutputStream();
        os.write("你好服务器".getBytes());
        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len=is.read(bytes);
        System.out.println(new String(bytes,0,len));
        socket.close();

    }
}
