Algoritmo Leer_3_numeros_enteros_e_imprimir_en_pantalla_cual_es_el_mayor_de_los_3
	Definir a, b, c, d Como Real;
	a=0; b=0; c=0; d=0;
	Escribir "Vamos a sumar 3 numeros"
	Escribir "Dame el primer numero"
	Leer  a
	Escribir "Dame el segundo numero"
	Leer b
	Escribir  "Dame el tercer numero"
	Leer c
	Si a > b Entonces
		Escribir  "a es mayor";
	SiNo
		si b > c Entonces
			Escribir "b es mayor";
		SiNo
			Escribir  "c es mayor";
		FinSi
	FinSi
FinAlgoritmo
