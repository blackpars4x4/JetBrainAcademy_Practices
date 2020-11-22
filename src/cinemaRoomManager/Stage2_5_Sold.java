package cinemaRoomManager;

import java.util.Scanner;

public class Stage2_5_Sold {
    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        /*seatArrangement();*/
        System.out.println("Enter the number of rows:");
        int numOfRows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int numOfSeatEachRow = scanner.nextInt();
        int totalSeats = numOfRows * numOfSeatEachRow;
        int eachTicket;
        int totalIncome;

        if (totalSeats < 60) {
            eachTicket = 10;
            totalIncome = totalSeats * eachTicket;
        } else {
            int frontHalfTicket;
            int backHalfTicket;
            if (numOfRows % 2 == 0) {
                frontHalfTicket = (numOfRows / 2) * numOfSeatEachRow * 10;
                backHalfTicket = (numOfRows / 2) * numOfSeatEachRow * 8;
            } else {
                frontHalfTicket = ((numOfRows - 1) / 2) * numOfSeatEachRow * 10;
                backHalfTicket = ((numOfRows + 1) / 2) * numOfSeatEachRow * 8;
            }
            totalIncome = frontHalfTicket + backHalfTicket;
        }
        System.out.println("Total income: \n" + "$" + totalIncome);

    }


}
