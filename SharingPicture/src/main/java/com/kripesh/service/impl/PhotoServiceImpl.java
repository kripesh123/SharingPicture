package com.kripesh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kripesh.dao.PhotoDao;
import com.kripesh.model.Photo;
import com.kripesh.model.User;
import com.kripesh.service.PhotoService;

@Service
public class PhotoServiceImpl implements PhotoService {

	@Autowired
	private PhotoDao photoDao;
	@Override
	public List<Photo> findAll() {
		return photoDao.findAllByOrderByPhotoIdDesc();
	}

	@Override
	public List<Photo> findByUser(User user) {
		return photoDao.findByUser(user); 
	}

	@Override
	public Photo findByPhotoId(Long photoId) {
		return photoDao.findByPhotoId(photoId);
	}

	@Override
	public Photo save(Photo photo) {
		return photoDao.save(photo);
	}

}
