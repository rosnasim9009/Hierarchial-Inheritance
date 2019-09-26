package Book;

public class Booking 
{
	int no_of_person;
	int no_of_days;
	double tariff;
	String roomType;
	
	public int getNo_of_person() {
		return no_of_person;
	}
	public void setNo_of_person(int no_of_person) {
		this.no_of_person = no_of_person;
	}
	public int getNo_of_days() {
		return no_of_days;
	}
	public void setNo_of_days(int no_of_days) {
		this.no_of_days = no_of_days;
	}
	public double getTariff() {
		return tariff;
	}
	public void setTariff(double tariff) {
		this.tariff = tariff;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	
	public double roomBooking(int persons,int total_Days, double tariff, String roomType) {
		
		return persons*total_Days*tariff;
	}
}