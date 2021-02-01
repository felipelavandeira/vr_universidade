package com.lavandeira.vr_universidade;

import com.lavandeira.vr_universidade.view.PrincipalView;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VrUniversidadeApplication {

    public static void main(String[] args) {
        PrincipalView view = new PrincipalView();
        view.setVisible(true);
    }

    public static void runSpringServer(String[] args) {
        SpringApplication.run(VrUniversidadeApplication.class, args);
    }

}
