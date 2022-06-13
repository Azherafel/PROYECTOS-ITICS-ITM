Algoritmo sin_titulo
	// declaracion de variables
	Definir a,b Como Entero
	// asignacion de variables
	a <- 0; b <- 0
	Escribir 'Buscaremos el mayor de 2 numeros'
	// Hacemos la peticion y leemos los numeros
	Escribir 'Dame el primer numero'
	Leer a
	Escribir 'Dame el segundo numero'
	Leer b
	// Vemos si a es mayor que b,si es mayor,entra al ciclo
	Si a>b Entonces
		// aqui imprime el valor de a,ya que a es mayor
		Escribir 'El numero mayor es ',a
		// aqui pasa si a es menor que b
	SiNo
		// si b es mayor que a entra al ciclo
		Si b>a Entonces
			// impresion del valor mayor,aqui el valor mayor es b
			Escribir 'El numero mayor es ',b
			// ya aqui ninguno es mayor o menor, por lo tanto sonn iguales 
		SiNo
			Si a==b Entonces
				// impresion del valor de a y b,aqui son iguales
				Escribir 'Los numeros son iguales y no existe un numero mayor que el otro'
			FinSi
		FinSi
	FinSi
FinAlgoritmo
