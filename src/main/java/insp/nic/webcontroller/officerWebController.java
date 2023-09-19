package insp.nic.webcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/offi")
public class officerWebController {

    @GetMapping
    public String login(){
        return "officer/offLogin";
    }

    @GetMapping("/offindex")
    public String index(){
        return "officer/offIndex";
    }

    @GetMapping("/offRoutInsp")
    public String routInsp(){
        return "officer/offRoutInsp";
    }
}
