package com.songname.springboot.model;



import org.thymeleaf.expression.Strings;

@Entity
@Table(name= "song")

public class Song {
@songId
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long songId;

@Column(name="songId1")
private long songId1;
public void setId(long songId1) {
	this.songId1 = songId1;
}

@Column(name="songName")
private Strings songName;
public Strings getSongName() {
	return songName;
}
public void setSongName(Strings songName) {
	this.songName = songName;
}

@Column(name="songArtist")
private Strings songArtist;
public Strings getsongArtist() {
	return songArtist;
}
public void setSongArtist(Strings songArtist) {
	this.songArtist = songArtist;
}

@Column(name="songReleaseDate")
private Dates songReleaseDate;
public Strings getSongReleaseDate() {
	return songReleaseDate;
}
public void setSongReleaseDate(Dates songReleaseDate) {
	this.songReleaseDate = songReleaseDate;
}

@Column(name="songGenre")
private Strings songGenre;
public Strings getSongGenre() {
	return songGenre;
}
public void setSongGenre(Strings songGenre) {
	this.songGenre = songGenre;
}


}
