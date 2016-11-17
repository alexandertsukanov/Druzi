package controller;


import entity.Profile;
import entity.Skill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import service.FindProfileService;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Alexander on 17/05/2016.
 */


@Controller
public class PublicDataController {

    @Autowired
    private FindProfileService findprofileService;


    @RequestMapping(value = "/{uid}", method = RequestMethod.GET)
    public String getProfile(@PathVariable("uid") String uid, Model model, HttpServletResponse response){

        Profile profile = findprofileService.findByUid(uid);


        if(profile==null){
            return "Profile_not_found";
        }
        model.addAttribute("profile", profile);
        model.addAttribute("skills",  profile.getSkills());

//        model.addAttribute("language", languageRepository.findAll(new Sort("id")));
//        model.addAttribute("hobbies", hobbyRepository.findAll(new Sort("id")));
        model.addAttribute("practic", profile.getPractics());
//        model.addAttribute("education", educationRepository.findAll(new Sort("id")));
//        model.addAttribute("course", courseRepository.findAll(new Sort("id")) );


        return "profile";
    }


    @RequestMapping(value = "/login", method = RequestMethod.GET)

    public String getLogin(){
        return "login";
    }


    @RequestMapping(value= "/error", method=RequestMethod.GET)
    public String getError(){
        return "error";
    }



    @RequestMapping(value="/main", method = RequestMethod.GET)


     public String AllProfiles(Model model){

        model.addAttribute("profiles", findprofileService.findAll(new Sort("id")));

        return "main";

    }






}
