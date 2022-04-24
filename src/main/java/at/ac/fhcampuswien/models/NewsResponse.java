package at.ac.fhcampuswien.models;

import java.util.List;

public class NewsResponse {

        private String status;
        private int totalResults;
        private List<Article> article;
        private String source;
        private String id;
        private String name;

        public NewsResponse(){
        }

        public NewsResponse(String status, int totalResults, List<Article> article, String source, String id, String name){
            this.status = status;
            this.totalResults = totalResults;
            this.article = article;
            this.source = source;
            this.id = id;
            this.name = name;
        }

        public String getStatus(){
            return status;
        }

        public int getTotalResults(){
            return totalResults;
        }

        public List<Article> getArticle(){
            return article;
        }

        public String getSource(){
            return source;
        }

        public String getId(){
            return id;
        }

        public String getName(){
            return name;
        }

        @Override
        public String toString(){
            return "status:" + getStatus() + ",\n" +
                    "totalResulats:" + getTotalResults() + ",\n" +
                    "article: [ \n {" +
                    "sourse: {" +
                    "id:" + getId() + ",\n" +
                    "name:" + getName() + "\n" +
                    "},\n";
        }

    }


