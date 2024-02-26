package com.infsis.Blggr_1.Services;

import com.infsis.Blggr_1.DTOs.BlogDTO;

import java.util.Optional;

public interface BlogService {
    Optional<BlogDTO> getBlogById(Integer blogId);
    BlogDTO saveBlog(BlogDTO blogDTO);
    BlogDTO updateArticle(Integer blogId, BlogDTO blogDTO);
    void delete(Integer id);
}
