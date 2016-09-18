package org.sakurat00ls.griffonage.simpleweb.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class BootController {


	@RequestMapping(value = "/boot", method = RequestMethod.POST,produces="text/html;charset=UTF-8")
	public @ResponseBody String insertBet(HttpServletRequest request) {
		return "ttes";
	}

}
