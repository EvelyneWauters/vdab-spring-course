package com.realdolmen.spring.blog.config;

import com.realdolmen.spring.blog.domain.BlogPost;
import com.realdolmen.spring.blog.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Evelyne on 15/06/15.
 */
public interface CommentRepository extends JpaRepository<BlogPost, Long> {
    //Find the first 50 comments by blog post id ordered by creation date descending
    public List<Comment> FindFirst50CommentsByBlogPostIdOrderByCreationDateDesc();
}
