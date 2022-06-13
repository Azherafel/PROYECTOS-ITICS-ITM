Algoritmo  CD_NECESARIOS_PARA_RESPALDAR_INFORMACION
	definir gb,cantidad,cupo como real;
	cupo<-.7;
	gb<-0;
	Escribir "Cuantos GB quieres respaldar?";
	leer gb;
	cantidad<-gb/cupo;
	Escribir "Ocupas ", cantidad ," de discos para hacer el respaldo de ",gb,"GB";
	
FinAlgoritmo

