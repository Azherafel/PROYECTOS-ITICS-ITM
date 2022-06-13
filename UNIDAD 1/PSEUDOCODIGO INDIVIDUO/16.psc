Algoritmo Números_primos
	Definir X, NUM, CONTADOR Como Entero
	Para NUM = 1 Hasta 20 Hacer
		X=1
		CONTADOR=0
		Mientras X <= NUM Hacer
			SI NUM MOD X == 0 Entonces
				CONTADOR = CONTADOR +1
			FinSi
			X=X+1
		FinMientras
		Si CONTADOR == 2 Entonces
			Escribir "El numero ", NUM, " es primo";
		FinSi
	FinPara
FinAlgoritmo
