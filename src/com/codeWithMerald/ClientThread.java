package com.codeWithMerald;
import java.lang.Thread;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.List;
import java.io.BufferedReader;
public class ClientThread extends Thread{

    private String message;
    private List<String> html;
    private List<String> json;
    private Socket client;

    public ClientThread( Socket client, List<String> html, List<String> json ){
        this.client = client;
        this.html = html;
        this.json = json;
    }
    public static StringBuilder stringBuilder(List<String> file) {
        StringBuilder result = new StringBuilder();
        for (String line :file) {
            result.append(line);
            result.append("\n");
        }
        return result;
    }
    @Override
    public void run(){
        try {
            System.out.println("A new user has been connected");
            InputStream inputStream = client.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            OutputStream ous = client.getOutputStream();
            message = bufferedReader.readLine();

            String route = null;
            if (message.contains("GET ")){
                String[] arrayOfMethods = message.split(" ");
                route = arrayOfMethods[1];
            }

            StringBuilder responseFromRoute = new StringBuilder();
            String typeOfContent = null;


            if(route.equals("/")){
                responseFromRoute = stringBuilder(html);
                typeOfContent = "Type of Content: text/html\n\r" ;
            }

            if(route.equalsIgnoreCase("/json")){
                responseFromRoute = stringBuilder(json);
                typeOfContent = "Type of Content: application/json\r\n" ;
            }

            String responseFromHttp = "HTTP/1.1 200 OK\r\n" + typeOfContent  + "\r\n" +responseFromRoute;
            ous.write((responseFromHttp).getBytes());
            ous.flush();
            ous.close();
            //   }
        } catch (Exception exception) {
            System.out.printf(exception.getMessage());
        }
    }


}


