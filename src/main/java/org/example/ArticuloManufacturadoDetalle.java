package org.example;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ArticuloManufacturadoDetalle  extends Base {
    private Integer cantidad;
    private ArticuloInsumo articuloInsumo;

    @Override
    public String getInfo() {
        return "";
    }
}
