package com.songnames.songnames;

import org.junit.jupiter.api.Test;
import org.thymeleaf.expression.Dates;
import org.thymeleaf.expression.Strings;

public record ArrayList(Strings songname, Strings songArtist, Dates releaseDate, Strings genre1, Strings recordCompany1 ) {
	this.songname = songname;
	this.songArtist = songArtist;
	this.releaseDate = releaseDate;
	this.genre1 = genre1;
	this.recordCompany1 = recordCompany1;
}


@Test 
public void givenValidSong_whenGetSongName_thenExpectedValuesReturned() {
	Strings songname = "Winds of Change";
	Strings songArtist = "Scorpion";
	Dates releaseDate = "4 October 1972";
	Strings genre = "rock";
	Strings recordCompany = "Ariola";
	assertEquals(songname, songModel.name());
	assertEquals(songArtist, songModel.songArtist());

}


// java records https://www.baeldung.com/java-record-keyword //