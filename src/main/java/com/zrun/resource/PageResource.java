package com.zrun.resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Calendar;

/**
 * Created by Edward
 */
@Controller
public class PageResource {
    @RequestMapping("/")
    public String toHome(Model model){
        model.addAttribute("welcome","欢迎光临本店！");
        model.addAttribute("today", Calendar.getInstance());
        return "/home";
    }
}
