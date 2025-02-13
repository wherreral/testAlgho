package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class TestJson2 {

	
	public static void main(String[] args) {
		

		
		String input = "[{id=41f8278d-fdfa-405f-9f46-f5eae147c2a2, transactionType=CONFIRMED, business=PP}, {id=64344cb8-a032-4767-a09e-468302b24dd0, transactionType=CONFIRMED, business=SP}, {id=e7702f10-c87b-4b7b-89ca-5602fd0d23d7, transactionType=CONFIRMED, business=SP}, {id=a637152e-6e1c-4f3e-8f5c-cf21c9fd40f6, transactionType=CONFIRMED, business=SP}, {id=c033b08d-eb7e-4adf-ae01-c7a33b540422, transactionType=CONFIRMED, business=SS}, {id=593c95bc-3506-4cf1-910c-126af4987cd6, transactionType=CONFIRMED, business=SP}, {id=b1395af3-f99a-42b1-8f84-0ad358a57f32, transactionType=CONFIRMED, business=SP}, {id=fe204e85-6430-4fb9-8b76-8dae0c96d932, transactionType=CONFIRMED, business=SP}, {id=676a0b39-26d0-4300-9868-b8db13851875, transactionType=CONFIRMED, business=SP}, {id=99d7c808-0716-496d-8542-568efde0844e, transactionType=CONFIRMED, business=SP}]";
		Gson g = new Gson();
		JsonElement root = g.fromJson(input, JsonElement.class);
		String result = g.toJson(root);

		JsonArray ja = root.getAsJsonArray();
		JsonArray jsonArr = ja;
        Gson googleJson = new Gson();
        ArrayList jsonObjList = googleJson.fromJson(jsonArr, ArrayList.class);
        System.out.println("List size is : "+jsonObjList.size());
        System.out.println("List Elements are  : "+jsonObjList.toString());
		
        Map a = (Map) jsonObjList.get(0);
        System.out.println("id:"+a.get("id"));
	}
	
}
