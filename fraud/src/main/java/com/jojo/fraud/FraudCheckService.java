package com.jojo.fraud;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * @author João Vitor Lopes
 */
@Service
@AllArgsConstructor
public class FraudCheckService {

    private final FraudCheckHistoryRepository fraudCHeckHistoryRepository;

    public boolean isFraudulentCustomer(Integer customerId) {
        fraudCHeckHistoryRepository.save(
                FraudCheckHistory.builder()
                        .customerId(customerId)
                        .isFraudster(false)
                        .createdAt(LocalDateTime.now())
                        .build()
        );
        return false;
    }
}
