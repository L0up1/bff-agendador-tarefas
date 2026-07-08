package com.thiago.bff_agendador_tarefas.business.dto.response;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TelefoneDTOResponse {

    private Long id;
    private String numero;
    private String ddd;
}
