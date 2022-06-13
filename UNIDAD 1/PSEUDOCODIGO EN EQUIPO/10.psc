Algoritmo DIBUJANDO_UNA_CRUZ
	// Definimos las siguientes variables como enteros
	Definir ini,lim,x,col,fila Como Entero
	// Definimos sepuede como variable logica
	Definir sepuede Como Logico
	sepuede <- Verdadero
	x <- 0
	ini <- 0
	// Ingresamos un numero para que se puedar formar la cruz de @
	Escribir 'Teclea un numero para formar un tache, el numero debe ser mayor a3'
	Leer lim
	ini <- lim
	Si lim<3 Entonces
		sepuede <- Falso
	FinSi
	Si sepuede Entonces
		Mientras x<=lim Hacer
			x <- x+1
			ini <- ini-1
			Para col<-1 Hasta lim Hacer
				Si x==col O col=ini+1 Entonces
					Escribir '@' Sin Saltar
				FinSi
				Escribir ' ' Sin Saltar
			FinPara
			Escribir ''
		FinMientras
	SiNo
		// Especificamos que no se puede formar una equis con un valor inferior a 3
		Escribir 'no se pude formar una equis con menos de 3'
	FinSi
FinAlgoritmo
