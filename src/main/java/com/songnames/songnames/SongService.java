package com.songnames.songnames;

import org.springframework.stereotype.Service;


@Service
public interface SongService {
	List<SongModel> listAllSongs();
}
