package com.agromarket.agromarket_backend.controller;

import com.agromarket.agromarket_backend.model.UsuarioDTO;
import com.agromarket.agromarket_backend.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/usuarios")
@CrossOrigin(origins = "*")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    @PostMapping("/registro")
    public String registrar(@RequestBody UsuarioDTO usuario) {

        if (usuario.getNombre() == null || usuario.getCorreo() == null) {
            return "Datos incompletos";
        }

        if (!usuario.getPassword().equals(usuario.getConfirmarPassword())) {
            return "Las contraseñas no coinciden";
        }

        if (usuario.getRol() == null || usuario.getRol().isEmpty()) {
            return "El rol es obligatorio";
        }

        String rol = usuario.getRol().toUpperCase();

        if (!rol.equals("COMPRADOR") && !rol.equals("VENDEDOR")) {
            return "Rol invalido";
        }

        if (usuarioRepository.findByCorreo(usuario.getCorreo()).isPresent()) {
            return "El correo ya esta registrado";
        }

        usuario.setRol(rol);


        usuario.setPassword(encoder.encode(usuario.getPassword()));

        usuarioRepository.save(usuario);

        return "Usuario registrado correctamente";
    }

    @PostMapping("/login")
    public String login(@RequestBody UsuarioDTO usuario) {

        Optional<UsuarioDTO> encontrado =
                usuarioRepository.findByCorreo(usuario.getCorreo());

        if (encontrado.isEmpty()) {
            return "Usuario no encontrado";
        }

        UsuarioDTO user = encontrado.get();

        if (encoder.matches(usuario.getPassword(), user.getPassword())) {
            return "Login correcto";
        } else {
            return "Credenciales incorrectas";
        }
    }

    @GetMapping
    public List<UsuarioDTO> listar() {
        return usuarioRepository.findAll();
    }

    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable String id) {

        if (!usuarioRepository.existsById(id)) {
            return "Usuario no encontrado";
        }

        usuarioRepository.deleteById(id);

        return "Usuario eliminado correctamente";
    }
}