package Lesson8;

import java.util.ArrayList;

public class Trip {
	private ArrayList<Flight> flights;
	
	 /** @return the number of minutes from the departure of the first flight to the arrival
	 * of the last flight if there are one or more flights in the trip;
	 * 0, if there are no flights in the trip
	 */ 
	 public int getDuration() 
	 {
		 if(flights.size() < 1) {
			 return 0;
		 } else {
			 Time start = flights.get(0).getDepartureTime();
			 Time end = flights.get(flights.size()-1).getArrivalTime();
			 return start.minutesUntil(end);
		 }
	 } 
	 
	 
	 
	 
	 /** Precondition: the departure time for each flight is later than the arrival time of its 
	 * preceding flight
	 * @return the smallest number of minutes between the arrival of a flight and the departure 
	 * of the flight immediately after it, if there are two or more flights in the trip; 
	 * -1, if there are fewer than two flights in the trip
	 */ 
	 public int getShortestLayover() 
	 { 
		 if(flights.size() < 2) {
			 return -1;
		 } 
		 
		 int shortest = 25;
		 
		 for(int i = 1; i < flights.size(); i++) {
			 
			 Time arr = flights.get(i-1).getArrivalTime();
			 Time dep = flights.get(i).getDepartureTime();
			 int min = arr.minutesUntil(dep);
			 if(min < shortest) {
				 shortest = min;
			 }
		 }
		 return shortest;
	 }
	
}
