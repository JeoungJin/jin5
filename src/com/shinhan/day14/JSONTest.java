package com.shinhan.day14;

import org.json.JSONArray;
import org.json.JSONObject;

public class JSONTest {

	public static void main(String[] args) {
		f1();

	}

	private static void f1() {
		
		JSONObject jsonObj = new JSONObject();// {   }
		jsonObj.put("id", "zzilre"); // {"id":"zzilre" }
		jsonObj.put("name", "찐");
		jsonObj.put("age", 20);
		jsonObj.put("student", true);
		
		JSONObject jsonObj2 = new JSONObject();// {   }
		jsonObj2.put("id", "zzilre2"); // {"id":"zzilre" }
		jsonObj2.put("name", "찐2");
		jsonObj2.put("age", 30);
		jsonObj2.put("student", false);
		
		JSONArray arr = new JSONArray(); //[{} , {} ]
		arr.put(jsonObj);
		arr.put(jsonObj2);
		
		
		JSONObject root = new JSONObject(); //{"course":"신한금융sw아카데미", "students":[{},{}]}
		root.put("course", "신한금융sw아카데미");
		root.put("students", arr);
		
		System.out.println(root);
		
		
		System.out.println(root.get("students"));
		JSONArray arr2 = (JSONArray)root.get("students");
		for(int i=0; i<arr2.length(); i++) {
			JSONObject obj = (JSONObject)arr2.get(i);
			System.out.println(obj.get("name"));
		}
		
	}

}
