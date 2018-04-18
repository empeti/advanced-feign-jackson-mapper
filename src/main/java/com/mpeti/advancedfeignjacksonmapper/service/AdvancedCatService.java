package com.mpeti.advancedfeignjacksonmapper.service;

import com.mpeti.advancedfeignjacksonmapper.client.CatClient;
import com.mpeti.advancedfeignjacksonmapper.domain.AdvancedCat;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class AdvancedCatService {
    private CatClient catClient;

    public AdvancedCat getAdvancedCat(){
        return catClient.getAdvancedCat();
    }
}
