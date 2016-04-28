package finalcapture;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
	private static ArrayList<Project> list=new ArrayList<Project>();
	public static void main(String args[]) throws IOException{
		String url="https://list.lu.com/list/p2p";
		Capture capture=new Capture();
		ArrayList<String> name=capture.getname(url);
		ArrayList<String> rate=capture.getrate(url);
		ArrayList<String> time=capture.gettime(url);
		ArrayList<String> money=capture.getmoney(url);
		int len=name.size();
		for(int i=0;i<len;i++)
		{
			Project p=new Project();
			p.setName(name.get(i));
			p.setRate(rate.get(i));
			p.setTime(time.get(i));
			p.setMoney(money.get(i));
			list.add(p);
		}
		for(int i=0;i<len;i++)
		{
			System.out.println("第"+(i+1)+"个投资项目");
			System.out.println("name:"+list.get(i).getName());
			System.out.println("rate:"+list.get(i).getRate());
			System.out.println("time:"+list.get(i).getTime());
			System.out.println("money:"+list.get(i).getMoney()+"元");
			System.out.println();
			System.out.println();
		}
		
	}

}
