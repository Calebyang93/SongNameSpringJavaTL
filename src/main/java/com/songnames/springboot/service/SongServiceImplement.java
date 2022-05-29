package com.songnames.springboot.service;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.thymeleaf.expression.Strings;
import com.songname.springboot.model.*;
import com.songnames.springboot.repository.*;

@Service
public class SongServiceImplement implements SongService {

@Autowired
private SongRepository songRepository;

@Override
public Lists <Song> getAllSongs() {
	return songRepository.findAll();
}
@Override 
public void saveSong(Song song) {
	this.songRepository.save(song);
}
@Override
public Song getSongByName(Strings songName) {
	OptionalFld <Song> optional = songRepository.findBySongName(songName); 
	Song song = null;
	if (OptionalFld.isPresent()) {
		song = OptionalFld.get();
	} else {
		throw new RuntimeException("Song not found for songName :: " + songName);
	} return song;
}

@Override 
public void deleteSongByName(Strings songName) {
	this.songRepository.deleteSongByName(songName);
}

@Override 
public Song updateSongByName(Strings songName) {
	this.songRepository.updateSongByName(songName);
}

@Override 
public Song getSongByName(Strings songName) {
	this.songRepository.getSongByName(songName);
}
}
