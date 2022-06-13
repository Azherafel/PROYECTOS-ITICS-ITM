Algoritmo  LEER_LAS_MATERIAS_Y_CALCULAR_PROMEDIO
	Definir materia Como Caracter;
	Definir contador,p Como Entero;
	Definir calificacion,promedio como Real;
	promedio<-0;
	contador<-1;
	p<-0;
	Escribir "Dame el numero de marterias que deseas saber el promedio";
	leer p;
	mientras contador<=p Hacer
		Escribir "Dame el nombre de tu materia";
		leer materia;
		escribir"Dame tu calificacion final de la materia de ",materia;
		leer calificacion;
		promedio<-promedio+calificacion;
		contador<-contador+1;
	FinMientras
	promedio<-promedio/p;
	escribir "Tu promedio final es de " ,promedio;
FinAlgoritmo
