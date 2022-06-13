Proceso QUE_LEA_N_LETRAS_Y_QUE_AL_FINAL_DIGA_CUANTAS_VOCALES_SE_TECLEARON
	//Declaramos las variables
	Definir letras Como Caracter
	Definir n,c,v,x Como Entero
	//Pedimos que se ingresen las letras
	Escribir "Ingresa las letras"
	Leer letras
	//Calculamos el tamaño de las letras ingresadas
	n=Longitud(letras)
	//Iniciamos la variable x con el numero 1, para controlar el ciclo mientras  
	x=1
	//Iniciamos las variables "v" vocales, "nv" no vocales
	v=0
	nv=0
	//Utilizamos un ciclo mientras hasta que la variable x sea menor o de igual tamaño a las letras ingresadas
	Mientras x <= n Hacer
		//En cada cilo con la funcion subcadena tomamos un digito de las letras ingresadas
		Segun Subcadena(letras, x,x ) Hacer
			//Si el digito es igual a la letra "a" ya seaen mayuscula o minuscula
			"a" o "A":
				//Contamos las letras con la variable "v"
				v = v +1
			//Si el digito es igual a la letra "e" ya seaen mayuscula o minuscula	
			"e" o "E":
				//Contamos las letras con la variable "v"
				v = v +1
			//Si el digito es igual a la letra "i" ya seaen mayuscula o minuscula	
			"i" o "I":
				//Contamos las letras con la variable "v"
				v = v +1
			//Si el digito es igual a la letra "o" ya seaen mayuscula o minuscula	
			"o" o "O":
				//Contamos las letras con la variable "v"
				v = v +1
			//Si el digito es igual a la letra "u" ya seaen mayuscula o minuscula	
			"u" o "U":
				//Contamos las letras con la variable "v"
				v = v +1
			//Cuando no se cumplan las condiciones anteriores, entonces es una letra no vocal	
			De Otro Modo:
				//Estas letras las contamos con la variable "nv" 
				nv= nv + 1
		FinSegun
		//En cada cilo incrementamos la varible x en 1, esto se hace para que no se haga un ciclo al infinito
		x = x + 1
	FinMientras
	//Finalmente mostramos dos mensajes en pantalla donde indicamos el numero de vocales y de no vocales
	Escribir "He encontrado ", v " vocales"
	Escribir "He econtrado  ", nv " no vocales"
FinProceso