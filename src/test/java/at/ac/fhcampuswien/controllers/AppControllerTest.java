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
/*    private static AppController controller;
    private List<Article> testList;

    @BeforeAll
    static void init(){

    }

    @BeforeEach
    void setup(){
        controller = new AppController();
        testList = generateMockList();
        controller.setArticles(testList);
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
        assertEquals(testList, controller.getTopHeadlinesAustria());
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

    @Test
    @DisplayName("filter list, query = \"t\" size - Test 1")
    public void filterList_scenario1(){
        List<Article> actual = AppController.filterList("t", testList);
        assertEquals(3, actual.size());
    }

    @Test
    @DisplayName("filter list, query = \"t\" equal - Test 2")
    public void filterList_scenario2(){
        List<Article> actual = AppController.filterList("t", testList);

        List<Article> expected = new ArrayList<>();
        Article article1 = new Article("New York Times", "Eric Adams, a Bitcoin Booster, Is Taking First Paycheck in Crypto");
        Article article2 = new Article("News Sky", "Irishman held against his will in China for 3 years reunited with 'unbelievably happy' family");
        Article article3 = new Article("News Sky", "Mother who won £127,000 tells how she still ended up homeless");
        expected.add(article1);
        expected.add(article2);
        expected.add(article3);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("filter list, query with no matches - Test 3")
    public void filterList_scenario3(){
        List<Article> actual = AppController.filterList("abcde", testList);
        assertEquals(0, actual.size());
    }

    @Test
    @DisplayName("filter list, query with 1 match - Test 4")
    public void filterList_scenario4(){
        List<Article> actual = AppController.filterList("eric adams", testList);
        assertEquals(1, actual.size());
    }

    @Test
    @DisplayName("filter list, null query - Test 5")
    public void filterList_scenario5(){
        List<Article> actual = AppController.filterList(null, testList);
        assertEquals(0, actual.size());
    }


    @Test
    @DisplayName("filter list, query null exception - Test 5")
    public void filterList_scenario5(){
        assertThrows(IllegalArgumentException.class, () ->  AppController.filterList(null, articles));
    }


    @Test
    @DisplayName("filter list, null list - Test 6")
    public void filterList_scenario6(){
        List<Article> actual = AppController.filterList("t", null);
        assertEquals(0, actual.size());
    }

    @Test
    @DisplayName("filter list, list and query null - Test 7")
    public void filterList_scenario7(){
        List<Article> actual = AppController.filterList(null, null);
        assertEquals(0, actual.size());
    } */
}
