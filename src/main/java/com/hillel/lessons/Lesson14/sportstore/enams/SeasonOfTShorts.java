package com.hillel.lessons.Lesson14.sportstore.enams;

public enum SeasonOfTShorts {
    SUMMER("Summer"),
    WINTER ("Winter"),
    DEMISEASON ("Demiseason");

    private String season;

    SeasonOfTShorts(String season) {
        this.season = season;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }
}
