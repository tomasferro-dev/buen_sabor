package org.example;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        //Pais y provincia
        Pais argentina = new Pais("Argentina");
        Provincia mendoza = new Provincia("Mendoza",argentina);

        //Localidades
        Localidad maipu = new Localidad("Maipu",mendoza);
        Localidad godoyCruz = new Localidad("Godoy Cruz",mendoza);
        Localidad guaymallen = new Localidad("Guaymallen",mendoza);

        //Usuarios
        Usuario usuario1 = new Usuario("001","DavidLopez");
        Usuario usuario2 = new Usuario("002","FerroTomi");

        //direcciones
        Domicilio d1 = new Domicilio("San Martin", 1000, 5501, maipu);
        Domicilio d2 = new Domicilio("San Juan", 500, 5502, godoyCruz);


        //Domicilio

        Domicilio domicilio = new Domicilio("San Miguel", 111, 5503, guaymallen);
        Domicilio domicilio2 = new Domicilio("San Pedro", 222, 5504, godoyCruz);

        //Imagen

        Imagen imagen = new Imagen("Imagenaz");

        //Imagen

        Imagen imagen1 = new Imagen("Imagenaz");
        Imagen imagen2 = new Imagen("Imago");





        //Unidad de Medida

        UnidadMedida unidadMedida = new UnidadMedida("Kg");

        //Articulos


        ArticuloInsumo articuloInsumo1 = new ArticuloInsumo("Quilmes 1L", 5000,
                2500, 100, 150,false);

        ArticuloInsumo articuloInsumo2 = new ArticuloInsumo("Pizza Especial", 15000,
                7500, 100, 150,true);

        articuloInsumo1.addImagen(imagen1);
        articuloInsumo2.addImagen(imagen2);

        DetallePedido detallePedido1 = new DetallePedido(1,0.0);
        detallePedido1.setArticulo(articuloInsumo1);

        DetallePedido detallePedido2 = new DetallePedido(2, 0.0);
        detallePedido2.setArticulo(articuloInsumo2);


        ArticuloManufacturadoDetalle articuloManufacturadoDetalle1 = new ArticuloManufacturadoDetalle(1);
        articuloManufacturadoDetalle1.setArticuloInsumo(articuloInsumo1);

        ArticuloManufacturadoDetalle articuloManufacturadoDetalle2 = new ArticuloManufacturadoDetalle(2);
        articuloManufacturadoDetalle2.setArticuloInsumo(articuloInsumo2);

        ArticuloManufacturado articuloManufacturado1 = new ArticuloManufacturado("Esto es un art manufacturado", 50, "Se hace de esta forma", "Esta es una denominacio");

        ArticuloManufacturado articuloManufacturado2 = new ArticuloManufacturado("Esto es otro articulo manufacturado", 40, "Se hace de esta otra forma", "Esta es una denominacio");
        ArticuloManufacturado articuloManufacturado3 = new ArticuloManufacturado("Otro art manufacturado", 20, "Se prepara", "Tiene una denominacion");

        articuloManufacturado1.addDetalle(articuloManufacturadoDetalle1);
        articuloManufacturado1.addImagen(imagen1);
        articuloManufacturado1.setUnidadMedida(unidadMedida);


        articuloManufacturado2.addDetalle(articuloManufacturadoDetalle2);
        articuloManufacturado2.addImagen(imagen2);
        articuloManufacturado2.setUnidadMedida(unidadMedida);

        // Categorias

        Categoria categoria1= new Categoria("Galletas");
        Categoria subCategoria1= new Categoria("galletas Dulces");
        categoria1.agregarSubcategoria(subCategoria1);
        categoria1.agregarArticulo(articuloManufacturado1);
        categoria1.agregarArticulo(articuloManufacturado2);

        Categoria categoria2= new Categoria("Congelados");
        Categoria subCategoria2= new Categoria("Facturas");
        categoria2.agregarSubcategoria(subCategoria2);
        categoria2.agregarArticulo(articuloManufacturado1);
        categoria2.agregarArticulo(articuloManufacturado2);

        subCategoria2.agregarArticulo(articuloManufacturado3);

        //Promociones

        Promocion promocion1 = new Promocion("Promo otoño", LocalDate.now(), LocalDate.now(), LocalTime.now(), LocalTime.now(), 5.50, 1.2, TipoPromocion.PROMOCION1);
        promocion1.addImagenes(imagen1);
        promocion1.addArticulos(articuloManufacturado1);

        Promocion promocion2 = new Promocion("Promo cena", LocalDate.now(), LocalDate.now(), LocalTime.now(), LocalTime.now(), 51.50, 2.2, TipoPromocion.HAPPYHOUR);
        promocion2.addImagenes(imagen2);
        promocion2.addArticulos(articuloManufacturado2);


        // Sucursales

        Sucursal sucursal1= new Sucursal("Casa Matriz", LocalTime.now(), LocalTime.now().plus(Duration.ofHours(8)));
        sucursal1.setDomicilio(d1);
        sucursal1.addCategoria(categoria1);

        sucursal1.addPromocion(promocion1);
        sucursal1.addPromocion(promocion2);

        Sucursal sucursal2 = new Sucursal("Sucursal 2", LocalTime.now(), LocalTime.now().plus(Duration.ofHours(8)));
        sucursal2.setDomicilio(d2);
        sucursal2.addCategoria(categoria2);
        sucursal2.addPromocion(promocion1);
        sucursal2.addPromocion(promocion2);


        //Empresa

        Empresa empresa = new Empresa("Superempresa","Los Facultamigos S.A.", 2035620636);
        empresa.addSucursal(sucursal1);
        empresa.addSucursal(sucursal2);

        //Facturas
        Factura factura1 = new Factura(LocalDate.now(), 80, "akeu", "parqrqasd","pasdadad", FormaPago.MERCADOPAGO,5.0);
        Factura factura2 = new Factura(LocalDate.now(), 90, "acadc", "587ad", "poadhaduah", FormaPago.EFECTIVO, 905.5);


        // Pedidos

        Pedido pedido1 = new Pedido(LocalTime.now(), 5.0, 9.8,Estado.ENTREGADO,TipoDeEnvio.DELIVERY, FormaPago.MERCADOPAGO,LocalDate.now());
        pedido1.setFactura(factura1);
        pedido1.setDomicilio(domicilio);
        pedido1.setSucursal(sucursal1);
        pedido1.addDetallesPedido(detallePedido1);

        Pedido pedido2 = new Pedido(LocalTime.now(), 7.5, 767.6, Estado.PREPARACION,TipoDeEnvio.TAKEAWAY, FormaPago.EFECTIVO, LocalDate.now());
        pedido2.setFactura(factura2);
        pedido2.setDomicilio(domicilio2);
        pedido2.setSucursal(sucursal2);
        pedido2.addDetallesPedido(detallePedido2);







        //Clientes
        Cliente cliente1 = new Cliente("David","Lopez","2615848235","locolope@gmail.com",LocalDate.now(), imagen, usuario1);
        cliente1.addDomicilios(domicilio);
        cliente1.setImagen(imagen1);
        cliente1.setUsuario(usuario1);
        cliente1.addPedidos(pedido1);
        cliente1.addPedidos(pedido2);



        Cliente cliente2 = new Cliente("Fomas","Terro","2613748194","fomi_del_campo@gmail.com",LocalDate.now(), imagen, usuario2);
        cliente2.addDomicilios(domicilio2);
        cliente2.setImagen(imagen2);
        cliente2.setUsuario(usuario2);
        cliente2.addPedidos(pedido1);
        cliente2.addPedidos(pedido2);


        System.out.println(empresa.toString());



    }
}