package org.example;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class UnidadMedida {
    private String denominacion;

    @Override
    public String toString() {
        return "UnidadMedida{" +
                "denominacion='" + denominacion + '\'' +
                '}';
    }
}