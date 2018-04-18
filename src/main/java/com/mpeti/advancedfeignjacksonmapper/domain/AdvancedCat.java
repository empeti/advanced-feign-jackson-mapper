package com.mpeti.advancedfeignjacksonmapper.domain;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Builder;
import lombok.Data;

import java.util.List;


@Builder
public class AdvancedCat {
    private String name;
    private List<CatToy> toys;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonDeserialize(contentUsing = CatToy.class)
    public List<CatToy> getToys() {
        return toys;
    }

    public void setToys(List<CatToy> toys) {
        this.toys = toys;
    }
}
