Algoritmo Dibujar_un_cuadrado
	Definir lado Como Entero
	Definir renglon Como Entero
	Definir columna Como Entero
	Definir seguir Como Caracter
	Repetir
		Escribir "Teclea cuanto medira el lado del cuadrado"
		Leer lado
		renglon=1
		columna=1
		Mientras renglon<=lado Hacer
			Mientras columna<=lado Hacer
				si columna == renglon Entonces
					Escribir "0" Sin Saltar
				SiNo
					Escribir "x" Sin Saltar
				FinSi
				columna=columna+1//se cambia de columna
			FinMientras
			si columna>=lado Entonces	//se reinicia la columna
				columna=1				//para cambiar de renglon
				Escribir "	"			//saltarse de renglon
			FinSi
			renglon=renglon+1
		FinMientras
		Escribir "¿Deseas repetir el proceso? S/N"
		Leer seguir
		Limpiar Pantalla
	Hasta Que seguir == "N" 
FinAlgoritmo
