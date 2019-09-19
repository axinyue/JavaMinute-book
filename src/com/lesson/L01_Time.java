package com.lesson;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class L01_Time {
	
	public void testOne() throws ParseException {
		
		String dastr = "2019-02-03";
		String FIX_DAY_FORMAT = "yyyy-MM-dd";
		
		long ONE_DAY_MILLIS = TimeUnit.DAYS.toMillis(1l);  // �����ж��ٺ���
		System.out.println(ONE_DAY_MILLIS);
		
		//ʱ���ַ���ת��Ϊ Date����
		SimpleDateFormat dateFormatter = new SimpleDateFormat(FIX_DAY_FORMAT);
		Date d = dateFormatter.parse(dastr);
		
		//����ʱ����
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(d.getTime());
		calendar.set(Calendar.HOUR_OF_DAY, -5);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		
		Date d2 = calendar.getTime();

		Date startDate;
		Date endDate;
		//Date startDate = calendar.getTime();
		//Date endDate = new Date(startDate.getTime() + ONE_DAY_MILLIS - 1);
		if(d.getTime() > d2.getTime()) {
			startDate = d2;
			endDate = d;
		}else {
			startDate = d;
			endDate = d2;
		}
		
		
		System.out.println("start: "+ startDate.toString());
		System.out.println("end:   "+ endDate.toString());
	}
}
