# Contexto
La idea es desarrollar una **aplicación de navegación GPS** para automóviles. La app tiene que ser flexible para distintos tipos de usuarios y situaciones, por ejemplo, algunos quieren llegar rápido a su destino (ruta más rápida),  y otros prefieren viajar por rutas con paisajes.
Además, los usuarios pueden recibir notificaciones de distintas formas: voz, vibración o visual, según el contexto.

# Ventajas 
-Se pueden agregar **nuevas estrategias** de ruta o de notificación **sin modificar la lógica principal del GPS**. Por ejemplo, se podría agregar una ruta que priorice estaciones de carga de combustible.

-Cada **comportamiento está encapsulado en su propia clase**, en lugar de usar muchos condicionales, esto hace que el código de la app sea mucho más limpio, fácil de mantener y flexible.

-El usuario **puede cambiar la estrategia dinámicamente** (por ejemplo, cambiar de ruta con paisajes a una ruta más rápida si surge un imprevisto).
