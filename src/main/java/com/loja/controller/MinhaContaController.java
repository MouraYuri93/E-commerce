package com.loja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MinhaContaController {

    @GetMapping("/minhaconta")
    public String minhaConta(Model model) {
        // Implemente a lógica para recuperar os dados do usuário
        String nomeCompleto = "Nome Exemplo";
        String cpf = "cpf_exemplo";
        String email = "email@exemplo.com";
        String telefone = "telefone_exemplo";
        String cep = "cep_exemplo";
        String endereco = "endereço_exemplo";
        String rua = "rua_exemplo";
        String bairro = "bairro_exemplo";
        String cidade = "cidade_exemplo";

        // Adicione os dados do usuário ao modelo
        model.addAttribute("nomeCompleto", nomeCompleto);
        model.addAttribute("cpf", cpf);
        model.addAttribute("email", email);
        model.addAttribute("telefone", telefone);
        model.addAttribute("cep", cep);
        model.addAttribute("endereco", endereco);
        model.addAttribute("rua", rua);
        model.addAttribute("bairro", bairro);
        model.addAttribute("cidade", cidade);

        return "minha_conta";
    }
}
