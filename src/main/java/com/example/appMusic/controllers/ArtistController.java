package com.example.appMusic.controllers;

import com.example.appMusic.DTO.ArtistDTO;
import com.example.appMusic.entities.Artist;
import com.example.appMusic.services.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "artist")
public class ArtistController {
    @Autowired
    private ArtistService artistService;

    @GetMapping
    public List<ArtistDTO> getAllArtist(){
        return artistService.getAllArtist();
    }

    @GetMapping(path = "name/{name}")
    public List<ArtistDTO> findAllArtistByName(@PathVariable String name){
        return artistService.findArtistByName(name);
    }

    @GetMapping(path = "id/{id}")
    public List<ArtistDTO> findAllArtistById(@PathVariable Integer id){
        return artistService.findArtistById(id);
    }
}
