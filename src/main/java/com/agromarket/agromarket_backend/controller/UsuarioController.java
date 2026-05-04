package com.agromarket.agromarket_backend.controller;

import com.agromarket.agromarket_backend.model.UsuarioDTO;
import com.agromarket.agromarket_backend.service.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
@CrossOrigin(origins = "*")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/registro")
    public String registrar(@RequestBody UsuarioDTO usuario) {
        return usuarioService.registrar(usuario);
    }

    @PostMapping("/login")
    public String login(@RequestBody UsuarioDTO usuario) {
        return usuarioService.login(usuario);
    }

    @GetMapping
    public List<UsuarioDTO> listar() {
        return usuarioService.listar();
    }

    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable String id) {
        return usuarioService.eliminar(id);
    }
    @PutMapping("/{id}")
    public UsuarioDTO actualizar(@PathVariable String id, @RequestBody UsuarioDTO usuario) {
        return usuarioService.actualizar(id, usuario);
    }
}