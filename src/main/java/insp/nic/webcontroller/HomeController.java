package insp.nic.webcontroller;


import insp.nic.Service.ExecutiveService;
import insp.nic.Service.OfficerService;
import insp.nic.model.Executive;
import insp.nic.model.Officer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.context.HttpSessionSecurityContextRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.naming.AuthenticationException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

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

    @GetMapping("/adddepartment")
    public String adddepartment(){
        return "adddepartment";
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
    public String routineinsp(){
        return "routineinsp";
    }

    @GetMapping("/routineassignment")
    public String routineassignment(){
        return "routineassignment";
    }

    @GetMapping("/routinereport")
    public String routinereport(){
        return "routinereport";
    }

    @GetMapping("/adddesignation")
    public String adddesignation(){
        return "adddesignation";
    }

    @GetMapping("/routine")
    public String routine(){
        return "routInspMain";
    }

    @GetMapping("/grevience")
    public String grevience(){
        return "grevience";
    }

    @GetMapping("/adhoc")
    public String adhoc(){
        return "adhocMain";
    }

    @GetMapping("/adhocInsp")
    public String adhocInsp(){
        return "adhocInsp";
    }

    @GetMapping("/adhocAssignment")
    public String adhocAssignment(){
        return "adhocAssignment";
    }

    @GetMapping("/adhocReport")
    public String adhocReport(){
        return "adhocReport";
    }

    @GetMapping("/addquestions")
    public String addquestions(){
        return "addquestions";
    }

    @GetMapping("/viewquestions")
    public String viewquestions(){
        return "viewquestions";
    }

    @GetMapping("/inspunit")
    public String inspUnit(){
        return "inspection_unit";
    }



    @Autowired
    ExecutiveService executiveService;
    @PostMapping("/auth/exec")
    @ResponseBody
    public String exeAuth(HttpServletRequest request, HttpServletResponse response, @RequestBody Executive exectiveVO) throws AuthenticationException
    {
        try {
            Executive exective = executiveService.exeAuth(exectiveVO);

            if (exective != null) {
                HttpSession session = request.getSession(true);

                List<SimpleGrantedAuthority> authorities = new ArrayList<>();
                authorities.add(new SimpleGrantedAuthority("USER"));

                // unique authentication token
                Authentication myToken = new UsernamePasswordAuthenticationToken(exective.getExecutiveUserName(), exective.getExecutivePasswd(), authorities);
                SecurityContext context = SecurityContextHolder.createEmptyContext();
                context.setAuthentication(myToken);

                // session attributes values
                session.setAttribute(HttpSessionSecurityContextRepository.SPRING_SECURITY_CONTEXT_KEY, context);
                session.setAttribute("Status", "Succees");
                return "sucess";
            }
        }catch (AuthenticationException e){
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            throw new AuthenticationException("Invalid Credentials");
        }
        return "fail";
    }

    @Autowired
    OfficerService officerService;
    @PostMapping("/auth/off")
    @ResponseBody
    public String offAuth(HttpServletRequest request, HttpServletResponse response, @RequestBody Officer officerVO) throws AuthenticationException
    {
        try {
            Officer officer = officerService.exeOffi(officerVO);

            if (officer != null) {
                HttpSession session = request.getSession(true);

                List<SimpleGrantedAuthority> authorities = new ArrayList<>();
                authorities.add(new SimpleGrantedAuthority("USER"));

                // unique authentication token
                Authentication myToken = new UsernamePasswordAuthenticationToken(officer.getOfficerName(), officer.getPassword(), authorities);
                SecurityContext context = SecurityContextHolder.createEmptyContext();
                context.setAuthentication(myToken);

                // session attributes values
                session.setAttribute(HttpSessionSecurityContextRepository.SPRING_SECURITY_CONTEXT_KEY, context);
                session.setAttribute("Status", "Succees");
                return "officer login sucess";
            }
        }catch (AuthenticationException e){
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            throw new AuthenticationException("Invalid Credentials");
        }
        return "fail";
    }

    @RequestMapping("/logout")
    String logout(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.invalidate();
        return "/";
    }



}
