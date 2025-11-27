package com.gerenciadormidias.gerenciadormidias.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.gerenciadormidias.gerenciadormidias.service.UsuarioService;
import com.gerenciadormidias.gerenciadormidias.model.Usuario;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @GetMapping
    public List<Usuario> listar(){ return service.listar(); }

    @GetMapping("/{id}")
    public Usuario obter(@PathVariable Long id){ return service.obter(id); }

    @PostMapping
    public Usuario criar(@RequestBody Usuario u){ return service.criar(u); }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){ service.deletar(id); }
}
