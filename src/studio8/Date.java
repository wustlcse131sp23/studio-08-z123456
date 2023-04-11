package studio8;

import java.util.ArrayList;
import java.util.List;

public class Date {
	private int month;
	private int year;
	private int day;
	private String[] lst;
	public Date(int month1,int year1, int day1){
		month=month1;
		year=year1;
		day=day1;
		lst=new String[2];//**
		lst[0]="2019-01-01";
		lst[1]="2019-01-02";
	}
	public String to_String() {
		String Smonth;
		String Sday;
		String Syear=""+year;

		if (month >=10) {
			Smonth=""+month;
		}
		else {
			Smonth="0"+month;
		}
		if (day>=10) {
			Sday=""+day;
		}
		else {
			Sday="0"+day;
		}
		return Syear+"-"+Smonth+"-"+Sday;
	}
	
	public boolean is_holiday() {
		String Sdate=to_String();
		for (int i=0;i<=lst.length-1;i++) {
			if (Sdate.equals(lst[i])) {
				return true;
			}
		}
		return false;
	}
    public static void main(String[] args) {
    	Date class1=new Date(1,2019,1);

    	System.out.println(class1.is_holiday());
    }

}
