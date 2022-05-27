package com.songnames.songnames;

import org.thymeleaf.*;
import org.thymeleaf.expression.Dates;
import org.thymeleaf.expression.Strings;
import org.thymeleaf.spring5.webflow.view.*;


public class ConvSongFields(Strings songName, Strings songArtist,) {

}

<div th:if="${not #ArrayList.isEmpty(songmodel)}">
	<table>
		<tr>
			<th>Song Name</th>
			<th>Song Artist</th>
			<th>Release Date</th>
			<th>Genre</th>
		</tr>
		<tr th:each="songName: ${songmodel.songName}">
			<td th: text="${{songmodel.songName}}"/>
			<td th: text="${{songmodel.songArtist}}"/>
			<td th: text="${#dates.songModel.releaseDate(standardDate)}"/>
			<td th: text="${{songModel.genre}}"/>
			<td th: text="${{songModel.recordCompany}}"/>	
		</tr>
	</table>
</div>

 
