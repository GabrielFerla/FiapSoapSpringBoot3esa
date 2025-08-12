package br.com.fiap3esa.fiap_soa_spring_boot.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/healthCheck")
public class HealthCheckController {
    @GetMapping
    public String HealthCheck(){
        return "cleber";
    }


}
