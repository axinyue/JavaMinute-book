package com.lesson;

import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
/*@package fastjson-1.1.39
 *
*/
public class L02_JSON {
	
	@Test
	public void testfastjson(){
		String channelParam="channel";
		String extChannel = "";
		String ext = "{\"channel\":\"123\"}";
		if(!("".equals(ext)|| ext==null)) {  
			JSONObject extObj = JSON.parseObject(ext);
			extChannel = extObj.getString(channelParam);
			extChannel = extChannel==null ? "":extChannel;
		}
		
		System.out.println(extChannel);
	}
}
