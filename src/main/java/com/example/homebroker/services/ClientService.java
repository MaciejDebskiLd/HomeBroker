package com.example.homebroker.services;

import com.example.homebroker.models.Client;
import com.example.homebroker.repositories.AbstractRepository;
import com.example.homebroker.repositories.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    private ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public void deleteById(int id){
        clientRepository.deleteById(id);
    }

    public List<Client> getAll(){
        return clientRepository.getAll();
    }


    public Client getClient(int id){
        return clientRepository.findById(id);
    }

    public Client create(Client client){
        return clientRepository.add(client);
    }

    public Client update(int id, Client client){
        return clientRepository.updateById(id, client);
    }
}
