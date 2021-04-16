package com.infor.test;

import org.testng.annotations.Test;

import com.infor.pages.BasePage;
import com.infor.pages.GoogleSearchPage;
import com.infor.pages.InforHomePage;

public class InforTest extends BasePage {

	@Test
	public void verify_Webinar() throws InterruptedException {
		invoke();
		GoogleSearchPage sp = new GoogleSearchPage();
		sp.searchOnGoogle("birst.com");

		InforHomePage ip = new InforHomePage();
		ip.verify_Google_Search_Results();
		ip.enter_details_Resource_Page();
		ip.verify_Webinar();

	}

}
