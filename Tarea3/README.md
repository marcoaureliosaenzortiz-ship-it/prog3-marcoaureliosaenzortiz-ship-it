# Entrega de la Tarea 3 - Estructura de la Soda

### Respuestas de Reflexión Teórica (Punto 5.2):
1. **¿Compilarían dentro de Pedido o ItemMenu?**: Sí. La línea `pedido.items.clear()` compilaría dentro de la clase `Pedido` porque su atributo `items` está definido como `private`. Por su parte, la línea `casado.precioBase` compilaría dentro de `ItemMenu` porque allí es donde está declarado originalmente el atributo.
2. **¿Compilaría casado.getPrecioBase() en App?**: Sí compila. Debido a que el método tiene el modificador de visibilidad `protected` y la clase `App` se encuentra ubicada exactamente dentro del mismo paquete, Java otorga el acceso sin restricciones.
