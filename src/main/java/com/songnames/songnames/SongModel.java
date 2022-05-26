package com.songnames.songnames;


import org.thymeleaf.expression.Dates;
import org.thymeleaf.expression.Strings;

public class SongModel implements Serializable {
	private Strings songName;
	private Strings songArtist;
	private Dates releaseDate; 
	private Strings genre;
	private Strings recordCompany;
}


public class SongName() {
	class songName implements Serializable {
		private Strings songName;
		private Strings songArtist;
		private Dates releaseDate; 
		private Strings genre;
		private Strings recordCompany;
	}

}