import java.util.Locale;
import java.util.Scanner;

public class Program {

public static void main(String[] args) {
Locale.setDefault(Locale.US);
Scanner sc = new Scanner(System.in);
	
   int novahr =0;
   int novomin =0;
   System.out.println("Digite o horario do voo 'HHMM':");
       String horario = sc.nextLine();
       
       
       System.out.println("Digite quantos minutos sera a DLA 'HHMM':");
       System.out.println("Exemplo: 01:30 hr = '0130' :");
       String dlamin = sc.nextLine();
       
       String mm1 = horario.substring(2, 4);
       String hh1 = horario.substring(0, 2);
       String dla1m = dlamin.substring(2, 4);
       String dla2h = dlamin.substring(0, 2);

       int min1 = Integer.valueOf(mm1);
       int hor1 = Integer.valueOf(hh1);
       int dlatimemin = Integer.valueOf(dla1m);
       int dlatimehor = Integer.valueOf(dla2h);
        

	   if (dlatimehor<1 && dlatimemin<46){
		   System.out.println("valor invalido");
   			}
	   else if ((dlatimemin+min1)<60 && dlatimehor==0) {
		   	novahr = (hor1);
		   	novomin = (min1+dlatimemin);
           	}
	   else if ((dlatimemin+min1)>=60 && dlatimehor>=1) {
		   	novahr = (hor1+dlatimehor+1);
		   	novomin = (dlatimemin+min1-60);
		   	}
	   else if ((dlatimemin+min1)>=60 && dlatimehor<1) {
	   	   novahr = (hor1+1);
	   	   novomin = (dlatimemin+min1-60);
		   }
	   else if ((dlatimemin+min1)<60 && dlatimehor>0) {
       		novahr = (hor1+dlatimehor);
       		novomin = (min1+dlatimemin);
       	   }
	   if (novahr>=24) {
	   novahr=novahr-24;
	   }
   
	   System.out.println("Novo Horario: " + novahr + " horas " + novomin + " minutos");
	   
	   System.out.println("Digite qualquer tecla para sair... mfkr");
	   sc.close();

}

/*System.out.println("substring(2, 4): " + hh1);
System.out.println("substring(4, 6): " + mm1);

System.out.println("substring(2, 4): " + dla1m);
System.out.println("substring(4, 6): " + dla2h);
*/
   

}

