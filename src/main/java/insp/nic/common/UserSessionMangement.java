package insp.nic.common;

import insp.nic.model.Executive;
import insp.nic.repo.ExecutiveRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.context.HttpSessionSecurityContextRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/session")
public class UserSessionMangement {

    @Autowired
    private ExecutiveRepo executiveRepo;

    private String getSessionUsername(HttpSession session) {
        // Get the SecurityContext from the session
        SecurityContext securityContext = (SecurityContext) session.getAttribute(HttpSessionSecurityContextRepository.SPRING_SECURITY_CONTEXT_KEY);

        // Check if the user is authenticated
        if (securityContext != null && securityContext.getAuthentication() != null && securityContext.getAuthentication().isAuthenticated()) {
            // Get the username from the authentication object
            String username = securityContext.getAuthentication().getName();
            return username;
        } else {
            // User is not authenticated
            return null;
        }
    }


    // Example endpoint where you want to access the username
    @GetMapping("/session_user")
    public String exampleEndpoint(HttpSession session) {
        String username = getSessionUsername(session);

        if (username != null) {
            return username ;
        } else {
            return "not Logged in";
        }
    }


    @GetMapping("/getUserDist")
    public String getUserDist(HttpSession session){
        String username = getSessionUsername(session);

        if (username!= null){
            Executive executive = executiveRepo.findAllByUserName(username);
            if(executive != null){
                return executive.getDistrict();
            }
            else {
                return "District not Found for User";
            }
        }
        else {
            return "Not logged in";
        }
    }



}
