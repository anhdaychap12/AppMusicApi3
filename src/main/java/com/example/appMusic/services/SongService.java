package com.example.appMusic.services;

import com.example.appMusic.DTO.SongDTO;

import java.util.List;

public interface SongService {
    List<SongDTO> findAllSong();
    SongDTO findSongById(Integer id);

    List<SongDTO> findSongByTitle(String title);
}
