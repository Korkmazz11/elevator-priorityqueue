import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
public static void main(String[] args) throws InterruptedException {



PriorityQueue asans�r = new PriorityQueue(4); // 4 ki�ilik asans�r �ncelikli kuyruk yap�s� kullan�rak olu�turur.
Scanner input = new Scanner(System.in);
boolean secim = true;




while (secim) {
    System.out.println("\n************ASANS�R*************");
    System.out.println("1. A�a�� Modunu Se�iniz");
    System.out.println("2. Yukar� Modunu Se�iniz");
    System.out.println("3. Programdan ��k�n�z");
    

    System.out.print("Se�iniz (1/2/3): ");
    String k = input.nextLine();
    switch (k) {
        case "1":  {
        	 int i=0;
        	 while(i<4) {
        		 
        		 Scanner kat = new Scanner(System.in);
        		 System.out.print("A�a�� inmek isteyen "+(i+1)+". ki�inin inmek istedi�i kat� giriniz: \n");
        		 int a= kat.nextInt();
        		 if(a>=0&&a<=100) {
        			 Scanner isim = new Scanner(System.in);
            		
            	     System.out.println("A�a�� inmek istiyen ki�inin ismini giriniz: ");
            	     String str= isim.nextLine(); 
        		     asans�r.enqueue(new QueueElement(str,a));
        		     System.out.println(str+" "+a+".kata inmek i�in asans�re bindi.");
        		     i++; 
        		 }
        		 else
        			 System.out.println("Apatmanda 100 kat bulunmaktad�r. Hatal� giri� yapt�n�z. ");
        			 
        	 }
        	 
        	 while(asans�r.isEmpty()!=true) {
        		 System.out.print((Object) asans�r.peek().getData()+" ");
        		 System.out.printf((Object) asans�r.dequeue().getPriority()+ ". katta indi\n");
        	 }
            
            break;}
        case "2": {
        	 int i=0;
        	 while(i<4) {
        		 
        		 Scanner kat = new Scanner(System.in);
        		 System.out.print("Yukar� ��kmak isteyen "+(i+1)+". ki�inin ��kmak istedi�i kat� giriniz: \n");
        		 int a= kat.nextInt();
        		 if(a>=0&&a<=100) {
        			 Scanner isim = new Scanner(System.in);
            		
            	     System.out.println("Yukar� ��kamak istiyen ki�inin ismini giriniz: ");
            	     String str= isim.nextLine(); 
        		     asans�r.enqueue(new QueueElement(str,a));
        		     System.out.println(str+" "+a+".kata ��kmak i�in asans�re bindi.");
        		     i++; 
        		 }
        		 else
        			 System.out.println("Apatmanda 100 kat bulunmaktad�r. Hatal� giri� yapt�n�z. ");
        			 
        	 }
        	  int c=3;
        	  Object temp []=new Object[4];
        	  int priority []=new int[4];
        	 while(asans�r.isEmpty()!=true) {
        		 temp[c]=asans�r.peek().getData();
        		 priority[c]=asans�r.peek().getPriority();
        		 asans�r.dequeue();
        		 c--;
        	 }
        	 int j=0;
        	 while(j<=3) {
        		 System.out.print(temp[j]+" ");
        		 System.out.print(priority[j] +". kata ��kt�\n");
        		 j++;
        	 }
        	  
            break;
            }
        case "3" : {
            System.out.println("\nProgramdan ��k.....");
            secim = false;
            TimeUnit.SECONDS.sleep(1);
        }
        default:  {
            System.out.println("\nYanl�� Giri�. Geri Tekrarla");
           
        }
    }
}


    }
}
