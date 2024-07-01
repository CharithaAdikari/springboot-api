package com.example.nexa.controller;

import com.example.nexa.dto.PreferencesDTO;
import com.example.nexa.entity.Preferences;
import com.example.nexa.service.PreferencesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/preferences")
public class PreferencesController {

    @Autowired
    private PreferencesService preferencesService;

    @PostMapping("/save-preferences")
    public Preferences savePreferences(@RequestBody PreferencesDTO preferencesDTO) {
        return preferencesService.savePreferences(preferencesDTO);
    }
}
