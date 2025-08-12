package br.com.fiap3esa.fiap_soa_spring_boot.instrutor;

import br.com.fiap3esa.fiap_soa_spring_boot.endereco.DadosEndereco;

public record DadosCadastroInstrutor(
        String nome, String email, String cnh, Especialidade especialidade, DadosEndereco endereco

) {
}
