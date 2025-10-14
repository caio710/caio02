package com.example.aul2.Controller;

import com.example.aul2.Service.UsuarioService;
import com.example.aul2.dto.UsuarioRequestDTO;
import com.example.aul2.dto.UsuarioResponseDTO;
import jakarta.servlet.Servlet;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public ResponseEntity<List<UsuarioResponseDTO>>Listar(){
        return ResponseEntity.status(HttpStatus.OK).body(usuarioService.getUsuario());
    }
    @PostMapping

    public ResponseEntity<Map<String, Object>>salvar(@Valid @RequestBody UsuarioRequestDTO usuarioRequestDTO){
        usuarioService.seveUsuario(usuarioRequestDTO);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("*/{id}")
                .buildAndExpand().toUri();

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(Map.of("messagem","Usuario cadastrado com sucesso"));
    }


}
