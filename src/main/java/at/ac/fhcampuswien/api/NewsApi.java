package at.ac.fhcampuswien.api;

import at.ac.fhcampuswien.models.NewsResponse;
import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class NewsApi {

    private static final String TOP_HEADLINE_AUSTRIA_URL = "https://newsapi.org/v2/top-headlines?country=at&apiKey=21fe381562794a328c3d96ef295222d0";
    private static final String ALL_NEWS_AUSTRIA_URL = "https://newsapi.org/v2/everything?apiKey=21fe381562794a328c3d96ef295222d0";

    private static final OkHttpClient client = new OkHttpClient();
    private static final Gson gson = new Gson();

    private static NewsResponse request(String url) {
        Request request = new Request.Builder().url(url).build();

        try (Response response = client.newCall(request).execute()) {
            String json = response.body().string();
            return gson.fromJson(json, NewsResponse.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static NewsResponse getTopHeadlinesAustria(String query){
        return request(TOP_HEADLINE_AUSTRIA_URL + "&q=" + query);
    }

    public static NewsResponse getAllNewsAustria(String query) {
        return request(ALL_NEWS_AUSTRIA_URL  + "&q=" + query);
    }

}
