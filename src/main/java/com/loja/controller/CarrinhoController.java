package com.loja.controller;

import com.loja.repository.CarrinhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CarrinhoController {
    @Autowired
    private CarrinhoRepository carrinhoRepository;

    @GetMapping("/carrinho")
    public String exibirCarrinho(Model model) {
        model.addAttribute("carrinho", carrinhoRepository.findAll());
        return "exibir_carrinho";
    }

    // Implemente o método para finalizar a compra
}

