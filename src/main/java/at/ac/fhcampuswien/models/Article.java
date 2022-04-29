package at.ac.fhcampuswien.models;
//Added necessary attributes
public class Article {
    //here will the data coming from NewsApi be stored
    private final String author;
    private final String title;
    private final String description;
    private final String url;
    private final String urlToImage;
    private final String publishedAt;
    private final String content;
    private final Source source;

    public Article(String author, String title, String description, String url, String urlToImage, String publishedAt, String content, Source source) {
        this.author = author;
        this.title = title;
        this.description = description;
        this.url = url;
        this.urlToImage = urlToImage;
        this.publishedAt = publishedAt;
        this.content = content;
        this.source = source;
    }

    /*
    public String getTitle() {
    return title;
    }
*/
    @Override
    //automaticly generated tostring methods
    public String toString() {
        return "\nArticle \n" +
                "Author: " + author + "\n" +
                "Title: " + title + "\n" +
                "Description: " + description + "\n" +
                "URL: " + url + "\n" +
                "Image Link: " + urlToImage + "\n" +
                "published at: " + publishedAt + "\n" +
                "Content: " + content + "\n" +
                "Source: " + source.getName() + "\n";
    }

    //special subclass for getting the id, name out of jason file
    static class Source {
        private String id;
        private String name;

        public String getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }

        @Override
        public String toString() {
            return "Source: " +
                    "id: " + getId() + "\n" +
                    "name: " + getName() + "\n";
        }
    }
}
