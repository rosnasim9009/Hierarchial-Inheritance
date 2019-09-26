package mainPkg;

import Book.*;
import java.io.*;

public class Main {

		public static void main(String[] args) throws IOException {
		
		Booking b=new Booking();
		PeakSeassson p=new PeakSeassson();
		LeanSeassson l=new LeanSeassson();
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
			System.out.println("\tBooking\n`````````````````````````````");
			System.out.print("\nEnter the number of persons		: ");
			int pr=Integer.parseInt(br.readLine());
			System.out.print("Enter the number of days		: ");
			int d=Integer.parseInt(br.readLine());
			System.out.print("Enter the room type			: ");
			String type=br.readLine();
			System.out.print("Enter the month             		: ");
			int mnth=Integer.parseInt(br.readLine());
			
			b.setNo_of_days(d);
			b.setRoomType(type);
			b.setNo_of_person(pr);
			
		if(mnth==1||mnth==2||mnth==3||mnth==7||mnth==8||mnth==10) {

			System.out.print("Enter the discount			: ");
			int dis=Integer.parseInt(br.readLine());
			System.out.print("Enter the tariff for single person	: ");
			int tariff=Integer.parseInt(br.readLine());
			b.setTariff(tariff);
			System.out.print("\nTotal Tariff = "+(int)(l.roomBooking(pr,d,tariff,type,dis))+"/-");
		}
		else {
				System.out.print("Enter the Peak Charge 			: ");
				int charge=Integer.parseInt(br.readLine());
				System.out.print("Enter the tariff for single person	: ");
				int tariff=Integer.parseInt(br.readLine());
				b.setTariff(tariff);
				System.out.print("\nTotal Tariff = "+(int)(p.roomBooking(pr,d,tariff,type,mnth,charge))+"/-");

			}
		}
}
