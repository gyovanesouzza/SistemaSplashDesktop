package http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.SocketException;
import java.net.URL;
import java.nio.charset.Charset;

import javax.swing.JOptionPane;

import util.Constantes;

public class HttpClient {
	

	
	public String sendGET(String url, String method) throws SocketException,IOException {
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setRequestMethod(method);
		con.setRequestProperty("User-Agent", Constantes.getUSER_AGENT());
		con.setRequestProperty("Accept-Charset", "UTF-8");
		con.setRequestProperty("Accept", "application/json");
		con.setRequestProperty("Content-Type", "application/json;charset=UTF-8");
		int responseCode = con.getResponseCode();
		System.out.println("Sending 'GET' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);
		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream(),Charset.forName("UTF-8")));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
		
		return response.toString();
	}
	
	public String sendPOST(String url,String json ,String method)  throws SocketException,IOException {
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		con.setRequestMethod(method);
		con.setRequestProperty("User-Agent", Constantes.getUSER_AGENT());
		con.setRequestProperty("Accept-Charset", "ISO-8859-1"); 
		con.setRequestProperty("Accept-Language", "en-US,en;q=0.5,pt-br");
		con.setRequestProperty("Content-Type", "application/json;charset=ISO-8859-1");

		con.setDoOutput(true);
		OutputStreamWriter out = new OutputStreamWriter(con.getOutputStream());
		out.write(json);
		out.flush();
		out.close();

		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'POST' request to URL : " + url);
		System.out.println("Submit JSON: " +json);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();

		return response.toString();
	}
	public String sendPUT(String url,String json ,String method)  throws SocketException,IOException {
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		con.setRequestMethod(method);
		con.setRequestProperty("User-Agent", Constantes.getUSER_AGENT());
		con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
		con.setRequestProperty("Content-Type", "application/json;charset=ISO-8859-1");

		con.setDoOutput(true);
		OutputStreamWriter out = new OutputStreamWriter(con.getOutputStream());
		out.write(json);
		out.flush();
		out.close();

		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'PUT' request to URL : " + url);
		System.out.println("Submit JSON: " +json);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();

		return response.toString();
	}
	
	public String sendDELETE(String url, String method) throws SocketException,IOException {

		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setRequestMethod(method);
		con.setRequestProperty("User-Agent", Constantes.getUSER_AGENT());
		con.setRequestProperty("Accept-Charset", "ISO-8859-1");
		con.setRequestProperty("Accept", "application/json");
		con.setRequestProperty("Content-Type", "application/json;charset=ISO-8859-1");
		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'DELETE' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);
		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
		
		return response.toString();

	}

}
