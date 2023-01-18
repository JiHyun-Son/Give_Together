package controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kic.mskim.MskimRequestMapping;
import kic.mskim.RequestMapping;

@WebServlet("/funding/*")
public class FundingController extends MskimRequestMapping {

	@RequestMapping("index")
	public String index(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("request ok");
		return "/view/funding/index.jsp";
	}
}
