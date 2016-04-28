package finalcapture;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Capture {
	public ArrayList<String> getname(String url) throws IOException{
		Document document = Jsoup.connect(url).get();
		ArrayList<String> list=new ArrayList<String>();
		Elements name=document.getElementsByClass("product-name");
		int len=name.size();
		for(int i=0;i<len;i++)
			list.add(name.get(i).text());
		return list;
	}
	public ArrayList<String> getrate(String url) throws IOException{
		Document document = Jsoup.connect(url).get();
		ArrayList<String> list=new ArrayList<String>();
		Elements name=document.getElementsByClass("interest-rate");
		int len=name.size();
		for(int i=0;i<len;i++)
			list.add(name.get(i).getElementsByClass("num-style").text());
		
		return list;
		
	}
	public ArrayList<String> gettime(String url) throws IOException{
		Document document = Jsoup.connect(url).get();
		ArrayList<String> list=new ArrayList<String>();
		Elements name=document.getElementsByClass("invest-period");
		int len=name.size();
		for(int i=0;i<len;i++)
			list.add(name.get(i).child(1).text());
		return list;
		
	}
	
	public ArrayList<String> getmoney(String url) throws IOException{
		Document document = Jsoup.connect(url).get();
		ArrayList<String> list=new ArrayList<String>();
		Elements name=document.getElementsByClass("product-amount");
		int len=name.size();
		for(int i=0;i<len;i++)
		list.add(name.get(i).getElementsByClass("num-style").text());
		return list;
		
	}

}
