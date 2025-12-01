package com.gerenciadormidias.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.gerenciadormidias.service.MidiaService;
import com.gerenciadormidias.model.Midia;

@RestController
@RequestMapping("/midias")
public class MidiaController {

    @Autowired
    private MidiaService service;

    @GetMapping
    public List<Midia> listar(){ return service.listar(); }

    @PostMapping
    public Midia criar(@RequestBody Midia m){ return service.criar(m); }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){ service.deletar(id); }
}
