# El "#languaje" No es un comentario representa el tipo de lenguaje utilizado en la estructura de Gherkin
#language: es

# @Todos            # Etiqueta para todos los escenarios
# @{Funcionalidad}  # Palabra clave representativa de la funcionalidad

@Todos
@Empleado
@CrearEmpleado
Característica: Crear empleado
  Yo como un cliente del sistema de gestion de empleados
  Necesito solicitar la creacion de un empleado
  Para integrarlo al sistema y gestionar toda su informacion

  # @HP            # Tipo de prueba [Happy Path | Altern Path]
  # @Regresion     # Aplica para regresion
  # @Smoke         # Aplica para prueba de humo
  # @C######       # ID CP en la herramienta de gestion de pruebas (TestRail / XRay ...)
  # @Actual        # Escenario que se esta automatizando/trabajando actualmente


  @HP
  @CP-001 # Crear y consultar el nuevo empleado
  Escenario: Consultar empleado recien creado
      # R/ ¿Donde se encuentra el actor? --> ubicación / contexto
      # R/ ¿Que acabó de realizar el actor? --> previamente, en tiempo pasado
    Dado que "el cliente" ha solicitado crear un empleado, ante el sistema de gestion de empleados
      | nombre_empleado_nuevo            | salario_empleado_nuevo | edad_empleado_nuevo |
      | Hector {ddMMyyyy}_{HHmmss}_{###} | {####}                 | {##}                |
      # R/ ¿Que esta haciendo el actor? --> en tiempo presente, comportamiento sujeto de prueba
    Cuando solicita la consulta del nuevo empleado, recien creado
      # R/ ¿Que se espera? --> en tiempo futuro, validación / verificación
      # R/ ¿Cual es la consecuencia de sus actos? --> en tiempo futuro, lo que sucederá
    Entonces deberia observarse la informacion con la que fue creado


  @HP
  @Regresion
  @CP-002 # Crear empleado, exitosamente
  Escenario: Solicitar la creacion de empleado, correctamente
      # R/ ¿Donde se encuentra el actor? --> ubicación / contexto
      # R/ ¿Que acabó de realizar el actor? --> previamente, en tiempo pasado
    Dado que "el cliente" se encuentra ante el sistema de gestion de empleados
      # R/ ¿Que esta haciendo el actor? --> en tiempo presente, comportamiento sujeto de prueba
    Cuando solicita crear un empleado, correctamente
      | nombre_empleado_nuevo            | salario_empleado_nuevo | edad_empleado_nuevo |
      | Hector {ddMMyyyy}_{HHmmss}_{###} | {####}                 | {##}                |
      # R/ ¿Que se espera? --> en tiempo futuro, validación / verificación
      # R/ ¿Cual es la consecuencia de sus actos? --> en tiempo futuro, lo que sucederá
    Entonces deberia recibirse la respuesta adecuada a la solicitud
      | codigo_respuesta | estado_respuesta | mensaje_respuesta     |
      | 200              | success          | Record has been added |
