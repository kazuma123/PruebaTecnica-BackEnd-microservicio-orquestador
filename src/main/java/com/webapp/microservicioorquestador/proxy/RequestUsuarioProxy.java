package com.webapp.microservicioorquestador.proxy;

import com.webapp.microservicioorquestador.dto.UsuarioDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "usuario", url = "${URL_DOMINIO}/api/usuario")
public interface RequestUsuarioProxy {
    @PostMapping("/insert")
    ResponseEntity<?> insert(@RequestBody UsuarioDto dto);
}
