Algoritmo ESCRIBIR_SERIE_ENTRE_DOS_NUMEROS
	Definir NUM1 Como Entero
	Definir NUM2 Como Entero
	Definir Cont Como Entero
	Escribir "Teclea el primer número"
	Leer NUM1
	Escribir "Teclea el segundo, debe ser mayor"
	Leer NUM2
	Cont=NUM1+1
	Mientras Cont <= NUM2-1 Hacer
		Escribir Cont
		Cont = cont + 1
	FinMientras
FinAlgoritmo
