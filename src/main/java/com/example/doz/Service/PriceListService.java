package com.example.doz.Service;

import com.example.doz.Model.PriceList;
import com.example.doz.Repository.PriceListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PriceListService {
    private final PriceListRepository priceListRepository;

    @Autowired
    public PriceListService(PriceListRepository priceListRepository) {
        this.priceListRepository = priceListRepository;
    }

    public PriceList addPriceList(PriceList priceList) {
        return priceListRepository.save(priceList);
    }

    public List<PriceList> getAllPriceLists() {
        return priceListRepository.findAll();
    }

    public Optional<PriceList> getPriceListById(Long id) {
        return priceListRepository.findById(id);
    }

    public void deletePriceList(Long id) {
        priceListRepository.deleteById(id);
    }
}