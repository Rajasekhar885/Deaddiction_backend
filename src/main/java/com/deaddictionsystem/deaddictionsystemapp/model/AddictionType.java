package com.deaddictionsystem.deaddictionsystemapp.model;

public enum AddictionType {
    ALCOHOL("Alcohol"),
    DRUGS("drugs"),
    GAMBLING("Gambling"),
    VIDEOGAMES("Video games"),
    SHOPPING("Shopping");

    private final String addiction;

    AddictionType(String addiction) {
        this.addiction = addiction;
    }
}
