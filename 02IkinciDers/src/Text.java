
public class Text {
	public static void main(String[] args) {
		int sayi = 5;
		int sayi2 = 3;
		boolean sonuc = sayi>3 && sayi2<5 ;
		System.out.println(sonuc);
		
		int a = 6;
		boolean sonuc1 = a<5 ? true : false;
		
		String sonuc2 = a<5 ? "EVET KÜÇÜKTÜR": "HAYIR BÜYÜKTÜR";
		System.out.println(sonuc2);
		
		int kisaSinav = 50;
		int vize = 40;
		int finalNot = 80;
		int sonuc3 = kisaSinav * 2 / 10 + vize * 3 / 10 + finalNot * 5 / 10;
		System.out.println("Ders Geçme Notunuz:" + sonuc3);


	}
}
