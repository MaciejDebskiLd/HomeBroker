package com.example.homebroker.utils;

import com.example.homebroker.models.City;
import com.example.homebroker.models.Client;
import com.example.homebroker.models.HomeType;
import com.example.homebroker.models.Offer;
import com.example.homebroker.repositories.ClientRepository;
import com.example.homebroker.repositories.OfferRepository;
import org.springframework.stereotype.Component;

@Component
public class BootStrap {

    private OfferRepository offerRepository;
    private ClientRepository clientRepository;

    public BootStrap(OfferRepository offerRepository, ClientRepository clientRepository) {
        this.offerRepository = offerRepository;
        this.clientRepository = clientRepository;
    }

    public void initializeRepository(){

        Client client1 = Client.of("Jan", "Kowalski");
        Client client2 = Client.of("Adam", "Nowak");

        clientRepository.add(client1);
        clientRepository.add(client2);

        Offer offer1 = Offer.of(client1, HomeType.HOUSE, City.WARSZAWA, "Testowa 1", 120, 6);
        Offer offer2 = Offer.of(client1, HomeType.FLAT, City.WARSZAWA, "Testowa 10", 30, 3);
        Offer offer3 = Offer.of(client2, HomeType.HOUSE, City.KATOWICE, "Testowa 10", 30, 2);
        Offer offer4 = Offer.of(client2, HomeType.APARTMENT, City.KRAKOW, "Testowa 20", 80, 4);

        offerRepository.add(offer1);
        offerRepository.add(offer2);
        offerRepository.add(offer3);
        offerRepository.add(offer4);
    }
}
