Algoritmo sin_titulo
	// declaracion de variables
	Definir n1,n2,c1,c2,acumuladordeimpares,contadorpar Como Entero
	// asignacion de X valor a las variables
	n1 <- 0; n2 <- 0; c1 <- 0; c2 <- 0; acumuladordeimpares <- 0; contadorpar <- 0
	// recoleccion de los datos
	Escribir 'Dame el n1'
	Leer n1
	Escribir 'Dame n2'
	Leer n2
	// tiene que ser enteros positivos
	Si n1>0 Y n2>0 Entonces
		// para el caso que n1 se menorny n2 mayor
		// es como la sucesion normal de 1-10
		Si n1<n2 Entonces
			// para hacer la itineracion de n1 a n2
			Mientras n1<=n2 Hacer
				// para checar si es par
				Si n1 MOD 2==0 Entonces
					// imprimir el numero par
					Escribir 'Este numero es par',n1
					// contar el numero par
					contadorpar <- contadorpar+1
					// este entra si es impar
				SiNo
					// la impresion nos dice que es impar
					// nos indica el numero impar
					Escribir 'Este numero es impar ',n1
					// nos va sumando los numeros impares
					acumuladordeimpares <- acumuladordeimpares+n1
				FinSi
				// para ir recorriendo cada numero
				n1 <- n1+1
			FinMientras
			// este es caso cotrario,n1 es mayor y n2 menor
		SiNo
			// intercambiamos y hacemos que n2 sea nuestro numero inicial
			// checamos para hacer la iteracion desde n2 a n1
			Mientras n2<=n1 Hacer
				// para sacar el numero par
				Si n2 MOD 2==0 Entonces
					// imprimir el numero par
					Escribir 'Este numerp es par ',n2
					// contar el numero par
					contadorpar <- contadorpar+1
					// para los numeros impares
				SiNo
					// la impresion nos dice que es impar
					// nos indica el numero impar
					Escribir 'Este numero es impar ',n2
					// nos va sumando los numeros impares
					acumuladordeimpares <- acumuladordeimpares+n2
				FinSi
				// para ir recorriendo cada numero
				n2 <- n2+1
			FinMientras
		FinSi
		// nos imprime el numero de numeros pares
		Escribir '¿Cuantos numero pares hay? ',contadorpar
		// nos imprime la suma de los impares
		Escribir 'la suma de los impares es',acumuladordeimpares
		// esto ocurre si los numeros son menores o iguales a 0
	SiNo
		// nos avisa que solo numeros positicos
		Escribir 'Escribe numeros positivos '
	FinSi
FinAlgoritmo
