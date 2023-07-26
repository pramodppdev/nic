package insp.nic.webcontroller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {


    @GetMapping
    public String login(){
        return "login";
    }

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/department")
    public String department(){
        return "department";
    }

    @GetMapping("/officer")
    public String officer(){
        return "officer";
    }

    @GetMapping("/inspection")
    public String inspection(){
        return "inspection";
    }

    @GetMapping("/assignment")
    public String assignment(){
        return "assignment";
    }

    @GetMapping("/report")
    public String report(){
        return "report";
    }

    @GetMapping("/administration")
    public String administration(){
        return "administration";
    }

    @GetMapping("/addconfiguration")
    public String addconfiguration(){
        return "addconfiguration";
    }

    @GetMapping("/setconfiguration")
    public String setconfiguration(){
        return "setconfiguration";
    }

    @GetMapping("/addtaluk")
    public String addtaluk(){
        return "addtaluk";
    }

    @GetMapping("/adddistrict")
    public String adddistrict(){
        return "adddistrict";
    }

    @GetMapping("/addexecutive")
    public String addexecutive(){
        return "addexecutive";
    }

    @GetMapping("/routineinsp")
    public String routInsp(){
        return "routineinsp";
    }




}
