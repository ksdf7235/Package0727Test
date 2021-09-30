package org.fintech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;




@Controller
@RequestMapping("/exam/*")
@Log4j
public class ExamController {
	


		@GetMapping("/test1")
		public void doAll() {
			log.info("test1");
		}
		
		@GetMapping("/test2")
		public void doMember() {
			log.info("test2");
		}
		
		@GetMapping("/test3")
		public void doAdmin() {
			log.info("test3");
		}
	}
