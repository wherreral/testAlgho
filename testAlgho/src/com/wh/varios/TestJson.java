package test;

import java.util.Iterator;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class TestJson {
	
	public static void main(String[] args) {
		
		
		
		String input = "[{\"productType\":equipo},{\"productType\":100,Direction:incoming,LocalUsername:xxx,AuthUsername:31223,PeerUsername:04232000113,Name:04232000113,Server:23424,Connectime:2189msec,Duration:0msec,DiscBy:Remote,Reason:cancelNormalcallclearing}]";

		Gson g = new Gson();
		JsonElement root = g.fromJson(input, JsonElement.class);
		String result = g.toJson(root);

		System.out.println(result);
		
		JsonArray ja = root.getAsJsonArray();
		JsonArray list = new JsonArray(); 
		
		System.out.println(ja.size());
		int i = 0;
		
		for (Iterator<JsonElement> it = ja.iterator(); it.hasNext();) {
		        JsonObject jo = it.next().getAsJsonObject();
		       System.out.println(jo.get("productType").getAsString());
		       
		       
		       if(jo.get("productType").getAsString().equalsIgnoreCase("equipo")) {
		    	   list.add(jo);
		       }		       
		}
		
		String jsonString = list.toString();
		System.out.println(jsonString);
		
		
		 

		
	}

}
