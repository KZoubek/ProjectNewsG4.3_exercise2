package at.ac.fhcampuswien.models;

import at.ac.fhcampuswien.models.Article;

import java.util.List;

public class NewsResponse {
    //private variables that are final because they are not changed and created only ones
    private final String status;
    private final int totalResults;
    private final List<Article> articles;

    public NewsResponse (String status,int totalResults, List<Article> articles){
        //in the constructor, the variables are "assigned" to the parameters
        this.status = status;
        this.totalResults = totalResults;
        this.articles = articles;
    }

    public List<Article> getArticles() {
        //with the getter, the articles are taken from the article class and returned
        return articles;
    }

    @Override
    public String toString() {
        //the toString method returns the status, totalResults and article. (information from article = Article class, status & totalResults = NewsApi class)
        return "NewsResponse{" +
                "status='" + status + '\'' +
                ", totalResults=" + totalResults +
                ", articles=" + articles +
                '}';
    }
}
