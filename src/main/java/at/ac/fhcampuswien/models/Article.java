package at.ac.fhcampuswien.models;

public class Article {
    private String author;
    private String title;
    /*
    private String description;
	private String url;
	private String urltoimage;
	private Date publishedat
    private String content
     */

    public Article(String author, String title){
        this.author = author;
        this.title = title;

    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
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
        return "Title: " + getTitle() + "\n" +
                "Author: " + getAuthor();
    }
}
