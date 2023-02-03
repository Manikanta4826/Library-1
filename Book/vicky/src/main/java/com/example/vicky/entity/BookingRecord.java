package com.example.vicky.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="BookingRecords")
public class BookingRecord {

    @Id
    String id;

    private String bookNumber;

    private String bookingDate;

//    public BookingRecord() {
//		super();
//	}

    public BookingRecord(String id, String bookNumber,
                         String bookingDate) {
        super();
        this.id = id;
        this.bookNumber = bookNumber;

        this.bookingDate = bookingDate;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(String bookNumber) {
        this.bookNumber = bookNumber;
    }







    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }



}
