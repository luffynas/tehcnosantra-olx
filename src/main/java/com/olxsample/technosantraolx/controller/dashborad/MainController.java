package com.olxsample.technosantraolx.controller.dashborad;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping(path = "/dashboard")
    public String index(){
        return "/dashboard/main";
    }

    @GetMapping(path = "/dashboard/location")
    public String getAllCountry(){
        return "/dashboard/locations/country";
    }

}
