package com.loja.controller;

import com.loja.repository.FavoritoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FavoritoController {
    @Autowired
    private FavoritoRepository favoritoRepository;

    @GetMapping("/favoritos")
    public String exibirFavoritos(Model model) {
        model.addAttribute("favoritos", favoritoRepository.findAll());
        return "exibir_favoritos";
    }
}

