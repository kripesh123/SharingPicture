package com.kripesh.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.kripesh.model.Photo;
import com.kripesh.model.User;

@Repository
public interface PhotoDao{

	List<Photo> findAll();
	
	List<Photo> findByUser(User user);
	
	Photo findByPhotoId(Long photoId);
	
	Photo save(Photo photo);
	
	
}
