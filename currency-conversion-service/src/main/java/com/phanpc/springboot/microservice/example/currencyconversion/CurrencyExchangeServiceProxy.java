package com.phanpc.springboot.microservice.example.currencyconversion;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

// giao tiếp với forex-service, là service nội bộ trong microservice system này (đều được registry với discovery-service)
@FeignClient(name = "forex-service")
public interface CurrencyExchangeServiceProxy {

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    CurrencyConversionBean retrieveExchangeValue(@PathVariable("from") String from,
                                                 @PathVariable("to") String to);
}