package at.ac.fhcampuswien.controllers;

import at.ac.fhcampuswien.models.Article;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AppControllerTest {
    private static AppController controller;

    @BeforeAll
    static void init(){

    }

    @BeforeEach
    void setup(){
        controller = new AppController();
    }

    @Test
    @DisplayName("getAllNewsBitcoin Test 1")
    public void getAllNewsBitcoin_scenario1(){
        List<Article> list = generateMockList();
        controller.setArticles(list);
        List<Article> bitcoinArticles = controller.getAllNewsBitcoin();
        assertEquals(1, bitcoinArticles.size());
    }

    @Test
    @DisplayName("getAllNewsBitcoin Test 2")
    public void getAllNewsBitcoin_scenario2(){
        List<Article> list = generateMockList();
        controller.setArticles(list);
        List<Article> bitcoinArticles = controller.getAllNewsBitcoin();
        assertEquals("Eric Adams, a Bitcoin Booster, Is Taking First Paycheck in Crypto", bitcoinArticles.get(0).getTitle());
    }

    @Test
    @DisplayName("getAllNewsBitcoin Test 3 - list is null")
    public void getAllNewsBitcoin_scenario3(){
        controller.setArticles(null);
        List<Article> bitcoinArticles = controller.getAllNewsBitcoin();
        assertNotNull(bitcoinArticles);
    }

    @Test
    @DisplayName("getArticlesCount Test 1 - when articles is null")
    public void getArticlesCount_scenario1(){
        controller.setArticles(null);
        int size = controller.getArticleCount();
        assertEquals(0, size);
    }

    @Test
    @DisplayName("getArticlesCount Test 2")
    public void getArticlesCount_scenario2(){
        List<Article> list = generateMockList();
        controller.setArticles(list);
        int size = controller.getArticleCount();
        assertEquals(3, size);
    }

    @Test
    @DisplayName("setArticles Test 1")
    public void setArticles_scenario1(){
        List<Article> list = generateMockList();
        controller.setArticles(list);
        assertEquals(controller.getArticles().size(), 3);
    }

    @Test
    @DisplayName("setArticles Test 2")
    public void setArticles_scenario2(){
        List<Article> list = generateMockList();
        controller.setArticles(list);
        assertEquals("New York Times", controller.getArticles().get(0).getAuthor());
    }

    @Test
    @DisplayName("getTopHeadlinesAustria Test 1")
    public void getTopHeadlinesAustria_scenario1(){
        List<Article> list = generateMockList();
        controller.setArticles(list);
        assertEquals(list, controller.getTopHeadlinesAustria());
    }

    @Test
    @DisplayName("getTopHeadlinesAustria Test 2")
    public void getTopHeadlinesAustria_scenario2(){
        controller.setArticles(null);
        assertNotNull(controller.getTopHeadlinesAustria());
    }

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
}
