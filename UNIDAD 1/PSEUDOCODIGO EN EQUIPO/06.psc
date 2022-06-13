Algoritmo QUE_LEA_UNA_CIFRA_DE_4_NUMEROS_Y_LOS_MUESTRE_EN_UNIDADES_DECENAS_CENTENAS_MILLARES
	// Declaramos las siguientes variables de tipo entero.
	Definir N,unidades,decenas,centenas,millares Como Entero;
	// Con la funcion escribir pedimos que se ingrese un numero.
	Escribir 'Ingresa un numero de 4 cifras';
	// Este numero lo ingresamos en la variable N.
	Leer N;
	// Como que se exprese el numero en
	// unidades, decenas, centenas y millares
	// Evaluamos si el numero es mayor a 99 pero menor que 10000
	Si N>99 Y N<10000 Entonces
		// Para calcular las unidades dividimos el numero entre 10 utilizando mod
		// Para obtener el residuo de la division 
		unidades <- N MOD 10;
		// Despues de divide el numero entre 10 pero con la funcion trunc.
		// La funcion "trunc" trunca los numeros hasta el valor entero o decimal anterior
		N <- trunc(N/10);
		// Para calcular las decenas dividimos el numero entre 10 utilizando mod
		// Para obtener el residuo de la division 
		decenas <- N MOD 10;
		// Despues de divide el numero entre 10 pero con la funcion trunc.
		// La funcion "trunc" trunca los numeros hasta el valor entero o decimal anterior
		N <- trunc(N/10);
		// Para calcular las centenas dividimos el numero entre 10 utilizando mod
		// Para obtener el residuo de la division 
		centenas <- N MOD 10;
		// Despues de divide el numero entre 10 pero con la funcion trunc.
		// La funcion "trunc" trunca los numeros hasta el valor entero o decimal anterior
		N <- trunc(N/10);
		// Para calcular los millares dividimos el numero entre 10 utilizando mod
		// Para obtener el residuo de la division 
		millares <- N MOD 10;
		// Despues de divide el numero entre 10 pero con la funcion trunc.
		// La funcion "trunc" trunca los numeros hasta el valor entero o decimal anterior
		N <- trunc(N/10);
		// Mostramos los siguientes mensajes en pantalla
		Escribir 'El numero tiene:';
		// Damos a conocer las unidades
		Escribir unidades,'   Unidades';
		// Damos a conocer las decenas
		Escribir decenas,'   Decenas';
		// Damos a conocer las centenas
		Escribir centenas,'   Centenas';
		// Damos a conocer los millares
		Escribir millares,'   Millares';
	SiNo
		// Cuando se ingrese una cifra que no es de 4 digitos,
		// mostramos el siguiente mensaje
		Escribir 'Ingresa un numero de 4 cifras';
	FinSi
	// Finalmente escribirmos la conformacion de la cifra
	Escribir 'Conformacion:',millares,'000','+',centenas,'00','+',decenas,'0','+',unidades;
FinAlgoritmo
