package ov.day9.demo02FileUPLoad.FileUPLoad;/*
@outhor shkstart
@date 2019/12/6-10:05
*/

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8888);

        while (true) {
            Socket socket = server.accept();
            new Thread(new Runnable() {

                public void run() {
                   try{
                       InputStream is = socket.getInputStream();
                       File file = new File("d:\\upload");
                       if (!file.exists()) {
                           file.mkdirs();
                       }
                       String fileName = "itcast" + System.currentTimeMillis() + "@" + new Random().nextInt(999999) + ".jpg";
                       // FileOutputStream fos = new FileOutputStream(file+"\\1.jpg");
                       FileOutputStream fos = new FileOutputStream(file + "\\" + fileName);
                       byte[] bytes = new byte[1024];
                       int len = 0;
                       while ((len = is.read(bytes)) != -1) {
                           fos.write(bytes, 0, len);
                       }
                       ;
                       // System.out.println(new String(bytes,0,len));
                       OutputStream os = socket.getOutputStream();
                       os.write("上传成功".getBytes());
                       fos.close();
                       socket.close();
                   }catch (IOException e){
                       System.out.println(e);
                   }
                }
            }).start();

        }

        // server.close();
    }
}
