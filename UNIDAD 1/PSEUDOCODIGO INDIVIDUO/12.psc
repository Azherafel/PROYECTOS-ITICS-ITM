Algoritmo EDAD_PARA_TRAMITAR_INE
	Definir a Como real
	Definir b Como real
	a=0; b=18;
	Escribir "Vamos a ver si puedes sacar tu INE"
	Escribir "Dime tu edad"
	Leer a
	si a >= b Entonces
		Escribir "Ya puedes tramitar tu INE"
	SiNo
		si a < b Entonces
			Escribir "Lo siento, aún no puedes tramitar tu INE"
		FinSi
	FinSi
FinAlgoritmo
