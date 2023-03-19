package com.divy_group.eightball.dto;

public class PredictionResponseDto {

    String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public PredictionResponseDto(String text) {
        this.text = text;
    }

}
