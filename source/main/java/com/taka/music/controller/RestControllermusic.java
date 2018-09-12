package com.taka.music.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
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
	
	private List<Song> songs;
	
	@GetMapping("/music")
	public Song getOneSong()
	{

		
		Song so=si.getSong(2);
		System.out.println(so.getArtist().getName());
		System.out.println(so.getName());
		return so;
	}
	
	@GetMapping("/list")
	public String showList(Model themodel) {
		
		
		
		
		return "song_view";
	}
	

	public List<Song> getSongs() {
		return songs;
	}

	public void setSongs(List<Song> songs) {
		this.songs = songs;
	}
	
	

}
