package se.marcus.microservices.exchangeservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se.marcus.microservices.exchangeservice.service.ConversionService;

@RestController
@RequestMapping("convert")
public class ConversionController {

    private ConversionService conversionService;

    public ConversionController(ConversionService conversionService) {
        this.conversionService = conversionService;
    }

    @GetMapping("{amount}/{currency}/to/{preferredCurrency}")
    public Double convertAmount(@PathVariable Double amount, @PathVariable String currency, @PathVariable String preferredCurrency) {
        return conversionService.convert(amount, currency, preferredCurrency);
    }
}
