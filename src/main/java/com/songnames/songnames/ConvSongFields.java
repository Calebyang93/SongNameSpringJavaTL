package com.songnames.songnames;

import org.thymeleaf.*;
import org.thymeleaf.expression.Dates;
import org.thymeleaf.expression.Strings;
import org.thymeleaf.spring5.webflow.view.*;


public class ConvSongFields(Strings songName, Strings2 songArtist, Dates ReleaseDate, Strings genre, Strings recordCompany) {
	this.songName = songName;
	this.songArtist = songArtist;
	this.ReleaseDate = releaseDate;
	this.genre = genre;
	this.recordCompany = recordComapny;
}

	<table>
		<thead>
			<tr>
				<th>Song Name</th>
				<th>Song Artist</th>
				<th>Release Date</th>
				<th>Genre</th>
			</tr>
		</thead>
		<tbody>
			<tr th:if="${songs.empty}">
				<td colspan="4">No songs available</td>
			</tr>
			<tr th:each="songName: ${songModel}">
				<td th: text="${{songmodel.songName}}"/>
				<td th: text="${{songmodel.songArtist}}"/>
				<td th: text="${#dates.songModel.releaseDate(standardDate)}"/>
				<td th: text="${{songModel.genre}}"/>
				<td th: text="${{songModel.recordCompany}}"/>	
			</tr>
		</tbody>
	</table>


 
