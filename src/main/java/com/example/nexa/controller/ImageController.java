package com.example.nexa.controller;

import com.example.nexa.service.S3Service;
import com.example.nexa.entity.InteriorImage;
import com.example.nexa.repository.InteriorImageRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/images")
public class ImageController {

    @Autowired
    private S3Service s3Service;

    @Autowired
    private InteriorImageRepository interiorImageRepository;

    @PostMapping("/room")
    public ResponseEntity<Map<String, Object>> uploadRoomImage(@RequestParam("file") MultipartFile file, @RequestParam("clientid") Long clientid) throws IOException {
        String keyName = "room-images/" + file.getOriginalFilename();
        File convertedFile = convertMultipartFileToFile(file);
        String imageUrl = s3Service.uploadFile(convertedFile.getAbsolutePath(), keyName);

        InteriorImage image = new InteriorImage();
        image.setClientid(clientid);
        image.setRoomImageUrl(imageUrl);
        interiorImageRepository.save(image);

        Map<String, Object> response = new HashMap<>();
        response.put("imageid", image.getImageid());
        response.put("imageUrl", imageUrl);

        return ResponseEntity.ok(response);
    }

    @PostMapping("/feedback")
    public String uploadFeedbackImage(@RequestParam("file") MultipartFile file, @RequestParam("clientid") Long clientid) throws IOException {
        String keyName = "feedback-images/" + file.getOriginalFilename();
        File convertedFile = convertMultipartFileToFile(file);
        String imageUrl = s3Service.uploadFile(convertedFile.getAbsolutePath(), keyName);

        InteriorImage image = new InteriorImage();
        image.setClientid(clientid);
        image.setRoomImageUrl(imageUrl);  // Assuming same URL field is used
        //image.setTimeStamp(new Timestamp(System.currentTimeMillis()));
        interiorImageRepository.save(image);

        return imageUrl;
    }

    @PostMapping("/augmented")
    public String uploadAugmentedImage(@RequestParam("file") MultipartFile file, @RequestParam("clientid") Long clientid) throws IOException {
        String keyName = "augmented-images/" + file.getOriginalFilename();
        File convertedFile = convertMultipartFileToFile(file);
        String imageUrl = s3Service.uploadFile(convertedFile.getAbsolutePath(), keyName);

        InteriorImage image = new InteriorImage();
        image.setClientid(clientid);
        image.setAugmentedImageUrl(imageUrl);
        image.setTimeStamp(new Timestamp(System.currentTimeMillis()));
        interiorImageRepository.save(image);

        return imageUrl;
    }

    private File convertMultipartFileToFile(MultipartFile file) throws IOException {
        File convertedFile = new File(file.getOriginalFilename());
        try (FileOutputStream fos = new FileOutputStream(convertedFile)) {
            fos.write(file.getBytes());
        }
        return convertedFile;
    }
}
