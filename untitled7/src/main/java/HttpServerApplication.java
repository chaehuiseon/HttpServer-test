import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class HttpServerApplication {
    final static HttpHandler indexHandler = httpExchange -> {
        final String response = "This is index page...";
        httpExchange.sendResponseHeaders(200, response.length());

        final OutputStream os = httpExchange.getResponseBody();
        os.write(response.getBytes());
        os.close();
    };

    public static void main(String[] args) {
        try {
            final HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
            server.createContext("/", indexHandler);
            server.setExecutor(null);
            server.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}