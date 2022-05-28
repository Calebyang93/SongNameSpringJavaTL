package com.songnames.songnames;


import java.util.ArrayList;
import org.thymeleaf.*;

public controller () {
	
List<SongModel> songmodels = new ArrayList<SongModel>();
model.addAttribute("songmodels", songmodels);
model.addAttribute("serverTime", dateFormat.format(new Date()));
model.addAttribute("localDate", localDate.now());
model.addAttribute("timestamp", Instant.now());
}

@GetMapping("/all")
public String showAll(SongModel songmodel) {
	model.addattribute("songs", SongService.findAll());
	return "songs/allSongs";
}
}

//HTML Code:   <p>Current Time is <span th:text="${serverTime}" /> </p> //
//<h1>Format ISO</h1>
//<p th:text="${#dates.formatISO(standardDate)}"></p>
//<p th:text="${#temporals.formatISO(localDateTime)}"></p>
//<p th:text="${#temporals.formatISO(localDate)}"></p>
//<p th:text="${#temporals.formatISO(timestamp)}"></p>
//java util.Date class
//${#dates.day(date)}
//${#dates.month(date)}
//${#dates.monthName(date)}
//${#dates.monthNameShort(date)}
//${#dates.year(date)}
//${#dates.dayOfWeek(date)}
//${#dates.dayOfWeekName(date)}
//${#dates.dayOfWeekNameShort(date)}
//${#dates.hour(date)}
//${#dates.minute(date)}
//${#dates.second(date)}
//${#dates.millisecond(date)}
//https://www.baeldung.com/dates-in-thymeleaf//