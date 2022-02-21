package se.marcus.microservices.billingservice.service;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.Period;

@Service
public class BillingService {
    public Double calculateTotal(Double dayRate, LocalDateTime start, LocalDateTime end) {
        Period period = Period.between(start.toLocalDate(), end.toLocalDate());
        if(period.isZero()) {
            return 0.0;
        }
        if(period.getDays() < 1) {
            return dayRate;
        } else {
            return period.getDays() * dayRate;
        }
    }
}
