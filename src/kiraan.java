import java.util.Scanner;
public class kiraan {
public static void main(String[] args) {
  
int a;
int b;
int c;
char jawapan;


Scanner input = new Scanner(System.in);
    


do{
System.out.println("Masukkan nombor anda");
b=input.nextInt();

for(a=1; a<5; a++){
c=a*b;
System.out.println(a+"x"+b+"="+c);
}

System.out.print("ingin teruskan? taip y");
jawapan=input.next().charAt(0);
}while(jawapan=='y');
}
}

        


        




