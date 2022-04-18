package at.ac.fhcampuswien.models;

public class Article {
    private String author;
    private String title;
    private String description;
    private String url;
    private String urlToImage;
    private String publishedAt;
    private String content;

    public Article(String author, String title,String description,String url, String urlToImage,
                   String publishedAt, String content){
        this.author = author;
        this.title = title;
        this.description = description;
        this.url = url;
        this.urlToImage = urlToImage;
        this.publishedAt = publishedAt;
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription(){return description;}

    public String getUrl() {
        return url;
    }

    public String getUrlToImage() {
        return urlToImage;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public String getContent() {
        return content;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Article obj2)) {
            return false;
        }

        return CharSequence.compare(title, obj2.title) == 0
                && CharSequence.compare(author, obj2.author) == 0
                && CharSequence.compare(description, obj2.description) == 0
                && CharSequence.compare(url, obj2.url) == 0
                && CharSequence.compare(urlToImage, obj2.urlToImage) == 0
                && CharSequence.compare(publishedAt, obj2.publishedAt) == 0
                && CharSequence.compare(content, obj2.content) == 0;
    }

    @Override
    public String toString() {
        return "Title: " + getTitle() + "\n" +
                "Author: " + getAuthor() + "\n" +
                "Description: " + getDescription() + "\n" +
                "Url: " + getUrl() + "\n" +
                "Url to image: " + getUrlToImage() + "\n" +
                "Published at: " + getPublishedAt() + "\n" +
                "Content: " + getContent();
    }
}
