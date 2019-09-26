package Book;

public class PeakSeassson extends Booking {
	int month;
	int peakChrg;
	
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getPeakChrg() {
		return peakChrg;
	}

	public void setPeakChrg(int peakChrg) {
		this.peakChrg = peakChrg;
	}

	public double roomBooking(int persons, int total_Days, double tariff, String roomType, int month ,int peakCharges) {
		setMonth(month);
		setPeakChrg(peakCharges);
		return super.roomBooking(persons, total_Days, tariff, roomType)*peakCharges;
	}

}
