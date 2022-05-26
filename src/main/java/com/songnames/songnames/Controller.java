package com.songnames.songnames;


import java.util.ArrayList;


List<SongModel> songmodels = new ArrayList<SongModel>();
model.addAttribute("songmodels", songmodels);
model.addAttribute("serverTime", dateFormat.format(new Date()));
//HTML Code:   <p>Current Time is <span th:text="${serverTime}" /> </p> //