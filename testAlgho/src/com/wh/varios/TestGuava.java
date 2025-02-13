package test;

import com.google.gson.Gson;

public class TestGuava {

	
public static void main(String[] args) {
	
	Gson gson = new Gson();
    String myString = "{AcquirerName='a bc', AcquiringBankCode=0.2, ApprovalCode=00}";
    MyModel myModel = gson.fromJson(myString, MyModel.class);
    String json = gson.toJson(myModel, MyModel.class);
    System.out.println(json);
}
	
}
