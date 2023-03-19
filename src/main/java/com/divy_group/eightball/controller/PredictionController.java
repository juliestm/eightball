package com.divy_group.eightball.controller;

import com.divy_group.eightball.dto.PredictionResponseDto;
import com.divy_group.eightball.service.PredictionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({ "api/prediction" })
public class PredictionController {

    public final PredictionService predictionService;

    public PredictionController(PredictionService predictionService) {
        this.predictionService = predictionService;
    }

    @GetMapping("/{name}")
    public PredictionResponseDto getPrediction(
//            @Parameter(description = "Имя пользователя", example = "Вика")
            @PathVariable String name) {
        return predictionService.getResponseDto(name);
    }
}
