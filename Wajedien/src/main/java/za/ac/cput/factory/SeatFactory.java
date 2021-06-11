package za.ac.cput.factory;

import za.ac.cput.entity.Seat;

/* Wajedien Samuels
    216287820
 */

public class SeatFactory {

    public static Seat createSeat(String ClassCode, int SeatNo) {

        Seat seat = new Seat.Builder().
                        setClassCode(ClassCode).
                        setSeatNo(SeatNo).
                        build();

                        return seat;
    }
}
