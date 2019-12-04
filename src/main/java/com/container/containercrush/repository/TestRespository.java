package com.container.containercrush.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.container.containercrush.entity.Test;

import java.util.List;

	@Repository
	public interface TestRespository extends JpaRepository<Test, Integer> {

	    // custom query to search to blog post by title or content
	    List<Test> findProductById(int id);
	    

}
