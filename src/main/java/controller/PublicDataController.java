package controller;


import entity.Language;
import entity.Profile;
import entity.Skill;
import entity.SkillCategory;
import form.RegistrationForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import repository.storage.*;
import service.EditProfileService;
import service.FindProfileService;
import sun.util.calendar.BaseCalendar;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


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

//        model.addAttribute("skills", skillRepository.findAll(new Sort("id")));
//        model.addAttribute("category", skillCategoryRepository.findAll(new Sort("id")));
//        model.addAttribute("language", languageRepository.findAll(new Sort("id")));
//        model.addAttribute("hobbies", hobbyRepository.findAll(new Sort("id")));
//        model.addAttribute("practic", practicsRepository.findAll(new Sort("id")));
//        model.addAttribute("education", educationRepository.findAll(new Sort("id")));
//        model.addAttribute("course", courseRepository.findAll(new Sort("id")) );


        return "profile";
    }


    @RequestMapping(value = "/login", method = RequestMethod.GET)

    public String getLogin(){
        return "login";
    }


    @RequestMapping(value="/error", method=RequestMethod.GET)
    public String getError(){
        return "error";
    }



    @RequestMapping(value="/main", method = RequestMethod.GET)


     public String AllProfiles(Model model){

        model.addAttribute("profiles", findprofileService.findAll(new Sort("id")));

        return "main";

    }






}
