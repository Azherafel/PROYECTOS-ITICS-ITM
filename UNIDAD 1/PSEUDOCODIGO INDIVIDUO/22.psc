Algoritmo Codigo_de_barras
	Definir Código, C, C2, Artículos Como Entero
	C<-1
	C2<-1
	Escribir "Vamos a ponernos a dieta"
	Escribir "Cuantos artículos son"
	Leer Artículos
	Mientras C<=Artículos
		Escribir "Dame el código de barras"
		Leer Código
		Si Código mod 3==0 Entonces
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
