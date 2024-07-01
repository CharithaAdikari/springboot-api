package com.example.nexa.controller;

import com.example.nexa.dto.ClientDTO;
import com.example.nexa.entity.Client;
import com.example.nexa.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @PostMapping("/saveClient")
    public Client registerClient(@RequestBody ClientDTO clientDTO) {
        return clientService.saveClient(clientDTO);
    }

    @GetMapping("/getClientByClientEmailAndPassword/{clientEmail}/{password}")
    public ClientDTO getClientByClientEmailAndPassword(@PathVariable String clientEmail, @PathVariable String password) {
        System.out.println("Client Email :" + clientEmail + " Password :" + password);
        return clientService.getClientByClientEmailAndPassword(clientEmail, password);
    }

    @PostMapping("/check-email")
    public boolean checkEmailExists(@RequestBody String email) {
        return clientService.checkEmailExists(email);
    }
}
