package com.loja.controller;

import com.loja.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProdutoController {
    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping("/produtos")
    public String listarProdutos(Model model) {
        model.addAttribute("produtos", produtoRepository.findAll());
        return "listar_produtos";
    }
}

