package com.thiago.bff_agendador_tarefas.business;

import com.thiago.bff_agendador_tarefas.business.dto.response.TarefasDTOResponse;
import com.thiago.bff_agendador_tarefas.infrastructure.client.EmailClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailService {

    private final EmailClient emailClient;

    public void  enviaEmail(TarefasDTOResponse dto){
        emailClient.enviarEmail(dto);
    }
}
