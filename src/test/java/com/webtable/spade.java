package com.webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class spade {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	d.get("https://www.firstpost.com/firstcricket/points-table/series/ipl-2021.html");
	
	List<WebElement> fe = d.findElements(By.xpath("//table[@class='general-tbl ipl-points-table']"));
	
	for (int i = 0; i < fe.size(); i++) {
		WebElement hf = fe.get(i);
		String text = hf.getText();
		System.out.print(text);
	}
	
}	


	}
	

