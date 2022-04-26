package com.example.learnnewsapiwithfragmenttoolbar;

import java.util.ArrayList;

public class Pojo {


    String status;
    String totalResults;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(String totalResults) {
        this.totalResults = totalResults;
    }
//
//    public ArrayList<MyPojo.articles> getArticles() {
//        return articles;
//    }
//
//    public void setArticles(ArrayList<MyPojo.articles> articles) {
//        this.articles = articles;
//    }

    ArrayList<articles> articles;

    public ArrayList<Pojo.articles> getArticles() {
        return articles;
    }

    public void setArticles(ArrayList<Pojo.articles> articles) {
        this.articles = articles;
    }

    public class articles{
        private String author ;
        private String title;
        private String description;
        private String url;
        private String urlToImage;
        private String publishedAt;
        private String content;

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getUrlToImage() {
            return urlToImage;
        }

        public void setUrlToImage(String urlToImage) {
            this.urlToImage = urlToImage;
        }

        public String getPublishedAt() {
            return publishedAt;
        }

        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }
    }

}
