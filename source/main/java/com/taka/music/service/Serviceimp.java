package com.taka.music.service;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.taka.music.dao.DAOimp;
import com.taka.music.entity.Song;

@Service
public class Serviceimp implements MusicService {

	@Autowired
	private DAOimp dao;
	//spring transactional
	@Override
	@Transactional
	public Song getSong(int id) {
		
		Song song=dao.getSong(id);
		
		return song;
	}

	

}
