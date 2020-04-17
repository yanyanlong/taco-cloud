package com.yanyan.tacocloud;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
// 主要目的是将该类识别为组件扫描的组件。
// 由于 HomeController 是用 @Controller 注释的，
// 因此 Spring 的组件扫描会自动发现它，并在 Spring 应用程序上下文中创建一个 HomeController 实例作为 bean。
public class HomeController {
	@GetMapping("/")
	public String home(){
		return "Home";
	}

}
