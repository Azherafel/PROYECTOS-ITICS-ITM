Proceso CONVERTIDOR_DE_MINUTOS_EN_DIAS_HORAS_MINUTOS
	//Definimos las variables a utilizar
	Definir N, minutos, horas, dias Como Real;
	//Escribimos la cantidad de minutos que se desean convertir
	Escribir "Ingrese una cantidad de minutos:";
	Leer N;
	//Creamos un ciclo para automatizar las operaciones
	Si N >0 Entonces
		//Primero obtenemos los dias, dividiendo los minutos ingresados entre los minutos que hay en un dia (1440)
		dias <- N mod 1440;
		dias <- trunc(N/1400);
		//Despues obtenemos las horas dividiendo el residuo obtenido de los dias, entre 60 que son los minutos que hay en una hora
		horas <- N MOD 60;
		horas <- trunc(N/60/24);
		//Despues obtenemos los minutos diviendo el residuo obtenido de las horas, entre 60 que son los segundos que hay en un minuto
		minutos <- N MOD 60;
		minutos <-trunc(N/horas/60);
		//Escribimos los resultados en pantalla
		Escribir dias, "Dias";
		Escribir horas, "Horas";
		Escribir minutos, "Minutos";
	FinSi
FinProceso
