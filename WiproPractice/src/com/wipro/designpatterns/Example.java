package com.wipro.designpatterns;

import java.util.ArrayList;
import java.util.List;

public class Example {

	public static void main(String[] args) {
		NewsChannel1 ajjtak=new NewsChannel1();
		NewsChannel2 ndtv=new NewsChannel2();
		
		NewsAgency  agency=new NewsAgency();
		agency.addChannel(ajjtak);
		agency.addChannel(ndtv);
		
		agency.setNews("All learners has passed the milestone1");
        System.out.println("Breaking news by Ajjtak :"+ajjtak.getNew());
        System.out.println("Breaking news by NDTV :"+ndtv.getNew());
	}

}


interface Channel
{
	void update(String news);
	
}

class NewsChannel1 implements Channel
{
String news;


@Override
public void update(String news) {
	this.setNews(news);
}
	
	public void setNews(String news)
	{
		this.news=news;
	}
	
	public String getNew()
	{
		return news;
	}	
}


class NewsAgency
{
	String news;
	List<Channel> channelLists=new ArrayList();
	
	public void addChannel(Channel c)
	{
		this.channelLists.add(c);
	}
	
	public void removeChannel(Channel c)
	{	//remove
	}
	
	public void setNews(String news)
	{
		this.news=news;	
		for(Channel chs: channelLists)
	{
		chs.update(this.news);
	}
		
	}
	
}




class NewsChannel2 implements Channel
{
String news;

	@Override
	public void update(String news) {
		this.setNews(news);
	}
	
	public void setNews(String news)
	{
		this.news=news;
	}
	
	public String getNew()
	{
		return this.news;
	}
}


