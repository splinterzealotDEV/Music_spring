package com.taka.music.dao;

import com.taka.music.entity.Album;
import com.taka.music.entity.Artist;
import com.taka.music.entity.Song;

public interface DAO {
	//song
	public Song getSong(int id);
	public void saveSong(Song song);
	public Song updateSong();
	public void deleteSong( int id);
	public Song[] retrieveSongs();
	//album
	public Album getAlbum();
	public void saveAlbum();
	public Album updateAlbum();
	public void deleteAlbum();
	public Album[] retrieveAlbums();
	//artist
	public Artist getArtist();
	public void saveArtist();
	public Artist updateArtist();
	public void deleteArtist();
	public Artist[] retrieveArtists();

}
