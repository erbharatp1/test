/*
 * package com.iht.fbs.adaptor;
 * 
 * import java.util.List; import java.util.Random; import
 * java.util.stream.Collectors;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Component;
 * 
 * import com.iht.fbs.dto.BookingDTO; import com.iht.fbs.model.Booking; import
 * com.iht.fbs.model.Passengers;
 * 
 *//**
	 * bharat
	 *//*
		 * @Component public class BookingAdaptor implements Adaptor<BookingDTO,
		 * Booking> {
		 * 
		 * @Autowired private PassengerAdaptor adaptor;
		 * 
		 * @Override public List<Booking> uiDtoToDatabaseModelList(List<BookingDTO>
		 * uiobj) {
		 * 
		 * return uiobj.stream().map(item ->
		 * uiDtoToDatabaseModel(item)).collect(Collectors.toList()); }
		 * 
		 * @Override public List<BookingDTO> databaseModelToUiDtoList(List<Booking>
		 * dbobj) {
		 * 
		 * return dbobj.stream().map(item ->
		 * databaseModelToUiDto(item)).collect(Collectors.toList()); }
		 * 
		 * @Override public Booking uiDtoToDatabaseModel(BookingDTO uiobj) { Booking
		 * booking = new Booking(); booking.setBookingId(uiobj.getBookingId());
		 * booking.setDestination(uiobj.getDestination());
		 * booking.setDiscount(uiobj.getDiscount());
		 * booking.setCreatedDate(uiobj.getCreatedDate());
		 * booking.setUserId(uiobj.getUserId());
		 * booking.setFlightId(uiobj.getFlightId());
		 * booking.setJourneyFromDate(uiobj.getJourneyFromDate());
		 * booking.setJourneyToDate(uiobj.getJourneyToDate());
		 * booking.setMealOnePreference(uiobj.getMealOnePreference());
		 * booking.setMealRoundPreference(uiobj.getMealRoundPreference());
		 * booking.setNoOfPassengers(uiobj.getNoOfPassengers());
		 * booking.setOrigin(uiobj.getOrigin());
		 * 
		 * if (uiobj.getBookingId() != null && uiobj.getBookingId() != 0) {
		 * booking.setPnrNo(booking.getPnrNo()); } else { Random rand = new Random();
		 * int rand_int1 = rand.nextInt(99999); Long generateCode = (long) rand_int1;
		 * booking.setPnrNo(generateCode); } booking.setPrice(uiobj.getPrice());
		 * booking.setTicketStatus(uiobj.getTicketStatus());
		 * booking.setTrip(uiobj.getTrip());
		 * //booking.setPassengerList(uiobj.getPassengerList());
		 * booking.setPassengerList(adaptor.uiDtoToDatabaseModelList(uiobj.
		 * getPassengerList())); return booking; }
		 * 
		 * @Override public BookingDTO databaseModelToUiDto(Booking booking) {
		 * BookingDTO dto = new BookingDTO(); dto.setBookingId(booking.getBookingId());
		 * dto.setDestination(booking.getDestination());
		 * dto.setDiscount(booking.getDiscount());
		 * dto.setCreatedDate(booking.getCreatedDate());
		 * dto.setUserId(booking.getUserId()); dto.setFlightId(booking.getFlightId());
		 * dto.setJourneyFromDate(booking.getJourneyFromDate());
		 * dto.setJourneyToDate(booking.getJourneyToDate());
		 * dto.setMealOnePreference(booking.getMealOnePreference());
		 * dto.setMealRoundPreference(booking.getMealRoundPreference());
		 * dto.setNoOfPassengers(booking.getNoOfPassengers());
		 * dto.setOrigin(booking.getOrigin()); dto.setPnrNo(booking.getPnrNo());
		 * dto.setPrice(booking.getPrice());
		 * dto.setTicketStatus(booking.getTicketStatus());
		 * dto.setTrip(booking.getTrip()); List<Passengers> pass =
		 * booking.getPassengerList();
		 * 
		 * dto.setPassengerList(adaptor.databaseModelToUiDtoList(booking.
		 * getPassengerList()));
		 * 
		 * return dto; }
		 * 
		 * }
		 */