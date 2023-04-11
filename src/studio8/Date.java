package studio8;

import java.util.ArrayList;
import java.util.List;

import assignment8.Entity;

public class Date {
	private int month;
	private int year;
	private int day;
	private String[] lst;
	private List<Object> lst2;
	public Date(int month1,int year1, int day1){
		month=month1;
		year=year1;
		day=day1;
		lst=new String[2];//**
		lst[0]="2019-01-01";
		lst[1]="2019-01-02";
		lst2=new ArrayList<Object>();
		lst2.add(1.0);
		lst2.add(2.0);
		lst2.add(1);
		lst2.add("s");
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
    	Date class2=new Date(1,2019,1);
    	System.out.println(class1.equals(class2));
    	for (Object i:class1.lst2) {
    		System.out.println(i);
    	}
    
    }

}
