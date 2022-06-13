Algoritmo sin_titulo
	// declaracion de variables
	Definir ganados,perdidos,empatados,puntos,totalpartidos,pxequipo,nequipo Como Entero
	// asignacion de variables
	pxequipo <- 0
	nequipo <- 0
	// lectura de partidos jugados
	Escribir 'Cuantos partidos se jugaron en el torneo?'
	Leer totalpartidos
	// hacer la iteracion y recoger los valores de cada equipo
	Mientras nequipo<18 Hacer
		// declaracion de variable puntos,se puso aqui adentro ya que si esta afuera acumula el valor de todos los equipos
		// el valor acumulable debe ser de cada equipo en cada vuelta
		puntos <- 0
		// pide los datos de nequipo
		Escribir 'Dame los datos del equipo ',nequipo+1
		Escribir ' '
		Escribir 'Ingresa el total de partidos ganados'
		Leer ganados
		Escribir 'Ingresa el total de partidos perdidos'
		Leer perdidos
		Escribir 'Ingresa el total de partidos empatados'
		Leer empatados
		// formula pasa sacar los partidos por equipo
		pxequipo <- (ganados+perdidos+empatados)
		// aqui el total de partidos es mayor que partidos por quipo,entonces entra
		Si totalpartidos>pxequipo Entonces
			// saca los puntos del equipo
			puntos <- (ganados*3)+empatados
			// escribe los resultados de cada equipo
			Escribir 'Equipo ',nequipo+1
			Escribir ' '
			Escribir 'Partidos jugados ',pxequipo
			Escribir ' '
			Escribir 'Partidos ganados ',ganados
			Escribir ' '
			Escribir 'Partidos perdidos ',perdidos
			Escribir ' '
			Escribir 'Partidos empatados ',empatados
			Escribir ' '
			Escribir 'Total de puntos ',puntos
			Escribir ' '
			// ir disminutendo los partidos y que sean parejos,es un contador
			totalpartidos <- totalpartidos-pxequipo
			// para pasar al siguiente equipo
			nequipo <- nequipo+1
			// nos dice cuantos partidos disponibles hay des pues de registrar los partidos de este quipo
			Escribir 'Partidos disponibles ',totalpartidos
			// por si el valor de partidos por quipo es mayor,esto no puede psar,ya que es inexplicable
		SiNo
			Si totalpartidos<pxequipo Entonces
				Escribir 'Por favor vuelva a ingresar bien el numero de partidos ganados,perdidos y empatados'
				Escribir 'Los datos introducidos superan los Partidos del torneo'
			FinSi
		FinSi
	FinMientras
FinAlgoritmo
