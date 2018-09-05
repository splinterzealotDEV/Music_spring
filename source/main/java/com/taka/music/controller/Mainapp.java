package com.taka.music.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.taka.music.entity.Song;
import com.taka.music.service.Serviceimp;

public class Mainapp {

	public static void main(String[] args) {
		
		Serviceimp si=new Serviceimp();
		
		Song so=si.getSong(2);
		
		System.out.println(so.getName());

	}

}
