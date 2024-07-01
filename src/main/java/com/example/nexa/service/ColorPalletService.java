package com.example.nexa.service;

import com.example.nexa.entity.ColorPallet;
import com.example.nexa.repository.ColorPalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ColorPalletService {

    @Autowired
    private ColorPalletRepository colorPalletRepository;

    public ColorPallet saveColorPallet(ColorPallet colorPallet) {
        return colorPalletRepository.save(colorPallet);
    }
}
