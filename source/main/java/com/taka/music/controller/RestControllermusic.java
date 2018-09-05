package com.taka.music.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taka.music.entity.Song;
import com.taka.music.service.MusicService;


@RestController
@RequestMapping("/api")
public class RestControllermusic {
	
	@Autowired
	private MusicService si;
	
	@GetMapping("/music")
	public Song getsong()
	{

		
		Song so=si.getSong(2);
		System.out.println(so.getArtist().getName());
		System.out.println(so.getName());
		return so;
	}

}
