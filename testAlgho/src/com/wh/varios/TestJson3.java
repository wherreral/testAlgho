package test;

import java.util.Iterator;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class TestJson3 {
	
	public static void main(String[] args) {
		
		
		
		String input = "[{\"productType\":\"Marca\"},{\"Marca\":100,Direction:incoming,LocalUsername:xxx,AuthUsername:31223,PeerUsername:04232000113,Name:04232000113,Server:23424,Connectime:2189msec,Duration:0msec,DiscBy:Remote,Reason:cancelNormalcallclearing}]";

		System.out.println(input.replace("Marca", "brand"));
		
		//System.out.println(jsonString);
		
		
		 

		
	}

}
