package com.itspacelab.fraud;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class FraudCheckService {
    private final FraudCheckHistoryRepository fraudCheckHistoryRepository;

    public boolean isFraudulentCustomer(Integer customerId){
        fraudCheckHistoryRepository.save(
            FraudCheckHistory.builder()
                    .createdAt(LocalDateTime.now())
                    .customerId(customerId)
                    .isFraudster(false)
                    .build()
        );
        return false;
    }
}
