package Book;

public class LeanSeassson extends Booking {
	int month;
	int discount;
	
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public double roomBooking(int persons, int total_Days, double tariff, String roomType ,int discount) {
		setDiscount(discount);
		double amt=super.roomBooking(persons, total_Days, tariff, roomType)*discount/100;
		return super.roomBooking(persons, total_Days, tariff, roomType)-amt;
	}


}
