package ov.day8.Test;/*
@outhor shkstart
@date 2019/12/4-10:47
*/

import java.io.*;
import java.util.HashMap;

public class Demo01Test {
    public static void main(String[] args) throws IOException {
        HashMap<String, String> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new FileReader("in.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("out.txt"));
        String line;
        while ((line =br.readLine())!=null){
            String[] arr = line.split("\\.");
            map.put(arr[0],arr[1]);
        }
        for (String key : map.keySet()) {
            String value = map.get(key);
            line=key+"."+value;
            bw.write(line);
            bw.newLine();
        }
        bw.close();
        br.close();
    }
}
