# Ejercicio de Gestión de Contactos - YKS

Este ejercicio consiste en implementar un sistema de gestión de contactos utilizando `ArrayList` en Java. Los usuarios podrán realizar operaciones básicas como añadir, buscar, editar y eliminar contactos.

## Requisitos

1. Crear una clase `Contacto` que tenga los siguientes atributos:

   - `nombre` (String)
   - `telefono` (String)
   - `email` (String)

2. Crear una clase `GestorContactos` que utilice un `ArrayList<Contacto>` para almacenar los contactos. Esta clase debe permitir realizar las siguientes operaciones:

   - **Añadir un nuevo contacto**: Ingresar los detalles del contacto (nombre, teléfono, email).
   - **Buscar un contacto**: Buscar un contacto por nombre. Si se encuentra, mostrar la información de contacto.
   - **Editar un contacto**: Editar el teléfono y el email de un contacto existente.
   - **Eliminar un contacto**: Eliminar un contacto de la lista.
   - **Mostrar todos los contactos**: Mostrar todos los contactos almacenados en el sistema.

3. Implementar un menú que permita al usuario seleccionar las operaciones anteriores.
