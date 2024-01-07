package com.example.polls.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.polls.model.settings;
import com.example.polls.repository.SettingsRepository;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("*")
public class SettingsController {

    private SettingsRepository settingsRepository ;


    @GetMapping("/all")
    public ResponseEntity<?> getALlSettings()
    {
        
        List<settings> allsettings = settingsRepository.findAll();
        return  ResponseEntity.ok().body(allsettings);

    }
    
}
