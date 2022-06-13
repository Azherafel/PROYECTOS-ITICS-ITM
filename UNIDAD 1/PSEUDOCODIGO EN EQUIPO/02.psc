Algoritmo sin_titulo
	// Declararacion de variables
	Definir num,contador,i,limite,contp Como Entero
	// asignacion de x valor a las variables
	contador <- 1
	contp <- 0
	limite <- 1000
	num <- 1
	i <- 1
	// para manejar el rango de numeros que vamos a querer imprimir
	Mientras num<=limite Hacer
		// para ver si es par o impar
		Mientras i<=num Hacer
			Si num MOD i==0 Entonces
				// nos incrementa el contador en 1 cuando el num es divisible entre el mismo,si no da 0,no incrementa al contador
				contador <- contador+1
			FinSi
			// nos incrementa la i en 1
			i <- i+1
		FinMientras
		Si contador<=2 Entonces
			Escribir num,'es primo'
			contp <- contp+1
			// nos imprime en que numero primo vamos,se hizo aqui para asegurarnos que funcionara
			Escribir 'Vamos en el primo N. ',contp
			// les da un espacio para que no se vea amontonado
			Escribir '     '
		FinSi
		// para avanzar al siguiente numero
		num <- num+1
		// reicia el contador,por eso lo manda a 0
		contador <- 0
		i <- 1
	FinMientras
	// son imprime el total de numeros primos
	Escribir 'Son ',contp,' numeros primos'
FinAlgoritmo
