package com.example.aul2.Service;

import com.example.aul2.Model.UsuarioModel;
import com.example.aul2.Repository.UsuarioRepository;
import com.example.aul2.dto.UsuarioRequestDTO;
import com.example.aul2.dto.UsuarioResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.List;

public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private BCryptPasswordEncoder BCryptPasswordEncoder;

    public UsuarioModel seveUsuario(UsuarioRequestDTO usuarioRequestDTO){
        if (usuarioRepository.findByEmail(usuarioRequestDTO.getEmail()).isPresent()){
            throw new IllegalArgumentException(("E-email já cadastrado."));
        }
        UsuarioModel usuario = new UsuarioModel();
        usuario.setNome((usuarioRequestDTO.getNome()));
        usuario.setEmail((usuarioRequestDTO.getEmail()));
        usuario.setSenha((BCryptPasswordEncoder.encode((usuarioRequestDTO.getSenha()))));

        return usuarioRepository.save(usuario);
    }

    public List<UsuarioResponseDTO>getUsuario(){
        return usuarioRepository.findAll().stream()
                .map(u-> new UsuarioResponseDTO(u.getNome(),u.getEmail())). toList();
    }
}
