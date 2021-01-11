package com.experience.marvel.controllers;

import com.experience.marvel.model.Heros;
import com.experience.marvel.repository.HerosDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
public class HerosController {

    @Autowired
    private HerosDao herosDao;

    @GetMapping("/heros")
    public ResponseEntity<Object> getlistHeros () {
        return new ResponseEntity<>(herosDao.findAll(), HttpStatus.OK);
    }

    @PostMapping("/heros")
    public void addHeros(@RequestBody Heros heros) {
        herosDao.save(heros);
    }

    @Transactional
    @DeleteMapping("/heros/{name}")
    public ResponseEntity<Object> deleteHerosByName(@PathVariable String name) {
        return new ResponseEntity<>(herosDao.deleteByName(name), HttpStatus.OK);
    }
}
