package com.songnames.songnames;

import org.springframework.ui.Model;
import org.thymeleaf.expression.Lists;


public class BindTableDataTL {
	private Lists<Song> songs;
	
	public void addSongs(Song song) {
		this.songs.add(song);
	}
}

@GetMapping("/create")
public String showCreateData(Model model) {
	songCreationDto songForm = new songCreationDto();
	
	for (int i = 1; i <= n; i++) {
		songForm.addSongs(new Song());
	}
	model.addAttribute("songData", songForm);
	return "songs/creatSongsForm";
}

<form action="#" th:action="@{/songs/safe}" th:objects="${form}" method="post">
	<fieldset>
		<input type="submit" id="submitBtn" th:value="Save Song">
		<input type="reset" id="resetBtn" th:value="Reset Song">
		<table>
			<tr>
				<th>Song Name</th>
				<th>Song Artist</th>
				<th>Release Date</th>
				<th>Genre</th>
			</tr>
			<thead>
				<tr>
					<th>Song Name</th>
					<th>Song Artist</th>
					<th>Release Date</th>
					<th>Genre</th>
				</tr>
			</thead>
			<tbody>
				<tr th:each="song, itemStat : *{songs}">
					<td><input th:field="*{songs[__${itemStat.index}__].songName"/></td>
					<td><input th:field="*{songs[__${itemStat.index}__].songArtist"/></td>
					<td><input th:field="*{songs[__${itemStat.index}__].releaseDate"/></td>
					<td><input th:field="*{songs[__${itemStat.index}__].genre"/></td>
				</tr>
			</tbody>
		</table>
	</fieldset>
</form>

//
