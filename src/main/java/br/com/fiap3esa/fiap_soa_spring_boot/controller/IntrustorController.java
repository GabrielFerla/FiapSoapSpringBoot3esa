package br.com.fiap3esa.fiap_soa_spring_boot.controller;


import br.com.fiap3esa.fiap_soa_spring_boot.instrutor.DadosCadastroInstrutor;
import br.com.fiap3esa.fiap_soa_spring_boot.instrutor.Instrutor;
import br.com.fiap3esa.fiap_soa_spring_boot.instrutor.InstrutorRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/instrutores")

public class IntrustorController {

    @Autowired
    InstrutorRepository repository;

    @PostMapping
    @Transactional
    public void cadastrarInstrutor(@RequestBody DadosCadastroInstrutor dados){

        System.out.println(dados);
        repository.save(new Instrutor(dados));
    }
}
