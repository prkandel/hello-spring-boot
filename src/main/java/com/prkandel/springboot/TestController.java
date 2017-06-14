package com.prkandel.springboot;

import com.lftechnology.machpay.common.util.DateUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;

/**
 * Created by prkandel on 6/14/17.
 */

@Controller
public class TestController {

    @RequestMapping("/")
    String home(ModelMap modelMap){
        modelMap.addAttribute("title", "Test Application");
        modelMap.addAttribute("message", "This is a test application");
        modelMap.addAttribute("date",DateUtil.formatDate(LocalDate.now(), "YYYY-MM-dd"));
        return "hello";
    }
}
