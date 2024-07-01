package com.example.nexa.controller;

import com.example.nexa.entity.ColorPallet;
import com.example.nexa.service.ColorPalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/colorpallet")
public class ColorPalletController {

    @Autowired
    private ColorPalletService colorPalletService;

    @PostMapping("/saveColorpallet")
    public ColorPallet saveColorPallet(@RequestBody ColorPallet colorPallet) {
        colorPallet.setFeedback(null); // Not handling feedback now
        colorPallet.setFeedback_url(null); // Not handling feedback URL now
        return colorPalletService.saveColorPallet(colorPallet);
    }
}
