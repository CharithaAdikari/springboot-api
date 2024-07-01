package com.example.nexa.service;

import com.example.nexa.dto.ClientDTO;
import com.example.nexa.dto.ClientNameDTO;
import com.example.nexa.entity.Client;
import com.example.nexa.repository.ClientRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private ModelMapper modelMapper;

    public Client saveClient(ClientDTO clientDTO) {
        Client client = new Client();
        ClientNameDTO clientNameDTO = new ClientNameDTO();
        client.setEmail(clientDTO.getEmail());
        client.setGender(clientDTO.getGender());
        //add client name
        clientNameDTO.setFname(clientNameDTO.getFname());
        clientNameDTO.setLname(clientNameDTO.getLname());
        client.setBirthDate(clientDTO.getBirthDate());
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

    //feedback
    @Transactional
    public void saveFeedback(String email, String comment , String question1, String question2, String question3, String question4 ,String url) {
        clientRepository.insertFeedback(email, comment, question1, question2, question3, question4,url);
    }

}
