package org.example;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DetallePedido extends Base  {
    private Integer cantidad;
    private Double subTotal;
    private Articulo articulo;

    @Override
    public String getInfo() {
        return "";
    }
}