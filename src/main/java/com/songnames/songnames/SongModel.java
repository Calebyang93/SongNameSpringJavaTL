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


public class Song() {
	class song implements Serializable {
		private Strings songName;
		private Strings songArtist;
		private Dates releaseDate; 
		private Strings genre;
		private Strings recordCompany;
	}

}

// html code block: <td> <span th:if="${song.songname} == 'Winds of Change' th:text="Winds of Change" /> //
// <span th:if="${song.songArtist} == "Scorpions" th:text="Scorpions" />  //
// <span th:if="${song.releaseDate} == " 4 October 1972" th:date= "04/10/1972"/> //
// <span th:if="${song.genre} == "rock" th:text="rock" /> //
// <span th:if=${song.recordCompany} == "East West"> //
// </td> //