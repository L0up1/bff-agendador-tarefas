package com.thiago.bff_agendador_tarefas.infrastructure.client;

import com.thiago.bff_agendador_tarefas.business.dto.request.EnderecoDTORequest;
import com.thiago.bff_agendador_tarefas.business.dto.request.LoginRequestDTO;
import com.thiago.bff_agendador_tarefas.business.dto.request.TelefoneDTORequest;
import com.thiago.bff_agendador_tarefas.business.dto.request.UsuarioDTORequest;
import com.thiago.bff_agendador_tarefas.business.dto.response.EnderecoDTOResponse;
import com.thiago.bff_agendador_tarefas.business.dto.response.TarefasDTOResponse;
import com.thiago.bff_agendador_tarefas.business.dto.response.TelefoneDTOResponse;
import com.thiago.bff_agendador_tarefas.business.dto.response.UsuarioDTOResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "notificacao", url = "${notificacao.url}")
public interface EmailClient {

    @PostMapping
    void enviarEmail(@RequestBody TarefasDTOResponse dto);
}
