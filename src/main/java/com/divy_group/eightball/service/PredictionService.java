package com.divy_group.eightball.service;

import com.divy_group.eightball.dto.PredictionResponseDto;
import org.springframework.stereotype.Service;

@Service
public class PredictionService {

    private static final String TEXT_FOR_PREDICTION = ", в этом году тебя ждут невероятные изменения.";

    public PredictionResponseDto getResponseDto(String name) {
        String resultText = name + TEXT_FOR_PREDICTION;
        return new PredictionResponseDto(resultText);
    }
}
