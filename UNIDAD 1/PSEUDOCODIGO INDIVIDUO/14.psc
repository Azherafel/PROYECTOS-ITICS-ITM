Algoritmo Números_divisibles_entre_3
	Definir N1, N2, A Como Entero
	N1<-0; N2<-0; A<-0
	Escribir "Ingresa el valor N1"
	Leer N1
	Escribir "Ingresa el valor N2"
	Leer N2
	Mientras N1<N2-1 Hacer
		N1<-N1+1
		Si N1 mod 3==0 Entonces
			Escribir "			"
			Escribir "			"
			Escribir "Este valor vale " ,N1, " Y es divisible entre 3"
			A<-A+N1
			Escribir "A vale  ", A
			Escribir "			"
		SiNo 
			Escribir "Este valor vale " ,N1, " Y no es divisible entre 3"
			
		FinSi
	FinMientras
FinAlgoritmo
