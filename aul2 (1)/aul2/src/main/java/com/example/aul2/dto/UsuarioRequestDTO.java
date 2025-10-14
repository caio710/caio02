package com.example.aul2.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class UsuarioRequestDTO {
    @NotBlank(message = "o nome é obrigatorio.")
    private String nome;
    @NotBlank(message = "O E-mail é obrigatorio.")
    @Email(message = "Deve ser um e-mail valido.")
    private String email;
    @NotBlank(message = "A senha é obrigatorio.")
    @Size(min = 5, message = "A senha deve ter no minimo 5 caracteres.")
    private String senha;
}
