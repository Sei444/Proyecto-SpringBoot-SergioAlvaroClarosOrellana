package com.infsis.Blggr_1.Services;

import com.infsis.Blggr_1.DTOs.ArticleDTO;

import java.util.Optional;

public interface ArticleService {
    Optional<ArticleDTO> getArticleById(Integer articleId);
    ArticleDTO saveArticle(ArticleDTO articleDTO);
    ArticleDTO updateArticle(Integer articleId, ArticleDTO articleDTO);

    void delete(Integer id);
}
