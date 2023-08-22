# El "#languaje" No es un comentario representa el tipo de lenguaje utilizado en la estructura de Gherkin
#language: es

# @Todos            # Etiqueta para todos los escenarios
# @{Funcionalidad}  # Palabra clave representativa de la funcionalidad

@Todos
@Empleado
@EditarEmpleado
Característica: Editar empleado
  Yo como un cliente del sistema de gestion de empleados
  Necesito solicitar la edicion de un empleado
  Para actualizar su informacion en el sistema

  # @HP            # Tipo de prueba [Happy Path | Altern Path]
  # @Regresion     # Aplica para regresion
  # @Smoke         # Aplica para prueba de humo
  # @C######       # ID CP en la herramienta de gestion de pruebas (TestRail / XRay ...)
  # @Actual        # Escenario que se esta automatizando/trabajando actualmente


  @HP
  @Regresion
  @CP-003 # Editar y consultar empleado
  Escenario: Consultar empleado recien editado
      # R/ ¿Donde se encuentra el actor? --> ubicación / contexto
      # R/ ¿Que acabó de realizar el actor? --> previamente, en tiempo pasado
    Dado que "el cliente" ha solicitado editar la informacion de un empleado, ante el sistema de gestion de empleados
      | id_empleado_edita | nombre_empleado_edita                 | salario_empleado_edita | edad_empleado_edita |
      | 1                 | Tiger Nixon {ddMMyyyy}_{HHmmss}_{###} | {####}                 | {##}                |
      # R/ ¿Que esta haciendo el actor? --> en tiempo presente, comportamiento sujeto de prueba
    Cuando solicita la consulta del empleado, recien editado
      # R/ ¿Que se espera? --> en tiempo futuro, validación / verificación
      # R/ ¿Cual es la consecuencia de sus actos? --> en tiempo futuro, lo que sucederá
    Entonces deberia observarse la informacion recientemente actualizada

  @HP
  @CP-004 # Editar empleado, exitosamente
  Escenario: Solicitar edicion de un empleado, correctamente
      # R/ ¿Donde se encuentra el actor? --> ubicación / contexto
      # R/ ¿Que acabó de realizar el actor? --> previamente, en tiempo pasado
    Dado que "el cliente" se encuentra ante el sistema de gestion de empleados
      # R/ ¿Que esta haciendo el actor? --> en tiempo presente, comportamiento sujeto de prueba
    Cuando solicita editar la informacion de un empleado, correctamente
      | id_empleado_edita | nombre_empleado_edita                 | salario_empleado_edita | edad_empleado_edita |
      | 1                 | Tiger Nixon {ddMMyyyy}_{HHmmss}_{###} | {####}                 | {##}                |
      # R/ ¿Que se espera? --> en tiempo futuro, validación / verificación
      # R/ ¿Cual es la consecuencia de sus actos? --> en tiempo futuro, lo que sucederá
    Entonces deberia recibirse la respuesta adecuada a la solicitud
      | codigo_respuesta | estado_respuesta | mensaje_respuesta       |
      | 200              | success          | Record has been updated |
