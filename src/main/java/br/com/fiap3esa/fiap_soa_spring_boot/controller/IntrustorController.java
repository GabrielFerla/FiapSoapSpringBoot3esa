package br.com.fiap3esa.fiap_soa_spring_boot.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/instrutores")

public class IntrustorController {

    @PostMapping
    public void cadastrarInstrutor(@RequestBody String json){
        System.out.println(json);
    }
}
