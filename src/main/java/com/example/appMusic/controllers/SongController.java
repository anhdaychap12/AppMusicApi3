package com.example.appMusic.controllers;

import com.example.appMusic.DTO.SongDTO;
import com.example.appMusic.entities.Song;
import com.example.appMusic.services.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "song")
public class SongController {
    @Autowired
    private SongService songService;
    @GetMapping
    public List<SongDTO> findAllSong(){
        return songService.findAllSong();
    }
    @GetMapping(path = "id/{id}")
    public SongDTO findSongById(@PathVariable Integer id){
        return songService.findSongById(id);
    }
    @GetMapping(path = "title/title")
    public List<SongDTO> findSongByTitle(String title){
        return songService.findSongByTitle(title);
    }
}
