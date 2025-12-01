package com.gerenciadormidias.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.gerenciadormidias.repositorio.UsuarioRepository;
import com.gerenciadormidias.model.Usuario;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repo;

    public List<Usuario> listar(){ return repo.findAll(); }
    public Usuario obter(Long id){ return repo.findById(id).orElse(null); }
    public Usuario criar(Usuario u){ return repo.save(u); }
    public void deletar(Long id){ repo.deleteById(id); }
}
