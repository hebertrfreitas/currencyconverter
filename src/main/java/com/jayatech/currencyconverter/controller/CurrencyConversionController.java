package com.jayatech.currencyconverter.controller;

import com.jayatech.currencyconverter.controller.dto.ConversionDto;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("currencyconversions")
public class CurrencyConversionController {

    @GetMapping
    public ResponseEntity get(@RequestParam(required = false) String userId) {
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable String id) {
        return ResponseEntity.ok().build();
    }

    @PostMapping
    public ResponseEntity convert(@RequestBody ConversionDto conversionDto){
        return ResponseEntity.ok().build();
    }



}
