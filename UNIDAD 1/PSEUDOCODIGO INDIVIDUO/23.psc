	Algoritmo  Men�
		Repetir
			Limpiar Pantalla
			Escribir "Men� de recomendaciones"
			Escribir "   1. Literatura"
			Escribir "   2. Cine"
			Escribir "   3. M�sica"
			Escribir "   4. Salir"
			Escribir "Elija una opci�n (1-4): "
			Leer OP
			Segun OP Hacer
				1:
					Escribir "Lecturas recomendables:"
					Escribir " + El principito (Antonie de Saint Exupery)"
					Escribir " + El Budadarma (Kalama Sadak)"
					Escribir " + Las Mil y una Noche (An�nimo)"
				2:
					Escribir "Pel�culas recomendables:"
					Escribir " + El c�digo enigma (2014)"
					Escribir " + Rush: Pasi�n y gloria (2013)"
					Escribir " + Jobs (2013)"
				3:
					Escribir "Discos recomendables:"
					Escribir " + As� en el cielo como en la selva (La Ra�z, 2013)"
					Escribir " + D�nde jugar�n las ni�as (Molotov, 1997)"
					Escribir " + V.E.H.N Viaje �pico hacia la nada (Love of Lesbian, 2021)"
				4:
					Escribir "Gracias, vuelva pronto"
				De otro modo:
					Escribir "Opci�n no v�lida"
			FinSegun
			Escribir "Presione enter para continuar"
			Esperar Tecla
		Hasta Que OP=4
FinAlgoritmo
