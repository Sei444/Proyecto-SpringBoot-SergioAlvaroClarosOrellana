package com.infsis.Blggr_1.Controllers;

import com.infsis.Blggr_1.DTOs.BlogDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/blog")
public class BlogController {
    @GetMapping()
    public ResponseEntity<BlogDTO> getBlogs(){
        BlogDTO blogDTO = new BlogDTO(1,"name");
        return ResponseEntity.ok().body(blogDTO);
    }
    @GetMapping("/{id}")
    public ResponseEntity<BlogDTO> getBlog(@PathVariable Integer id){
        BlogDTO blogDTO = new BlogDTO(1,"name");
        return ResponseEntity.ok().body(blogDTO);
    }
    @PostMapping()
    public ResponseEntity<BlogDTO> saveBlog(@RequestBody BlogDTO blogDTO){
        return ResponseEntity.ok().body(blogDTO);
    }
    @PutMapping("/{id}")
    public ResponseEntity<BlogDTO> saveBlogId(@PathVariable Integer id, @RequestBody BlogDTO blogDTO){
        return ResponseEntity.ok().body(blogDTO);
    }
    @DeleteMapping("/{id}")
    public void deleteBlog(@PathVariable Integer id){

    }
}
