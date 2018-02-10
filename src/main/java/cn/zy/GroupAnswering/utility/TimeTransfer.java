package cn.zy.GroupAnswering.utility;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeTransfer {
	
	public static LocalDateTime transfer(String time) {
		DateTimeFormatter sf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		return LocalDateTime.from(sf.parse(time));
	}

}
