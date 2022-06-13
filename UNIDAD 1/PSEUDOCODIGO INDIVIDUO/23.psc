	Algoritmo  Menú
		Repetir
			Limpiar Pantalla
			Escribir "Menú de recomendaciones"
			Escribir "   1. Literatura"
			Escribir "   2. Cine"
			Escribir "   3. Música"
			Escribir "   4. Salir"
			Escribir "Elija una opción (1-4): "
			Leer OP
			Segun OP Hacer
				1:
					Escribir "Lecturas recomendables:"
					Escribir " + El principito (Antonie de Saint Exupery)"
					Escribir " + El Budadarma (Kalama Sadak)"
					Escribir " + Las Mil y una Noche (Anónimo)"
				2:
					Escribir "Películas recomendables:"
					Escribir " + El código enigma (2014)"
					Escribir " + Rush: Pasión y gloria (2013)"
					Escribir " + Jobs (2013)"
				3:
					Escribir "Discos recomendables:"
					Escribir " + Así en el cielo como en la selva (La Raíz, 2013)"
					Escribir " + Dónde jugarán las niñas (Molotov, 1997)"
					Escribir " + V.E.H.N Viaje épico hacia la nada (Love of Lesbian, 2021)"
				4:
					Escribir "Gracias, vuelva pronto"
				De otro modo:
					Escribir "Opción no válida"
			FinSegun
			Escribir "Presione enter para continuar"
			Esperar Tecla
		Hasta Que OP=4
FinAlgoritmo
