package at.ac.fhcampuswien.models;

public class Article {
    private String author;
    private String title;
    private String description;
	private String url;
	private String urltoimage;
	private String publishedat;
    private String content;

    public Article(String author, String title, String description, String url, String urltoimage, String publishedat, String content){
        this.author = author;
        this.title = title;
        this.description = description;
        this.url = url;
        this.urltoimage = urltoimage;
        this.publishedat = publishedat;
        this.content = content;

    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription(){
        return description;
     }

    public String getUrl(){
        return url;
     }

    public String getUrltoimage(){return urltoimage;}

    public String getPublishedat() {
        return publishedat;
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
                && CharSequence.compare(author, obj2.author) == 0;
    }

    @Override
    public String toString() {
        return  "author:" + getAuthor() + "," + "\n"+
                "title:" + getTitle() + ",\n" +
                "description:" + getDescription() + ",\n" +
                "url:" + getUrl() + ",\n" +
                "urltoimage:" + getUrltoimage() + ",\n" +
                "publishedat:" + getPublishedat() + ",\n" +
                "content:" + getContent() + "},\n";
    }
}
