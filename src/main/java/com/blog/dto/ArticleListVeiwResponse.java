package com.blog.dto;

import com.blog.domain.Article;
import lombok.Getter;

@Getter
public class ArticleListVeiwResponse {
    private final Long id;
    private final String title;
    private final String content;

    public ArticleListVeiwResponse(Article article) {
        this.id = article.getId();
        this.title = article.getTitle();
        this.content = article.getContent();
    }
}
