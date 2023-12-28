package project.handler;

import java.io.IOException;
import java.io.OutputStream;

import com.sun.net.httpserver.*;
public abstract class jsonhandler implements HttpHandler {

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        // TODO Auto-generated method stub

        //Headers headers = new Headers();
        Headers headers = exchange.getResponseHeaders();
        headers.set("Content-Type", "application/json");
        String response = "";

        try{
            response = this.response();
            exchange.sendResponseHeaders(200, response.length());



        }catch(Exception e){
            e.printStackTrace();
            exchange.sendResponseHeaders(500, response.length());


        }finally{
            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }

    }


    public abstract <T> T response() throws Exception;


}
