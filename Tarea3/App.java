package uam.prog3.tarea03;

public class App {
    public static void aplicarDescuento(double subtotal) {
        subtotal = subtotal * 0.9;
    }

    public static void agregarCortesia(Pedido pedido) {
        pedido.agregar(new Bebida("Agua", 500, false));
    }

    public static void main(String[] args) {
        ItemMenu casado = new Plato("Casado", 3500, true);
        ItemMenu cafe = new Bebida("Café", 1200, false);
        ItemMenu fresco = new Bebida("Fresco de mora", 1500, true);

        System.out.println("=== Menú ===");
        ItemMenu[] menu = {casado, cafe, fresco};
        for (ItemMenu item : menu) {
            System.out.println(item.describir());
        }

        Pedido pedido = new Pedido();
        pedido.agregar(casado);
        pedido.agregar(cafe, 2);
        pedido.agregar(fresco);
        pedido.agregar(cafe, 0);

        double subtotalOriginal = pedido.calcularSubtotal();
        System.out.println("Subtotal: " + subtotalOriginal);

        System.out.println("=== Pagos ===");
        MetodoPago[] pagos = {new Efectivo(), new Tarjeta()};
        for (MetodoPago metodo : pagos) {
            pedido.cobrar(metodo);
        }

        System.out.println("=== Parámetros ===");
        aplicarDescuento(subtotalOriginal);
        System.out.println("Subtotal tras aplicarDescuento: " + subtotalOriginal);

        agregarCortesia(pedido);
        System.out.println("Subtotal tras agregarCortesia: " + pedido.calcularSubtotal());

        pedido.getItems().clear();
        System.out.println("Subtotal tras getItems().clear(): " + pedido.calcularSubtotal());

        // System.out.println(casado.precioBase); // no compila: precioBase es protected y no pertenece directamente a App, o no se accede mediante herencia en este contexto.
        // pedido.items.clear(); // no compila: el atributo items en Pedido es private.
    }
}
