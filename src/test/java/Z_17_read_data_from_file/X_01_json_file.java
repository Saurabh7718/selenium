package Z_17_read_data_from_file;


import java.io.*;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.google.gson.JsonParser;

public class X_01_json_file {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		// TODO Auto-generated method stub
		//creating jsonparser object
		JSONParser jsonparser=new JSONParser();
		
		//parsing the content of the json file
		JSONObject obj=(JSONObject)jsonparser.parse(new FileReader("D:\\java programs\\SeleniumTraining\\src\\test\\java\\Z_17_read_data_from_file\\file.json"));
		
		//reading data from the json file
		String firstname=(String) obj.get("firstname");
		System.out.println(firstname);
	}

}

