package at.ac.fhcampuswien.models;

import at.ac.fhcampuswien.models.Article;

import java.util.List;

public class NewsResponse {
    private final String status;
    private final int totalResults;
    private final List<Article> articles;

    public NewsResponse (String status,int totalResults, List<Article> articles){
        this.status = status;
        this.totalResults = totalResults;
        this.articles = articles;
    }

    public String getStatus() {
        return status;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public List<Article> getArticles() {
        return articles;
    }

    @Override
    public String toString() {
        return "NewsResponse{" +
                "status='" + status + '\'' +
                ", totalResults=" + totalResults +
                ", articles=" + articles +
                '}';
    }
}
