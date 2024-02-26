package com.infsis.Blggr_1.Services.Implement;

import com.infsis.Blggr_1.DTOs.ArticleDTO;
import com.infsis.Blggr_1.Entities.Article;
import com.infsis.Blggr_1.Services.ArticleService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Override
    public Optional<ArticleDTO> getArticleById(Integer articleId) {
        return Optional.empty();
    }

    @Override
    public ArticleDTO saveArticle(ArticleDTO articleDTO) {
        return null;
    }

    @Override
    public ArticleDTO updateArticle(Integer articleId, ArticleDTO articleDTO) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }

    public ArticleDTO ArticletoDTO(Article article){
        ArticleDTO articleDTO = new ArticleDTO(
                article.getId(),
                article.getTitle(),
                article.getReference()
        );
        return articleDTO;
    }
    public Article DtotoArticle(ArticleDTO articleDTO){
        Article article = new Article();
        article.setTitle(articleDTO.getTitle());
        article.setReference(articleDTO.getReference());
        return article;
    }
}
