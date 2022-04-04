package at.ac.fhcampuswien.controllers;

import at.ac.fhcampuswien.models.Article;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AppControllerTest {
    private static AppController controller;
    private List<Article> articles;

    @BeforeAll
    static void init(){

    }

    @BeforeEach
    void setup(){
        controller = new AppController();
        articles = generateMockList();
        controller.setArticles(articles);
    }

    @Test
    @DisplayName("filter list, query = \"t\" - Test 1")
    public void filterList_scenario1(){
        List<Article> bitcoinArticles = AppController.filterList("t", articles);
        assertEquals(3, bitcoinArticles.size());
    }

    @Test
    @DisplayName("filter list, query with no matches - Test 2")
    public void filterList_scenario2(){
        List<Article> bitcoinArticles = AppController.filterList("abcde", articles);
        assertEquals(0, bitcoinArticles.size());
    }

    @Test
    @DisplayName("filter list, query with 1 match - Test 3")
    public void filterList_scenario3(){
        List<Article> bitcoinArticles = AppController.filterList("eric adams", articles);
        assertEquals(1, bitcoinArticles.size());
    }

    @Test
    @DisplayName("filter list, empty query - Test 4")
    public void filterList_scenario4(){
        List<Article> bitcoinArticles = AppController.filterList("", articles);
        assertEquals(3, bitcoinArticles.size());
    }

    @Test
    @DisplayName("filter list, query null - Test 5")
    public void filterList_scenario5(){
        assertThrows(IllegalArgumentException.class, () ->  AppController.filterList(null, articles));
    }

    @Test
    @DisplayName("getAllNewsBitcoin, 1 result in size - Test 1")
    public void getAllNewsBitcoin_scenario1(){
        List<Article> bitcoinArticles = controller.getAllNewsBitcoin();
        assertEquals(1, bitcoinArticles.size());
    }

    @Test
    @DisplayName("getAllNewsBitcoin, 1 result equals to - Test 2")
    public void getAllNewsBitcoin_scenario2(){
        List<Article> bitcoinArticles = controller.getAllNewsBitcoin();
        assertEquals("Eric Adams, a Bitcoin Booster, Is Taking First Paycheck in Crypto", bitcoinArticles.get(0).getTitle());
    }

    @Test
    @DisplayName("getAllNewsBitcoin, list is null - Test 3")
    public void getAllNewsBitcoin_scenario3(){
        controller.setArticles(null);
        List<Article> bitcoinArticles = controller.getAllNewsBitcoin();
        assertNotNull(bitcoinArticles);
    }

    @Test
    @DisplayName("getArticlesCount, when articles is null - Test 1")
    public void getArticlesCount_scenario1(){
        controller.setArticles(null);
        int size = controller.getArticleCount();
        assertEquals(0, size);
    }

    @Test
    @DisplayName("getArticlesCount, all articles - Test 2")
    public void getArticlesCount_scenario2(){
        int size = controller.getArticleCount();
        assertEquals(3, size);
    }

    @Test
    @DisplayName("setArticles, get the size - Test 1")
    public void setArticles_scenario1(){
        assertEquals(controller.getArticles().size(), 3);
    }

    @Test
    @DisplayName("setArticles, equals - Test 2")
    public void setArticles_scenario2(){
        assertEquals("New York Times", controller.getArticles().get(0).getAuthor());
    }

    @Test
    @DisplayName("getTopHeadlinesAustria Test 1")
    public void getTopHeadlinesAustria_scenario1(){
        assertEquals(articles, controller.getTopHeadlinesAustria());
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
