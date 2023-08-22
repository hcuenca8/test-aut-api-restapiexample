# El "#languaje" No es un comentario representa el tipo de lenguaje utilizado en la estructura de Gherkin
#language: es

# @Todos            # Etiqueta para todos los escenarios
# @{Funcionalidad}  # Palabra clave representativa de la funcionalidad

@Todos
@Empleado
@RetirarEmpleado
Característica: Retirar empleado
  Yo como un cliente del sistema de gestion de empleados
  Necesito solicitar el retiro de un empleado
  Para dar cierre a su expediente en el sistema

  # @HP            # Tipo de prueba [Happy Path | Altern Path]
  # @Regresion     # Aplica para regresion
  # @Smoke         # Aplica para prueba de humo
  # @C######       # ID CP en la herramienta de gestion de pruebas (TestRail / XRay ...)
  # @Actual        # Escenario que se esta automatizando/trabajando actualmente


  @HP
  @Regresion
  @CP-005 # Retirar y consultar empleado
  Escenario: Consultar empleado retirado
      # R/ ¿Donde se encuentra el actor? --> ubicación / contexto
      # R/ ¿Que acabó de realizar el actor? --> previamente, en tiempo pasado
    Dado que "el cliente" ha solicitado el retiro de un empleado, ante el sistema de gestion de empleados
      | id_empleado_retiro |
      | 1                  |
      # R/ ¿Que esta haciendo el actor? --> en tiempo presente, comportamiento sujeto de prueba
    Cuando solicita la consulta del empleado, retirado
      # R/ ¿Que se espera? --> en tiempo futuro, validación / verificación
      # R/ ¿Cual es la consecuencia de sus actos? --> en tiempo futuro, lo que sucederá
    Entonces no deberia obtenerse informacion al respecto


  @HP
  @CP-006 # Retirar empleado, exitosamente
  Escenario: Solicitar retiro de un empleado, correctamente
      # R/ ¿Donde se encuentra el actor? --> ubicación / contexto
      # R/ ¿Que acabó de realizar el actor? --> previamente, en tiempo pasado
    Dado que "el cliente" se encuentra ante el sistema de gestion de empleados
      # R/ ¿Que esta haciendo el actor? --> en tiempo presente, comportamiento sujeto de prueba
    Cuando solicita el retiro del empleado, correctamente
      | id_empleado_retiro |
      | 1                  |
      # R/ ¿Que se espera? --> en tiempo futuro, validación / verificación
      # R/ ¿Cual es la consecuencia de sus actos? --> en tiempo futuro, lo que sucederá
    Entonces deberia recibirse la respuesta adecuada a la solicitud
      | codigo_respuesta | estado_respuesta | mensaje_respuesta       |
      | 200              | success          | Record has been deleted |
