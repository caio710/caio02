package com.example.aul2.Exception;

import jakarta.validation.constraints.Email;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;

@RestControllerAdvice
public class UsuarioException {
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<Map<String,Object>>IllegalArgumentException(IllegalArgumentException erro){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Map.of("mensagem",erro.getMessage()));
    }
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String,Object>>MethoArgumentNotValidException(MethodArgumentNotValidException erro){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Map.of("mensagem",erro.getMessage()));
    }
}
