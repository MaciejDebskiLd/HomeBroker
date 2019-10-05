package com.example.homebroker.controllers;

import com.example.homebroker.models.Client;
import com.example.homebroker.services.ClientService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {
    private ClientService clientService;

    public ClientController(ClientService clientService){
        this.clientService = clientService;
    }

    @GetMapping("")
    public List<Client> getClients(){
        return clientService.getAll;
    }

    @GetMapping("/{id}")
    public Client getClient(@PathVariable("id") int id){
        return clientService.get(id);
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Client createOffer(@RequestBody Client client){
        return clientService.create(client);
    }

    @PutMapping("/{id}")
    public Client updateClient(PathVariable("id") int id, @RequestBody Client client){
        return clientService.update(id, client);
    }

    @DeleteMapping("/{id}")
    public String deleteClient(@PathVariable("id") int id){
        clientService.delete(id);
        return "OK";
    }



}
