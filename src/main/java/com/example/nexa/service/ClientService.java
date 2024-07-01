package com.example.nexa.service;

import com.example.nexa.dto.ClientDTO;
import com.example.nexa.entity.Client;
import com.example.nexa.repository.ClientRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private ModelMapper modelMapper;

    public Client saveClient(ClientDTO clientDTO) {
        Client client = new Client();
        client.setEmail(clientDTO.getEmail());
        client.setGender(clientDTO.getGender());
        client.setName(clientDTO.getName());
        client.setBdate(clientDTO.getBdate());
        client.setPassword(clientDTO.getPassword());
        client.setUserGroup(null);

        return clientRepository.save(client);
    }

    public ClientDTO getClientByClientEmailAndPassword(String email, String password) {
        Client client = clientRepository.getClientByClientEmailAndPassword(email, password);
        return modelMapper.map(client, ClientDTO.class);
    }

    public boolean checkEmailExists(String email) {
        return clientRepository.existsByEmail(email);
    }
}
