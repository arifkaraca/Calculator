import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num1, num2, result;
        char process;
        System.out.println("Birinci Sayıyı Giriniz :");
        num1 = scan.nextDouble();
        System.out.println("İkinci Sayıyı Giriniz :");
        num2 = scan.nextDouble();
        System.out.println("Yapacağınız İşlemi Seçiniz: (+, -, *, /, √, ^)");
        process = scan.next().charAt(0);
        if(process == '+') {
        	result = num1 + num2;
        	System.out.println("İşlem Sonucu: " + result);
        }else if(process == '-') {
        	result = num1 - num2;
        	System.out.println("İşlem Sonucu: " + result);
        }else if(process == '*') {
        	result = num1 * num2;
        	System.out.println("İşlem Sonucu: " + result);
        }else if(process == '/') {
        	if(num2 > 0) {
        		result = num1 / num2;
        		System.out.println("İşlem Sonucu: " + result);
        	}else {
        		System.out.println("Hata: 0 İle Bölme Yapılamaz");
        	}
        }else if(process == '√') {
        	if(num1 > 0) {
        		result = Math.sqrt(num1);
        		System.out.println("İşlem Sonucu: " + result);
        	}else {
        		System.out.println("Hata: Negatif Bir Sayının Karekökü Alınamaz");
        	}
        }else if(process == '^') {
        	result = Math.pow(num1, num2);
        	System.out.println("İşlem Sonucu: " + result);
        }
    }
}
