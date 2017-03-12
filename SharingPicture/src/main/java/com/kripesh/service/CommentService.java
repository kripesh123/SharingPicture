package com.kripesh.service;

import java.util.List;

import com.kripesh.model.Comment;

public interface CommentService {
	Comment save(Comment comment);

	List<Comment> findByPhotoId(Long photoId);

	Comment findOne(Long commentId);
}
