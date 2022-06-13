Algoritmo  VARIABLE_CONSTANTE_CONTADOR_ACUMULADOR
	Definir variable, constante, contador, acumulador Como Entero
	Constante = 12345;
	contador = 1;
	acumulador = 0;
	Escribir "Teclea un numero";
	Leer variable ;
	Escribir "Tecleaste " variable;
	Escribir "La constante definida es igual a ", Constante;
	Escribir "Vamos a sumar los pares que hay entre 1 y 10";
	Mientras  contador <= 10 Hacer
		si contador MOD 2 == 0 Entonces
			acumulador = acumulador + contador;
		FinSi
		contador = contador +1 
		
	FinMientras
	Escribir "Entre 1 y 10 la suma de los pares es igual a " , acumulador;
	
	
FinAlgoritmo
