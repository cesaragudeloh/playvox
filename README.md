# API & Web Automation Test

Se realiza la automatización de la API-Rest https://docs.thecatapi.com y del sitio web http://demo.testim.io/ 

# Escenarios automatizados:

### API Rest

Obtener la información de los votos (Get the Votes Information)

### Estrategia de automatización

Se propone la automatización del camino exitoso el servicio  **v1/votes** el cual se consume por medio de un método GET. Para hacer dicho consumo, se requiere una api-key, la cual se espefica antes de hacer la petición

Finalmente, se verifican algunos elementos del response, los cuales en la práctica deberían estar especificados en los criterios de aceptación de la HU.


### Web Site

Comprar un boleto para un viaje soñado al espacio

### Estrategia de automatización

Se propone la automatización del camino exitoso del escenario para tratar de adquirir un boleto para un viaje al espacio. Se selecciona este escenario ya que la página de prueba no hace nada al finalizar el proceso.

## Herramientas utilizadas

    Serenity 3.0.5
    Screenplay 3.0.5
    Screenplay Web Driver 3.0.5
    Cucumber 6
    Junit 5.8.2 (jupiter api & engine)
    Hamcrest 1.3
    Slf4j 1.7.36
    Postman 9.16.0
    Intellij IDEA 2022.1

## Requerimientos
Para ejecutar el proyecto de automatización se requiere:

 	Java JDK 11
 	Gradle versión 7.1.1 o superior

## Ejecución del proyecto

Normalmente el proyecto se puede ejecutar desde cualquier IDE que soporte JAVA (Intellij IDEA, Eclipse, Netbeans, etc), desde las opciones de ejecución que éste posea. Sin embargo, si se desea ejecutar
desde un pipeline o desde una línea de comandos, podemos usar las siguientes instrucciones:

	gradlew clean test aggregate --info


Al ejecutar los tests, las evidencias de la ejecución de las pruebas quedarán en el directorio:

    $(Repository.Name)/target/site/serenity

[Consultar evidencia Web](https://cesaragudeloh.com/evidencias/Serenity-Report-Web/)

[Consultar evidencia API Rest](https://cesaragudeloh.com/evidencias/Serenity-Report-API/)

## Driver

Las pruebas se configuraron para ser ejecutadas en el navegador google chrome, por lo que se debe descargar el chromedriver y ajustar la ruta en la propiedad webdriver.chrome.driver, en el archivo serenity.properties, por ejemplo:

    webdriver.chrome.driver=D://chromedriver.exe
