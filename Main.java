import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
public static void main(String[] args) throws InterruptedException {



PriorityQueue asansör = new PriorityQueue(4); // 4 kiþilik asansör öncelikli kuyruk yapýsý kullanýrak oluþturur.
Scanner input = new Scanner(System.in);
boolean secim = true;




while (secim) {
    System.out.println("\n************ASANSÖR*************");
    System.out.println("1. Aþaðý Modunu Seçiniz");
    System.out.println("2. Yukarý Modunu Seçiniz");
    System.out.println("3. Programdan Çýkýnýz");
    

    System.out.print("Seçiniz (1/2/3): ");
    String k = input.nextLine();
    switch (k) {
        case "1":  {
        	 int i=0;
        	 while(i<4) {
        		 
        		 Scanner kat = new Scanner(System.in);
        		 System.out.print("Aþaðý inmek isteyen "+(i+1)+". kiþinin inmek istediði katý giriniz: \n");
        		 int a= kat.nextInt();
        		 if(a>=0&&a<=100) {
        			 Scanner isim = new Scanner(System.in);
            		
            	     System.out.println("Aþaðý inmek istiyen kiþinin ismini giriniz: ");
            	     String str= isim.nextLine(); 
        		     asansör.enqueue(new QueueElement(str,a));
        		     System.out.println(str+" "+a+".kata inmek için asansöre bindi.");
        		     i++; 
        		 }
        		 else
        			 System.out.println("Apatmanda 100 kat bulunmaktadýr. Hatalý giriþ yaptýnýz. ");
        			 
        	 }
        	 
        	 while(asansör.isEmpty()!=true) {
        		 System.out.print((Object) asansör.peek().getData()+" ");
        		 System.out.printf((Object) asansör.dequeue().getPriority()+ ". katta indi\n");
        	 }
            
            break;}
        case "2": {
        	 int i=0;
        	 while(i<4) {
        		 
        		 Scanner kat = new Scanner(System.in);
        		 System.out.print("Yukarý çýkmak isteyen "+(i+1)+". kiþinin çýkmak istediði katý giriniz: \n");
        		 int a= kat.nextInt();
        		 if(a>=0&&a<=100) {
        			 Scanner isim = new Scanner(System.in);
            		
            	     System.out.println("Yukarý çýkamak istiyen kiþinin ismini giriniz: ");
            	     String str= isim.nextLine(); 
        		     asansör.enqueue(new QueueElement(str,a));
        		     System.out.println(str+" "+a+".kata çýkmak için asansöre bindi.");
        		     i++; 
        		 }
        		 else
        			 System.out.println("Apatmanda 100 kat bulunmaktadýr. Hatalý giriþ yaptýnýz. ");
        			 
        	 }
        	  int c=3;
        	  Object temp []=new Object[4];
        	  int priority []=new int[4];
        	 while(asansör.isEmpty()!=true) {
        		 temp[c]=asansör.peek().getData();
        		 priority[c]=asansör.peek().getPriority();
        		 asansör.dequeue();
        		 c--;
        	 }
        	 int j=0;
        	 while(j<=3) {
        		 System.out.print(temp[j]+" ");
        		 System.out.print(priority[j] +". kata çýktý\n");
        		 j++;
        	 }
        	  
            break;
            }
        case "3" : {
            System.out.println("\nProgramdan Çýk.....");
            secim = false;
            TimeUnit.SECONDS.sleep(1);
        }
        default:  {
            System.out.println("\nYanlýþ Giriþ. Geri Tekrarla");
           
        }
    }
}


    }
}
