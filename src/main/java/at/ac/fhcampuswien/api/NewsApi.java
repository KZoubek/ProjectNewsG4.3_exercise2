package at.ac.fhcampuswien.api;

import at.ac.fhcampuswien.models.NewsResponse;
import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.lang.reflect.Type;

public class NewsApi {

    //URl has been added
    private String AllNewsBitcoin = "https://newsapi.org/v2/everything?q=bitcoin&apiKey=21fe381562794a328c3d96ef295222d0";

    //client and gson objects has been created
    OkHttpClient client = new OkHttpClient();
    Gson gson = new Gson();

    //a request object has been created with the builder for url
    String request(String url) throws IOException {
        Request request = new Request.Builder().url(url).build();
        //a client request will be executed, so we can send a response
        try (Response response = client.newCall(request).execute()) {
            //response type is json and it will be deserialization. It is "converted into java language".
            String json = response.body().string();
            return gson.fromJson(json, (Type) NewsResponse.class);
            //?
        }catch (IOException exception){
            throw new RuntimeException(exception);
        }
    }
    //the url and the query are returned as a request. That is what we expect to be requested.
    public String getAllNewsBitcoin(String query) throws IOException {
        return request(AllNewsBitcoin + "&q=" + query);
    }

}
