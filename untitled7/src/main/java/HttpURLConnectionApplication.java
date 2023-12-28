import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpURLConnectionApplication {
    public static void main(String[] args) {
        try {
            System.out.println("hi");
            final URL url = new URL("http://localhost:8000");
            final HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("User-Agent", "Mozilla/5.0");

            final BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            String inputLine;
            final StringBuilder builder = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                builder.append(inputLine);
            }
            in.close();
            System.out.println("response code=" + connection.getResponseCode());
            System.out.println("response body=" + builder.toString());
            System.out.println("hello");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}