# Ejercicio: Sistema de Reservas de Hotel

## Objetivo

Desarrollar un sistema para gestionar las reservas de habitaciones en un hotel utilizando los principios de la Programación Orientada a Objetos (POO).

## Descripción

Un hotel desea gestionar sus reservas de habitaciones. El sistema debe permitir realizar, modificar y cancelar reservas de habitaciones, además de calcular el costo total de la estancia.

## Requerimientos

### 1. Clases y Atributos

#### Habitacion

- Atributos:
  - `numero`: número de habitación.
  - `tipo`: tipo de habitación (individual, doble, suite).
  - `precioPorNoche`: precio por noche de la habitación.
  * Resaltar que tanto tipo como precioPorNoche son atributos que heredan su valor de sus enums correspondientes
- Métodos:
  - `obtenerPrecioPorNoche()`: obtiene el precio por noche de la habitación.
  - `mostrarDetalles()`: muestra los detalles de la habitación (número, tipo, precio por noche).

#### Enums

- `TipoHabitacion`: enum que define los tipos de habitación (individual, doble, suite).
- `FormaDePago`: enum que define las formas de pago (tarjeta, efectivo, transferencia).
- `precioPorNoche`: enum que define los precios por noche de las habitaciones.

#### Reserva

- Atributos:
  - `numeroReserva`: número de reserva único.
  - `fechaLlegada`: fecha de llegada del cliente.
  - `fechaSalida`: fecha de salida del cliente.
  - `habitacion`: habitación reservada.
  - `cliente`: cliente que realiza la reserva.
- Métodos:
  - `calcularCostoTotal()`: calcula el costo total de la estancia (precio por noche \* número de noches).
  - `mostrarDetalles()`: muestra los detalles de la reserva (número de reserva, fechas, habitación, cliente).

#### Cliente

- Atributos:
  - `nombre`: nombre del cliente.
  - `documentoIdentidad`: documento de identidad del cliente.
  - `telefono`: número de teléfono del cliente.
  - `correoElectronico`: correo electrónico del cliente.
- Métodos:
  - `obtenerDatos()`: obtiene los datos del cliente.

#### Pago

- Atributos:
  - `montoTotal`: monto total a pagar por la reserva.
  - `formaDePago`: forma de pago (tarjeta, efectivo, etc.).
  - `estado`: estado del pago (pendiente, pagado).
- Métodos:
  - `procesarPago()`: procesa el pago y cambia el estado del pago.
  - `mostrarEstadoPago()`: muestra el estado del pago (pendiente, pagado).

### 2. Funcionalidades

- El sistema debe permitir realizar una **reserva** de habitación para un cliente, especificando las fechas de llegada y salida.
- El sistema debe permitir **modificar** una reserva, cambiando las fechas de estancia o la habitación asignada.
- El sistema debe permitir **cancelar** una reserva.
- Al realizar una reserva, el sistema debe calcular el **costo total** de la estancia en función de las fechas seleccionadas y el tipo de habitación.
- El sistema debe registrar y **procesar pagos** relacionados con las reservas, mostrando el estado del pago (pendiente o pagado).

### 3. Escenarios a Implementar

1. Crear una nueva reserva con una habitación disponible.
2. Modificar una reserva para cambiar las fechas de estancia.
3. Cancelar una reserva.
4. Realizar el pago de una reserva y mostrar el estado del pago.

### 4. Consideraciones adicionales

- Implementar control de disponibilidad de habitaciones (no se debe permitir reservar una habitación si ya está ocupada).
- Utilizar la herencia o interfaces si es necesario para representar diferentes tipos de habitaciones.

## Instrucciones

1. Crea las clases mencionadas con sus atributos y métodos.
2. Asegúrate de que el sistema funcione correctamente al realizar reservas, modificar reservas y procesar pagos.
3. Escribe un programa principal para simular una serie de operaciones con el sistema de reservas (por ejemplo, crear reservas, modificar, cancelar, y realizar pagos).
4. Entrega el código junto con una breve explicación sobre cómo utilizar el sistema de reservas.
