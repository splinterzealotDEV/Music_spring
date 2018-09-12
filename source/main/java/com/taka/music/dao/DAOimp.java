package com.taka.music.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.taka.music.entity.Album;
import com.taka.music.entity.Artist;
import com.taka.music.entity.Song;
@Repository
public class DAOimp implements DAO {
	//the Service class must implement the @Transactional 
	
	//injecting session factory
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public Song getSong(int id) {
		//getting current session
		Session currentsession=sessionFactory.getCurrentSession();
		//retrieving object
		Song tempsong=currentsession.get(Song.class,id);
		//lazy fetching the artist
		tempsong.getArtist();
		//lazy fetching the songs
		List<Song> songs=tempsong.getArtist().getSongs();
		
		for(Song song:songs) {
			System.out.println(song);
		}
		
		return tempsong;
	}

	@Override
	public void saveSong(Song song) {
		Session currentsession=sessionFactory.getCurrentSession();
		//if the id of the object is alredy on the DB it will be updated with the object being passed,
		//if the id doesn't exist it will create a new record(id = 0)
		currentsession.saveOrUpdate(song);
		
	}

	@Override
	public Song updateSong() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteSong(int id) {
		
		Session currentsession=sessionFactory.getCurrentSession();
		
		Song tempsong=currentsession.get(Song.class, id);
		//org hibernate query Query library
		//creating query to delete based on the id
		Query thequery=currentsession.createQuery("delete from Song where id=:songId");
		//setting query parameter
		thequery.setParameter("songId", id);
		//excecuting the update to commit the changes to DB
		thequery.executeUpdate();
		
	}

	@Override
	public Song[] retrieveSongs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Album getAlbum() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveAlbum() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Album updateAlbum() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAlbum() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Album[] retrieveAlbums() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Artist getArtist() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveArtist() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Artist updateArtist() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteArtist() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Artist[] retrieveArtists() {
		// TODO Auto-generated method stub
		return null;
	}

}
