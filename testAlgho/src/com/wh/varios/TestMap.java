package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

public class TestMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//OkHttpClient client = new OkHttpClient().newBuilder().build();
			OkHttpClient client = new OkHttpClient();
			MediaType mediaType = MediaType.parse("text/plain");
			RequestBody body = RequestBody.create(mediaType, "");
			Request request = new Request.Builder()
			  .url("https://maps.googleapis.com/maps/api/distancematrix/json?origins=-33.4442814%2C-70.6561147&destinations=-33.73825562%2C-70.74961875&units=metric&key=AIzaSyDsdr6P0_U4XmCPEWOJKDQ1EJZ18pytYP0")
			  .method("GET", null)
			  .build();
			Response response = client.newCall(request).execute();
			System.out.println("response:"+response.message());
			System.out.println("response:"+response.toString());
			String str = response.body().string();
			System.out.println("response:"+str);

			JSONParser parser = new JSONParser();
			JSONObject json = (JSONObject) parser.parse(str);
			System.out.println("response:"+json.get("rows"));
			List rows = (ArrayList) json.get("rows");
			System.out.println("response:"+Arrays.asList(rows.get(0)));
			
			//List elements = (ArrayList) rows.get(0);
			JSONObject elements  = (JSONObject) parser.parse(rows.get(0).toString());
			System.out.println("response:"+Arrays.asList(elements.get("elements")));
			List elementsArr = (ArrayList) elements.get("elements");
			System.out.println("response:"+Arrays.asList(elementsArr.get(0)));
			
			JSONObject distance  = (JSONObject) parser.parse(elementsArr.get(0).toString());
			System.out.println("response:"+Arrays.asList(distance.get("distance")));
			
			JSONObject distanceKM  = (JSONObject) distance.get("distance");
			System.out.println("response:"+Arrays.asList(distanceKM.get("value")));
			
		}catch(Exception e) {
			System.out.println("exception:"+ e.getMessage());
		}
	}

}
