package at.ac.fhcampuswien.controllers;

import at.ac.fhcampuswien.models.Article;

import java.util.ArrayList;
import java.util.List;

public class AppController {
    private List<Article> articles;

    public AppController() {
        articles = generateMockList();
    }

    public void setArticles(List<Article> articles){
        this.articles = articles;
    }

    public List<Article> getArticles(){
        return articles;
    }

    /**
     * gets the size of article list
     * if the list is null it should return 0
     * @return size of article list
     */
    public int getArticleCount(){
        if(articles != null) {
            return articles.size();
        }
        return 0;
    }

    /**
     * at the moment only returns the article list
     * not implemented yet
     * @return article list
     */
    public List<Article> getTopHeadlinesAustria() {
        if(articles != null){
            return articles;
        }
        return new ArrayList<>();
    }

    /**
     * returns all articles that do contain "bitcoin"
     * in their title
     * @return filtered list
     */
    public List<Article> getAllNewsBitcoin() {
        if(articles != null) {
            return filterList("bitcoin", articles);
        }
        return new ArrayList<>();
    }

    /**
     * method to generate a mocking list of articles
     * @return list of generated articles
     */
    public static List<Article> generateMockList(){
        List<Article> articles = new ArrayList<>();

        Article article1 = new Article("New York Times", "Eric Adams, a Bitcoin Booster, Is Taking First Paycheck in Crypto");
        Article article2 = new Article("News Sky", "Irishman held against his will in China for 3 years reunited with 'unbelievably happy' family");
        Article article3 = new Article("News Sky", "Mother who won £127,000 tells how she still ended up homeless");

        articles.add(article1);
        articles.add(article2);
        articles.add(article3);

        return articles;
    }

    /**
     * filters a given article list based on a query
     * @param query to filter by
     * @param articles  list to filter
     * @return filtered list
     */
    protected static List<Article> filterList(String query, List<Article> articles){
        if(query != null && articles != null) {
            List<Article> filtered = new ArrayList<>();
            for(Article i : articles){
                if(i.getTitle().toLowerCase().contains(query)){
                    filtered.add(i);
                }
            }
            return filtered;
        } else {
            return new ArrayList<>();
            //throw new IllegalArgumentException();
        }
    }
}
