package student.management.system;
import java.util.*;

public  class IDGENARATOR {
	public static int serial_no;
	public static int month;
	public IDGENARATOR() {
		serial_no=1;
		month=Calendar.getInstance().get(Calendar.MONTH)+1;
	}
	public String genarate() {
		int year = Calendar.getInstance().get(Calendar.YEAR);
		int cur_month = Calendar.getInstance().get(Calendar.MONTH)+1;
		if(month!=cur_month) {
			month=cur_month+1;
			serial_no=1;
		}
		String id=String.valueOf(year)+"-"+String.valueOf(cur_month)+"-";
		int zero=4;
		int temp=serial_no;
		for(int i=0; i<4; i++) {
			if(temp/10==0) {
				break;
			}
			else {
				temp=temp/10;
				zero--;
			}
		}
		id=id+"1";
		if(zero>0) {
			while(zero!=0) {
				id=id+"0";
				zero--;
			}
			id=id+String.valueOf(serial_no);
			serial_no++;
		}
		else {
			id=id+String.valueOf(serial_no);
			serial_no++;
		}
		return id;
	}
}