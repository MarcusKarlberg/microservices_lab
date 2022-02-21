package se.marcus.microservices.billingservice.controller;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import se.marcus.microservices.billingservice.proxy.ExchangeServiceProxy;
import se.marcus.microservices.billingservice.service.BillingService;

import java.time.LocalDateTime;

@RestController
@RequestMapping("billing")
public class CalculateBill {

    private BillingService billingService;

    private ExchangeServiceProxy proxy;

    public CalculateBill(BillingService billingService, ExchangeServiceProxy proxy) {
        this.billingService = billingService;
        this.proxy = proxy;
    }

    //Using feign and proxy
    //Hardcoded SEK to US-Dollars conversion
    @GetMapping("/{rate}/{start}/{end}/{currency}")
    public Double calculateTotal(@PathVariable Double rate,
                                          @PathVariable @DateTimeFormat(pattern="yyyy-MM-dd'T'HH:mm:ss")  LocalDateTime start,
                                          @PathVariable @DateTimeFormat(pattern="yyyy-MM-dd'T'HH:mm:ss") LocalDateTime end, @PathVariable String currency) {
        Double totalInSek = billingService.calculateTotal(rate, start, end);

        return proxy.convertAmount(totalInSek, "SEK", "USD");
    }
}
