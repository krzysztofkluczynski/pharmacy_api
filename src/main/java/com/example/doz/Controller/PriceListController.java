package com.example.doz.Controller;

import com.example.doz.Model.PriceList;
import com.example.doz.Service.PriceListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pricelists")
public class PriceListController {
    private final PriceListService priceListService;

    @Autowired
    public PriceListController(PriceListService priceListService) {
        this.priceListService = priceListService;
    }

    @GetMapping
    public ResponseEntity<List<PriceList>> getAllPriceLists() {
        List<PriceList> priceLists = priceListService.getAllPriceLists();
        return new ResponseEntity<>(priceLists, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<PriceList> addPriceList(@RequestBody PriceList priceList) {
        PriceList createdPriceList = priceListService.addPriceList(priceList);
        return new ResponseEntity<>(createdPriceList, HttpStatus.CREATED);
    }
}
