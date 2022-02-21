package se.marcus.microservices.exchangeservice.service;

import org.springframework.stereotype.Service;

@Service
public class ConversionService {

    public Double convert(Double amount, String currency, String preferredCurrency) {
        //TODO validate rela currency and get current diff.
        //hard coded from SEK to USD for now
        return amount * 0.11;
    }
}
