# Actividad en clase - La Calculadora vCientifica

## Caso: Simulación Calculadora

---

* Objetivo: Se le pide desarrollar un programa en LDP Java que permita simular una calculadora. La idea es experimentar con tipos de datos, validación de entradas, gestión de errores y versionado del código con GitHub.

La calculadora debe permitir:

1- calcular las 4 operaciones aritméticas básicas entre 2 números, el mayor de 2 números,  menor de 2 números, potencia de un número elevado a un segundo número y calcular un cierto porcentaje de un numero.

2- calcular las soluciones x1 y x2 de una ecuación cuadrática de la forma: Ax2 + Bx + C = 0

3- calcular perímetros, áreas y volúmenes según corresponda de las siguientes figuras geométricas: cuadrado, rectángulo, círculo, esfera, cubo y cono

4- calcular la solución (x,y) de un sistema de 2 ecuaciones y 2 incógnitas, de la forma:

Ax + By = C

Dx + Ey = F

5- calcular la ecuación de una recta de la forma: Y = mX + b, dados 2 puntos de la recta (x1,y1) (x2,y2)

-------------

A.) Cada alumno elige una opción a realizar y desarrolla su programa en LDP Java, considerando al menos:

- 2 pruebas unitarias por cada método asociado a cálculos de resultados.

Una vez haya probado y validado su solución, suba su proyecto al repositorio de GitHub para tener una 1era versión de su solución.

>> Para la actividad 1 se realizaron al menos dos pruebas unitarias para cada método:
>- `testDividir()`  
>- `testMayorEntreDosNumeros()`  
>- `testMenorEntreDosNumeros()`  
>- `testMultiplicar()`  
>- `testPorcentaje()`  
>- `testPotencia()`  
>- `testRestar()`  
>- `testSumar()`
>
>> En la actividad 2 se realizaron las siguientes pruebas para el método que calcula funciones cuadráticas:
>- `test_aIgualCero()`
>- `testDiscriminanteCero()`
>- `testDiscriminanteNegativo()`
>- `testDiscriminantePositivo()`
>
>> Para la actividad 3 se crearon las siguientes pruebas unitarias
> - d
> - d
> - d
> 
>> Para la actividad 4 se crearon las siguientes pruebas:
> - d
> - d
> - d
> - d
-------------

B) Ahora a partir de lo anterior, considere lo siguiente:

- ¿Qué pasa si se intenta ingresar como divisor un CERO?
 
> Al ingresar un valor de cero, la prueba unitaria no pasa debido al error de no manejar la excepción producida

- ¿Qué pasa si base y exponente de la potencia son CERO?
> La librería utilizada para calcular potencias `Math.pow()` devuelve un 1 cuando lo correcto sería _indetermindado_

- ¿Qué pasa si se intenta ingresar una variable de entrada no numérica?
> Se crea un error de sintaxis debido a como está definido en los argumentos que puede recibir el método (double), solo permite valores numéricos. Esto hace que la prueba no se pueda ejecutar.

OJO! Manejo de excepciones, ver en https://docs.oracle.com/javase/tutorial/essential/exceptions/index.html

Haga uso del manejo de excepciones con Java y el bloque:

try {...}

catch (Exception e) {...}

Suba una nueva versión de su proyecto al repositorio de GitHub para tener una 2da versión de su solución.

-------------

C.) Integrando las soluciones

A partir de todas las soluciones desarrolladas, acceda a los repositorios e intégrelas en un sólo programa que considere un MENÚ que permita acceder a las 6 opciones:

1. Operaciones aritméticas

2. Ecuación cuadrática

3. Figuras geométricas

4. Sistema ecuaciones lineales

5. Ecuación de la recta

6. Salir

Suba una nueva versión de su proyecto al repositorio de GitHub para tener una 3ra versión de su solución, que considera:

- TODOS los métodos de la calculadora vCientifica.

- TODAS las pruebas unitarias respectivas.

![Captura de las pruebas](link)

- gestión de las excepciones identificadas.

![Captura de la gestión de exepciones](link)

- integración de las funcionalidades a través de un menú.

**OBS:**

- considerar TODAS las buenas prácticas para creación y uso de métodos, implementación de pruebas unitarias y gestión de excepciones

![Captura de menú](link)