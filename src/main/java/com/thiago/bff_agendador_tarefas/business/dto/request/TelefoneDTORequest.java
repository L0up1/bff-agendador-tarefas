package com.thiago.bff_agendador_tarefas.business.dto.request;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TelefoneDTORequest {
    private String numero;
    private String ddd;
}
