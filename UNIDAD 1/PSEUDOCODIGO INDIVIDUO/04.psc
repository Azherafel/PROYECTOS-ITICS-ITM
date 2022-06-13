Algoritmo CONVERTIR_CENTIGRADOS_A_FAHRENHEIT
	Constante1 = 32
	Constante2 = 1.8
	Opcion =0
	Escribir "Elige el calculo que deseas hacer:"
	Escribir "1 - Centigrados a Fahrenheit"
	Escribir "2 - Fahrenheit a Centigrados"
	Leer Opcion ;
	Si Opcion  == 1 Entonces
		Escribir  "Teclea el valor en grados centigrados"
		Leer Centigrados;
		Fahrenheit = (Constante2 * Centigrados) + Constante1
		Escribir "El resultado es:" Fahrenheit
	sino
		Escribir  "Teclea el valor en grados Fahrenheit"
		Leer  Fahrenheit
		Centigrados = (Fahrenheit - Constante1) / Constante;
		Escribir  "El resultado es:" Centigrados
		
	FinSi
	
FinAlgoritmo
