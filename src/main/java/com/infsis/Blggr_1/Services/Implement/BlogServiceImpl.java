package com.infsis.Blggr_1.Services.Implement;

import com.infsis.Blggr_1.DTOs.BlogDTO;
import com.infsis.Blggr_1.Entities.Blog;
import com.infsis.Blggr_1.Services.BlogService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BlogServiceImpl implements BlogService {
    @Override
    public Optional<BlogDTO> getBlogById(Integer blogId) {
        return Optional.empty();
    }

    @Override
    public BlogDTO saveBlog(BlogDTO blogDTO) {
        return null;
    }

    @Override
    public BlogDTO updateArticle(Integer blogId, BlogDTO blogDTO) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }

    public BlogDTO BlogtoDto(Blog blog){
        BlogDTO blogDTO = new BlogDTO(
                blog.getId(),
                blog.getName()
        );
        return blogDTO;
    }

    public Blog DtotoBlog(BlogDTO blogDTO){
        Blog blog = new Blog();
        blog.setName(blogDTO.getName());
        return blog;
    }
}
