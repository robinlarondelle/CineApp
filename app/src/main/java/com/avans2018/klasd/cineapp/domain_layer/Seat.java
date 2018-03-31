package com.avans2018.klasd.cineapp.domain_layer;

import android.util.Log;

/**
 * Created by HeyRobin on 26-3-2018.
 * Last Edited by Robin on 26-03-18.
 */

public class Seat {

    private int seatId;
    private int seatNumber;
    private int rowNumber;
    private Theater theater;
    private int taken;

    private final static String TAG = "Domain: Seat";

    public Seat(int seatId,int seatNumber, int rowNumber, Theater theater, int taken) {

        Log.d(TAG, "Seat-Constructor (extended) was called");
        this.seatId = seatId;
        this.seatNumber = seatNumber;
        this.rowNumber = rowNumber;
        this.theater = theater;
        this.taken = taken;
    }

    public Seat() {
        Log.d(TAG, "Seat-Constructor (empty) was called");
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public Theater getTheater() {
        return theater;
    }

    public void setTheater(Theater theater) {
        this.theater = theater;
    }

    public int isTaken() {
        return taken;
    }

    public void setTaken(int taken) {
        this.taken = taken;
    }

    public static String getTAG() {
        return TAG;
    }

    public String returnTheaterForDB() {
        return this.theater + "";
    }

    public int returnSeatNumberForDB() {
        return this.seatNumber;
    }
}
