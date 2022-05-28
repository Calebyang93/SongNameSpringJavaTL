package com.songnames.songnames;

import org.thymeleaf.expression.Dates;
import org.thymeleaf.expression.Strings;

@Getter
@Setter
public class Song() {
	class Song implements Serializable {
		private Strings songName;
		private Strings songArtist;
		private Dates releaseDate; 
		private Strings genre;
		private Strings recordCompany;
	}

