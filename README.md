# PSP-Tema-1
## Lanzador
Este ejemplo muestra el uso de ``Runtime.getRuntime().exec()`` y * con *Swing*. Están las siguientes variaciones:

 - **Cronometro.** Este ejemplo muestra el uso de un *Thread* en el *dispatcher* del evento del botón. Todo funciona bien si no pulsamos el botón *Start* mientras se está ejecutando,  se instanciará un nuevo objeto `Thread t` cada vez que pulsemos el botón *Start*. Una solución rápida es deshabilitar el botón *Start*, tan sólo tenemos que descomentar las líneas que tienen las instrucciones`btnReset.setEnabled()`. También podíamos haber puesto una comprobación del tipo `if (t==null)` antes de instanciar la variable.
 - **Cronometro2.** Una 
<!--stackedit_data:
eyJoaXN0b3J5IjpbLTQ3MzYxMzgwMl19
-->