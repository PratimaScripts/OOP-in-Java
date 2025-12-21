package Utilities;

import java.util.Date;

public class TodaysDate {
	public static void main(String[] args) {

		try {
			Date date = new Date();
			System.out.println("Today's Date Is ===>>>" + date);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
