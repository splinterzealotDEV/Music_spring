package com.taka.music.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="album")
public class Album {
	
	
	@Column(name="titulo")
	private String titulo;
	@Column(name="year")
	private int year;
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
	private Artist artist;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	public Album()
	{
		
	}

	public Album(String titulo, int year, Artist artist) {
		
		this.titulo = titulo;
		this.year = year;
		this.artist = artist;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Artist getArtist() {
		return artist;
	}

	public void setArtist(Artist artist) {
		this.artist = artist;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Album [titulo=" + titulo + ", year=" + year + ", artist=" + artist + ", id=" + id + "]";
	}
	
	

}
