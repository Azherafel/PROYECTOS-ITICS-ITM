Algoritmo mes_de_nacimiento
	Definir contador,contEne,contFeb,contMar,contAbr,contMay,contJun,contJul,contAgo,contSep,contOct,contNov,contDic,personas,mes como entero;
	//Definir mes Como Caracter;
	contador<-0;contEne<-0;contFeb<-0;contMar<-0;contAbr<-0;contMay<-0;contJun<-0;contJul<-0;contAgo<-0;contSep<-0;contOct<-0;contNov<-0;contDic<-0;
	Escribir "Cuantas personas van a ser? ";
	leer personas;
	mientras contador < personas Hacer
		Escribir "Dame el mes en numero de la persona";
		leer mes;
		si mes==1 Entonces
			contEne<-contEne + 1;
			
			
		FinSi
		si mes==2 Entonces
			contFeb<-contFeb + 1;
			
		FinSi
		si mes== 3 Entonces
			contMar<-contMar + 1;
			
		FinSi
		si mes==4 Entonces
			contAbr<-contAbr + 1;
			
		FinSi
		si mes==5 Entonces
			contMay<-contMay + 1;
			
		FinSi
		si mes==6 Entonces
			contJun<-contJun + 1;
			
		FinSi
		si mes== 7 Entonces
			contJul<-contJul + 1;
			
		FinSi
		si mes==  8 Entonces
			contAgo<-contAgo + 1;
			
		FinSi
		si mes== 9 Entonces
			contSep<-contSep + 1;
			
		FinSi
		si mes== 10 Entonces
			contOct<-contOct + 1;
			
		FinSi
		si mes== 11 Entonces
			contNov<-contNov + 1;
			
		FinSi
		si mes= 12 Entonces
			contDic<-contDic + 1;
			
		FinSi
		contador<-contador+1;
	FinMientras
	Escribir "Enero= ",contEne;
	Escribir "Febrero= ",contFeb;
	Escribir "Marzo= ",contMar;
	Escribir "Abril= ",contAbr;
	Escribir "Mayo= ",contMay;
	Escribir "Junio= ",contJun;
	Escribir "Julio= ",contJul;
	Escribir "Agosto= ",contAgo;
	Escribir "Septimbre= ",contSep;
	Escribir "Octubre= ",contOct;
	Escribir "Novienbre= ",contNov;
	Escribir "Diciembre= ",contDic;
FinAlgoritmo