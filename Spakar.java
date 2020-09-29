import java.util.Scanner;
public class Spakar{
public static int jawaban[]=new int[6];
	void jenis(){
		System.out.println("Tanaman hias seperti apa yang Anda inginkan?");
		System.out.println("1. Bunga yang bagus");
		System.out.println("2. Batang yang bagus");
		System.out.println("3. Daun yang bagus");
		Scanner c=new Scanner(System.in);
		jawaban[0]=c.nextInt();
	}
	void ukuran(){
		System.out.println("Bagaimana ukuran tumbuhan yang Anda inginkan?");
		System.out.println("1. Kecil");
		System.out.println("2. Sedang");
		System.out.println("3. Besar");
		Scanner c=new Scanner(System.in);
		jawaban[1]=c.nextInt();
	}
	void lokasi(){
		System.out.println("Dimana Anda ingin menanam tanaman hias?");
		System.out.println("1. Dalam ruangan");
		System.out.println("2. Luar ruangan");
		Scanner c=new Scanner(System.in);
		jawaban[2]=c.nextInt();
	}
	void media(){
		System.out.println("Media tanam apa yang Anda inginkan?");
		System.out.println("1. Tanah");
		System.out.println("2. Air");
		Scanner c=new Scanner(System.in);
		jawaban[3]=c.nextInt();	
	}
	void budget(){
		System.out.println("Berapa kisaran biaya Anda untuk membeli tanaman hias?");
		System.out.println("1. Kecil");
		System.out.println("2. Sedang");
		System.out.println("3. Besar");
		Scanner c=new Scanner(System.in);
		jawaban[4]=c.nextInt();
	}
	void perawatan(){
		System.out.println("Berapa banyak waktu Anda untuk merawat tanaman?");
		System.out.println("1. Sedikit");
		System.out.println("2. Banyak");
		System.out.println("3. Sedang");
		Scanner c=new Scanner(System.in);
		jawaban[5]=c.nextInt();
	}
}