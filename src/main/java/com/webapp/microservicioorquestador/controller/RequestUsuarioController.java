package com.webapp.microservicioorquestador.controller;

import com.webapp.microservicioorquestador.dto.UsuarioDto;
import com.webapp.microservicioorquestador.proxy.RequestUsuarioProxy;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class RequestUsuarioController {

    private final RequestUsuarioProxy usuarioProxy;

    @PostMapping("/request")
    public ResponseEntity<?> handleRequest(@RequestBody @Valid UsuarioDto requestData) {
        return ResponseEntity.ok().body(usuarioProxy.insert(requestData));
    }
}
