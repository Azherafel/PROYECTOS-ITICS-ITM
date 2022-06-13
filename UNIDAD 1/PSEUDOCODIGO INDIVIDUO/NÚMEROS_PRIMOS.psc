Algoritmo NÚMEROS_PRIMOS
	Definir num Como Entero
	Definir contador Como Entero
	Definir i Como Entero
	Definir limite Como Entero
	contador = 0
	limite = 30
	num = 1
	i = 1
	Mientras num <= limite
		Mientras i <= num Hacer
			si num mod i ==0 Entonces
				contador =contador + 1
			FinSi
			i=i+1
		FinMientras
		si contador <= 2 Entonces
			Escribir num, "	Es primo"
		SiNo
			Escribir num, "	No es primo"
		FinSi
		num=num+1
		contador=0
		i=1
	FinMientras
FinAlgoritmo
