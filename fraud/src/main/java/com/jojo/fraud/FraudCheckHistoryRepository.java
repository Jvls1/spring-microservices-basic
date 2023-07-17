package com.jojo.fraud;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author João Vitor Lopes
 */
public interface FraudCheckHistoryRepository
        extends JpaRepository<FraudCheckHistory, Integer> {
}
