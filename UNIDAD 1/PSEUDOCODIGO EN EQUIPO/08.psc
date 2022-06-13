Algoritmo NUMEROS_DIVISIBLES_ENTRE_ELLOS
	//Definir las variables como reales, ya que son numeros
	Definir  n1, n2, n3, n4 Como Real
	//Escribir los numeros a dividor
	Escribir "Escribe un numero"
	Leer n1
	Escribir "Escribe un numero"
	Leer n2
	//Creamos un ciclo para automatizar las funciones a desarrollar
	//Checamos si el primer valor no es menor a cero, ya que si los es se termina el proceso 
	Si n1>=0 Entonces
		//Utilizamos el "mod" para obtener el residuo de la division
		n3=n1 mod n2
		//Escribimos en pantalla el residuo de la division 
		Escribir "Es el residuo de la division de ", n1 " / " n2, " es " n3 
	SiNo
		//Si el numero es menor a cero "0" el proceso se termina
		Escribir, n1 " No es mayor a cero, proceso finalizado"
	FinSi
	//Checamos si el segundo valor no es menor a cero, ya que si lo es se termina el proceso 
	Si n2>=0 Entonces
		//Utilizamos el "mod" para obtener el residuo de la division 
		n4=n2 mod n1
		//Escribimos en pantalla el residuo de la division
		Escribir "Es el residuo de la division de ", n2 " / " n1, " es " n4
	SiNo
		//Si el numero es menor a cero "0 el proceso se termina"
		Escribir, n2 " No es mayor a cero, proceso finalizado"
	FinSi
FinAlgoritmo
