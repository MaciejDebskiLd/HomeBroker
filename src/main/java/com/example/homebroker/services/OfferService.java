package com.example.homebroker.services;

import com.example.homebroker.models.Offer;
import com.example.homebroker.repositories.OfferRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OfferService {

    private OfferRepository offerRepository;

    public OfferService(OfferRepository offerRepository) {
        this.offerRepository = offerRepository;
    }

    public List<Offer> getAll(){
        return offerRepository.getAll();
    }

    public Offer get(int id){
        return offerRepository.findById(id);
    }

    public Offer create(Offer offer){
        return offerRepository.add(offer);
    }

    public Offer update(int id, Offer offer){
        return offerRepository.updateById(id, offer);
    }

    public void delete(int id){
        offerRepository.deleteById(id);
    }
}
