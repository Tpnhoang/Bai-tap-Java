package test;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class BOOK {
	int Codebook;
	String BookTitle;
	String Authorname;
	String Publishyear;
	int Amount;
	double Price;
	public BOOK() {
		BookTitle = new String("");
		Authorname = new String("");
		Publishyear = new String("");
		Amount=0;
		Price=0;
	}
	public int getCodebook() {
		return Codebook;
	}
	public String getBookTitle() {
		return BookTitle;
	}
	public String getAuthorname() {
		return Authorname;
	}
	public String getPublishyear() {
		return Publishyear;
	}
	public int getAmount() {
		return Amount;
	}
	
	public double getPrice() {
		return Price;
	}
	public BOOK(int Codebook, String BookTitle, String Authorname, String Publishyear, int Amount, double Price1) {
		Codebook = Codebook;
		BookTitle = BookTitle;
		Authorname = Authorname;
		Publishyear = Publishyear;
		Amount = Amount;
		Price=  Price1;
	}
}	
class BookManagement{	
	Vector list=new Vector();
	public void Nhapthongtin() {
		int n;
		System.out.println("Nhap so luong sach");
		Scanner key=new Scanner(System.in);
		n=key.nextInt();
		for (int i=1;i<=n;i++) {
			System.out.println("Nhap thong tin cho loai sach thu: "+i);
			System.out.println("Ma sach: ");
			int id=Integer.parseInt(key.next());
			key.nextLine();
			System.out.println("Ten Sach: ");
			String name = key.nextLine();
			System.out.println("Ten Tac Gia: ");
			String tacgia = key.nextLine();
			System.out.println("Nha Xuan Ban: ");
			String nam = key.nextLine();
			System.out.println("So luong: ");
			int sl=key.nextInt();
			System.out.println("Gia: ");
			double gia=key.nextDouble();
			BOOK s=new BOOK(id,name,tacgia,nam,sl,gia);
			list.add(s);
		}
		System.out.println("\n---------------------\n");
	}
	public void Insach() {
		System.out.println("Thong tin sach");
		Enumeration vEnum = list.elements();
		int i=1;
		while(vEnum.hasMoreElements()) {
			BOOK st=(BOOK)vEnum.nextElement();
			System.out.println("    "+i+"ID: "+st.getCodebook()+",Ten Sach: "+st.getBookTitle()
			+",Ten Tac Gia: "+st.getAuthorname()+",So Luong: "+st.getAmount()+",Gia: "+st.getPrice());
		}
		System.out.println("\n----------------------\n");
		}	
}