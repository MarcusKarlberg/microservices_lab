package se.marcus.microservices.billingservice.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="exchange-service")
public interface ExchangeServiceProxy {

    @GetMapping("convert/{amount}/{currency}/to/{preferredCurrency}")
    public Double convertAmount(@PathVariable Double amount,
                                @PathVariable String currency,
                                @PathVariable String preferredCurrency);
}
