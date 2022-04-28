package at.ac.fhcampuswien.controllers;

import at.ac.fhcampuswien.api.NewsApi;
import at.ac.fhcampuswien.models.Article;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AppController {

    public List<Article> getTopHeadlinesAustria() {
            return NewsApi.getTopHeadlinesAustria("").getArticles();
    }

    /**
     * returns all articles that do contain "bitcoin"
     * in their title
     * @return filtered list
     */
    public List<Article> getAllNewsBitcoin() {
        return NewsApi.getAllNewsAustria("bitcoin").getArticles();

    }


}
