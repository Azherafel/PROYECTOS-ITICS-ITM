Algoritmo Codigo_de_barras
	Definir C�digo, C, C2, Art�culos Como Entero
	C<-1
	C2<-1
	Escribir "Vamos a ponernos a dieta"
	Escribir "Cuantos art�culos son"
	Leer Art�culos
	Mientras C<=Art�culos
		Escribir "Dame el c�digo de barras"
		Leer C�digo
		Si C�digo mod 3==0 Entonces
			Escribir "Este articulo lo puedes comprar"
			C2<-C2+1
		SiNo
			Escribir "Este articulo no lo puedes comprar"
			C2<-C2-1
			
		FinSi
		C<-C+1
	FinMientras
	Escribir "Puedes seleccionar  ", C2  "  Articulos"
FinAlgoritmo
