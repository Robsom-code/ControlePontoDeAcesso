package com.robsom.controle.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited
public class NivelAcesso {

    @Id
    private long id;
    private String descricao;

}
