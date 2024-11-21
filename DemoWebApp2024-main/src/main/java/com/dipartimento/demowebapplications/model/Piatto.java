package com.dipartimento.demowebapplications.model;

import lombok.*;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Piatto {

    public Piatto(String string, String string2) {
        //TODO Auto-generated constructor stub
    }
    private String nome;
    private String ingredienti;
    protected List<Ristorante> ristoranti;
}

