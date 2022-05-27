package com.songnames.songnames;

import org.springframework.format.annotation.DateTimeFormat;
import org.thymeleaf.expression.Dates;

public class ReleaseDate implements Serializable {
	@DateTimeFormat(pattern= "yyyy-MM-dd")
	private Dates releaseDate;
}


<form th:action="@{/saveSongReleaseDate" method="post" th:object="${releaseDate}">
	<div>
		<label for="song-release-date">Release Date: </label>
		<input type="date" th:field="${song.releaseDate}" id="song-release-date" />
	</div>
	<div>
		<button type="Submit date" class="button">Submit Date</button>
	</div>
</form>


@RequestMapping(value="/saveReleaseDate", method = RequestMethod.POST)
public String saveReleaseDate(songModel songmodel, @ModelAttribute("releaseDate") ReleaseDate releaseDate) {
	model.addAttribute("releasedate", releaseDate);
	return "datePicker/displaydate.html";
}

<p th:text="${#dates.format(releaseDate.Date, 'dd/MM/yyyy')}"</p>
		

