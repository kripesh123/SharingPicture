package com.kripesh.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kripesh.model.Comment;

@Repository
public interface CommentDao extends CrudRepository<Comment, Long>{
	Comment save(Comment comment);
	
	List<Comment> findByPhotoId(Long photoId);
	
	Comment findOne(Long commentId);
}
