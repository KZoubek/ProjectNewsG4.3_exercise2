package at.ac.fhcampuswien.models;

public class Article {
    private final String author;
    private final String title;
    private final String description;
    private final String url;
    private final String urlToImage;
    private final String publishedAt;
    private final String content;
    private final SubClassIdAndName subClassIdAndName;

    public Article(String author, String title, String description, String url, String urlToImage, String publishedAt, String content, SubClassIdAndName subClassIdAndName) {
        this.author = author;
        this.title = title;
        this.description = description;
        this.url = url;
        this.urlToImage = urlToImage;
        this.publishedAt = publishedAt;
        this.content = content;
        this.subClassIdAndName = subClassIdAndName;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "\nArticle{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", url='" + url + '\'' +
                ", urlToImage='" + urlToImage + '\'' +
                ", publishedAt='" + publishedAt + '\'' +
                ", content='" + content + '\'' +
                ", source='" + subClassIdAndName + '\'' +
                "}\n";
    }


    static class SubClassIdAndName {
        private String id;
        private String name;

        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Source{" +
                    "id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
