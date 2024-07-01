package com.example.nexa.service;

import com.example.nexa.dto.PreferencesDTO;
import com.example.nexa.entity.Client;
import com.example.nexa.entity.Preferences;
import com.example.nexa.repository.ClientRepository;
import com.example.nexa.repository.PreferencesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PreferencesService {

    @Autowired
    private PreferencesRepository preferencesRepository;

    @Autowired
    private ClientRepository clientRepository;

    public Preferences savePreferences(PreferencesDTO preferencesDTO) {
        Client client = clientRepository.findById(preferencesDTO.getClientID())
                .orElseThrow(() -> new RuntimeException("Client not found"));

        Preferences preferences = new Preferences();
        preferences.setClient(client);
        preferences.setAgeGroup(preferencesDTO.getAgeGroup());
        preferences.setArchitecturalStyle(preferencesDTO.getArchitecturalStyle());
        preferences.setBudget(preferencesDTO.getBudget());
        preferences.setClimate(preferencesDTO.getClimate());
        preferences.setColorToneTheme(preferencesDTO.getColorToneTheme());
        preferences.setFavoriteColors(preferencesDTO.getFavoriteColors());
        preferences.setLifestyle(preferencesDTO.getLifestyle());
        preferences.setNaturalLightChecked(preferencesDTO.isNaturalLightChecked());
        preferences.setNumberOfMembers(preferencesDTO.getNumberOfMembers());
        preferences.setPhotosensitivity(preferencesDTO.isPhotosensitivity());
        preferences.setRichColorChecked(preferencesDTO.isRichColorChecked());
        preferences.setpreferredAmbiance(preferencesDTO.getpreferredAmbiance());

        return preferencesRepository.save(preferences);
    }
}
