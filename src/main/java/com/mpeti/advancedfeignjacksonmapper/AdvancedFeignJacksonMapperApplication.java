package com.mpeti.advancedfeignjacksonmapper;

import com.mpeti.advancedfeignjacksonmapper.domain.AdvancedCat;
import com.mpeti.advancedfeignjacksonmapper.service.AdvancedCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableFeignClients
public class AdvancedFeignJacksonMapperApplication {
    @Autowired
    private AdvancedCatService advancedCatService;

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(AdvancedFeignJacksonMapperApplication.class, args);
        AdvancedFeignJacksonMapperApplication app = context.getBean(AdvancedFeignJacksonMapperApplication.class);
        System.out.println(app.getAdvancedCat());
    }

    public AdvancedCat getAdvancedCat() {
        return advancedCatService.getAdvancedCat();
    }
}
