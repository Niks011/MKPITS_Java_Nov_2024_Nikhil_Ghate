import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

class Hotel {
	private int motelId;
      private String motelName;
      private String dateOfBooking;
      private int noOfRoomsBooked;
      private String cabFacility;
      private int totalBill;

	public Hotel(int Id, String Name, String BookingDate, int RoomBooked, String cab, int Bill) {
      this.motelId = Id;
      this.motelName = Name;
      this.dateOfBooking = BookingDate;
      this.noOfRoomsBooked = RoomBooked;
      this.cabFacility = cab;
      this.totalBill = Bill;
    	}
	
	public int getId(){
	return motelId;
	}
	public String getName(){
	return motelName;
	}
	public String getBookingDate(){
	return dateOfBooking;
	}
	public int getRoomBooked(){
	return noOfRoomsBooked;
	}
	public String getCabFacility(){
	return cabFacility;
	}
	public int getBill(){
	return totalBill;
	}
}


class Solution{
	public static int totalNoOfRoomsBooked(Hotel[] hotel, String cabFacility){
	int totalRooms=0;
	for(int i=0; i<hotel.length; i++){
	if(hotel[i].getCabFacility().equalsIgnoreCase(cabFacility) && hotel[i].getRoomBooked()>5){
	totalRooms += hotel[i].getRoomBooked();
	}
	}return totalRooms;
	}


	public static void main(String args[]){
	Hotel array[] = new Hotel[0];
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Cab facility is Available or Not: ");
	String cabFacility = sc.next();
	try{
	BufferedReader bf = new BufferedReader(new FileReader("data.txt"));
	String line = bf.readLine();

	while(line!=null){
	String record[] = line.split(",");
	Hotel hotel = new Hotel(Integer.parseInt(record[0]), record[1], record[2], Integer.parseInt(record[3]), record[4], Integer.parseInt(record[5]));
	array = Arrays.copyOf(array, array.length+1);
	array[array.length-1] = hotel;
	line = bf.readLine();
	}
	}catch(Exception e){
	System.out.println(e);
	}

	int booked = Solution.totalNoOfRoomsBooked(array, cabFacility);
	if(booked>0){
	System.out.println("Total No of Room Booked = "+booked);
	}else{
	System.out.println("No Such Rooms Booked");
	}
	}
}