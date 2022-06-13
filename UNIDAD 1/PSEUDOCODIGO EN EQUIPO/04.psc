Algoritmo sin_titulo
	// declaracion de variables
	Definir dia,a,mes,op Como Entero
	// lectura de variables
	Escribir 'Fecha del año'
	Escribir ''
	Escribir 'Ingresa el día: '
	Leer dia
	Escribir ''
	Escribir 'Ingresa el mes: '
	Leer mes
	Escribir ''
	Escribir 'Ingresa el año: '
	Leer a
	Escribir ''
	// asignamos op al mes leido en pantalla,asi nos indica que tipo de mes es
	op <- mes
	// para que podamos entrar,ya que hay 12 meses y son 31 dias
	Si mes<=12 Y dia<=31 Entonces
		// de acuerdo a op,escogera algun numero de 1-12,todo depende de la lectura en mes
		Segun mes  Hacer
			1:
				// impresion de los datos de enero
				Escribir 'El día es: ',dia
				Escribir 'El mes es: ',mes
				Escribir 'El año es: ',a
				Escribir 'la fecha es correcta, el mes es Enero'
			2:
				// impresion de los datos de febrero
				Escribir 'El día es: ',dia
				Escribir 'El mes es: ',mes
				Escribir 'El año es: ',a
				Escribir 'la fecha es correcta, el mes es Febrero'
			3:
				// impresion de los datos de marzo
				Escribir 'El día es: ',dia
				Escribir 'El mes es: ',mes
				Escribir 'El año es: ',a
				Escribir 'la fecha es correcta, el mes es Marzo'
			4:
				// impresion de los datos de abril
				Escribir 'El día es: ',dia
				Escribir 'El mes es: ',mes
				Escribir 'El año es: ',a
				Escribir 'la fecha es correcta, el mes es Abril'
			5:
				// impresion de los datos de mayo
				Escribir 'El día es: ',dia
				Escribir 'El mes es: ',mes
				Escribir 'El año es: ',a
				Escribir 'la fecha es correcta, el mes es Mayo'
			6:
				// impresion de los datos de junio
				Escribir 'El día es: ',dia
				Escribir 'El mes es: ',mes
				Escribir 'El año es: ',a
				Escribir 'la fecha es correcta, el mes es Junio'
			7:
				// impresion de los datos de julio
				Escribir 'El día es: ',dia
				Escribir 'El mes es: ',mes
				Escribir 'El año es: ',a
				Escribir 'la fecha es correcta, el mes es Julio'
			8:
				// impresion de los datos de agosto
				Escribir 'El día es: ',dia
				Escribir 'El mes es: ',mes
				Escribir 'El año es: ',a
				Escribir 'la fecha es correcta, el mes es Agosto'
			9:
				// impresion de los datos de septiembre
				Escribir 'El día es: ',dia
				Escribir 'El mes es: ',mes
				Escribir 'El año es: ',a
				Escribir 'la fecha es correcta, el mes es Septiembre'
			10:
				// impresion de los datos de octubre
				Escribir 'El día es: ',dia
				Escribir 'El mes es: ',mes
				Escribir 'El año es: ',a
				Escribir 'la fecha es correcta, el mes es Octubre'
			11:
				// impresion de los datos de noviembre
				Escribir 'El día es: ',dia
				Escribir 'El mes es: ',mes
				Escribir 'El año es: ',a
				Escribir 'la fecha es correcta, el mes es Noviembre'
			12:
				// impresion de los datos de diciembre
				Escribir 'El día es: ',dia
				Escribir 'El mes es: ',mes
				Escribir 'El año es: ',a
				Escribir 'la fecha es correcta, el mes es Diciembre'
		FinSegun
	SiNo
		// si no se cumple los de los meses,esto pasa e imprime que es fecha erronea
		Si mes>12 O dia>31 Entonces
			Escribir 'El día es: ',dia
			Escribir 'El mes es: ',mes
			Escribir 'El año es: ',a
			Escribir 'la fecha es incorrecta'
		FinSi
	FinSi
FinAlgoritmo
