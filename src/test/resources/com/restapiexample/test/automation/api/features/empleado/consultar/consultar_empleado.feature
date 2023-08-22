# El "#languaje" No es un comentario representa el tipo de lenguaje utilizado en la estructura de Gherkin
#language: es

# @Todos            # Etiqueta para todos los escenarios
# @{Funcionalidad}  # Palabra clave representativa de la funcionalidad

@Todos
@Empleado
@ConsultarEmpleado
Característica: Consultar empleado
  Yo como un cliente del sistema de gestion de empleados
  Necesito solicitar la informacion de un empleado
  Para su identificacion y uso dentro de las operaciones de negocio

  # @HP            # Tipo de prueba [Happy Path | Altern Path]
  # @Regresion     # Aplica para regresion
  # @Smoke         # Aplica para prueba de humo
  # @C######       # ID CP en la herramienta de gestion de pruebas (TestRail / XRay ...)
  # @Actual        # Escenario que se esta automatizando/trabajando actualmente


  @HP
  @CP-007 # Consultar empleado, exitosamente
  Escenario: Solicitar la informacion de un empleado, correctamente
      # R/ ¿Donde se encuentra el actor? --> ubicación / contexto
      # R/ ¿Que acabó de realizar el actor? --> previamente, en tiempo pasado
    Dado que "el cliente" se encuentra ante el sistema de gestion de empleados
      # R/ ¿Que esta haciendo el actor? --> en tiempo presente, comportamiento sujeto de prueba
    Cuando solicita la consulta de un empleado, correctamente
      | id_empleado_consulta |
      | 1                    |
      # R/ ¿Que se espera? --> en tiempo futuro, validación / verificación
      # R/ ¿Cual es la consecuencia de sus actos? --> en tiempo futuro, lo que sucederá
    Entonces deberia recibirse la respuesta adecuada a la solicitud
      | codigo_respuesta | estado_respuesta | mensaje_respuesta       |
      | 200              | success          | Record has been fetched |
