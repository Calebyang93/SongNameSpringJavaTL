package com.songnames.springboot.repository;

import org.thymeleaf.expression.Lists;
import org.thymeleaf.expression.Strings;

import com.songname.springboot.model.Song;

public interface JpaRepository<Long, Strings, Strings2, Dates, Strings3> {
	Lists <Song> getAllSongs();
	void saveSong(Song song);
	Song getSongById(long id);
	void deleteSong(Song song);
	Song deleteSongByName(Strings songName);
	void createSong(Song song);
	Song createSongByName(Strings songName);
	void updateSong(Song song);
	Song updateSongByName(Strings songname);
	Song updateSongByGenre(Strings genre);
	Song updateSongByArtist(Strings songArtist);
}
