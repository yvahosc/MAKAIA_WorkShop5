# MAKAIA - WorkShop - Estructuras de datos

## Desarrollo WorkShop 5 dentro del desarrollo del BootCamp de desarrollo web BackEnd de MAKAIA.

### Equipo de trabajo:
  * Daniel Espinosa
  * Daniel Marquez
  * Yeisson Vahos

### Repositorio respuesta al taller planteado, en él se evalúa si un archivo .html (al cual se accede por medio de la ruta de su ubicación) cuenta con sus etiquetas formateadas de manera correcta o no.

### En el proyecto se cuenta con dos paquetes:
* Main: en el que se encuentras las clases suministradas para el desarrollo del ejercicio, la clase HtmlValidator donde se encuentra el método que evalúa si las etiquetas del archivo .html se encuentran bien formateadas y la clase Main en la cual se realizan algunas pruebas para validar el funcionamiento del mencionado.
* testFiles: en el que se encuentran varios archivos .html con los cuales se realizaron validaciones al funcionamiento del método anteriormente mencionado.

## Observación
- Para validar si alguno de los archivos .html que se encuentran en el paquete testFiles cuenta con sus etiquetas formateadas de manera correcta o no, es necesario descomentar la correspondiente línea de código en el método main ubicado en la clase Main.java del proyecto en la que se asigne a la variable file el nombre de dicho archiovo .html, teniendo cuidado de comentar las demás líneas que hagan referencia a dicha variable referenciando el nombre de otro archivo .html.
- Para validar si un archivo .html cuenta con sus etiquetas formateadas de manera correcta o no el programa muestra un mensaje con esta información junto con información sobre las etiquetas del archivo .html que no se lograron cerrar correctamente si las hubiese.
- Si al ejecutar el programa se recibe una ubicación o nombre de un archivo .html que no se logra encontrar, el programa muestra un mensaje informando del error y finaliza su ejecución.
