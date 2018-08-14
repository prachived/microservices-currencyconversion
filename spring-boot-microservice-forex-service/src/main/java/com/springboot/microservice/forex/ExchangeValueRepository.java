package com.springboot.microservice.forex;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Prachi
 * 
 * JPA automatically provides us methods to find data
 *
 */
public interface ExchangeValueRepository extends 
    JpaRepository<ExchangeValue, Long>{
  ExchangeValue findByFromAndTo(String from, String to);
}