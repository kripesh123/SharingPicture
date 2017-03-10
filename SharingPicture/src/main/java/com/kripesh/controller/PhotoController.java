package com.kripesh.controller;

import static com.kripesh.controller.util.ApiConstants.API_VER;
import static com.kripesh.controller.util.ApiConstants.PHOTO_PATH;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kripesh.model.Photo;
import com.kripesh.service.PhotoService;

@RestController
@RequestMapping(API_VER + PHOTO_PATH)
public class PhotoController {
	
	@Autowired
	PhotoService photoService;
	
	@RequestMapping("/allPhotos")
	public List<Photo> getAllPhotos(){
		return photoService.findAll();
	}
}
