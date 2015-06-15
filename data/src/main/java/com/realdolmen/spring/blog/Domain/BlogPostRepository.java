package com.realdolmen.spring.blog.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Evelyne on 15/06/15.
 */
public interface BlogPostRepository extends JpaRepository<BlogPost, Long> {
    //Find all blog posts ordered by creation date descending (with paging)
public List<BlogPost> FindAllBlogPostOrderByCreationDateDesc();


}
