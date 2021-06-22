package com.swar.microservice.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyExchangeRepositary extends JpaRepository<CurrencyExchange, Long> {

    CurrencyExchange findByFromAndTo(String from, String to);
}
