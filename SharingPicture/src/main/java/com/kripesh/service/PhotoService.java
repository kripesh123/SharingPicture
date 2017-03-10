package com.kripesh.service;

import java.util.List;

import com.kripesh.model.Photo;
import com.kripesh.model.User;

public interface PhotoService {

	List<Photo> findAll();

	List<Photo> findByUser(User user);

	Photo findByPhotoId(Long photoId);

	Photo save(Photo photo);

}
