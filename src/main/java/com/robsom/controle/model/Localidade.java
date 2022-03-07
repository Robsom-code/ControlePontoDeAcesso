package com.robsom.controle.model;


import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Localidade {
    @Id
    private long id;
    @ManyToOne
    @JoinColumn(name="nivel_acesso_id")
    private NivelAcesso nivelAcesso;
    private String descricao;

}
