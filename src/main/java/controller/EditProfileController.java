package controller;

import entity.Profile;
import entity.SkillCategory;
import form.RegistrationForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import form.SkillForm;
import service.EditProfileService;
import service.FindProfileService;
import util.SecurityUtil;

import javax.validation.Valid;

@Controller
public class EditProfileController {

    @Autowired
    private EditProfileService editProfileService;
    @Autowired
    private FindProfileService findProfileService;

    @RequestMapping(value="/edit", method=RequestMethod.GET)
    public String getEditProfile(){
        return "redirect:/edit/main";
    }

    @RequestMapping(value = "/edit/skills", method = RequestMethod.GET)
    public String getEditSkills(Model model) {
        model.addAttribute("skillForm", new SkillForm(editProfileService.listSkills(SecurityUtil.getCurrentIdProfile())));
        return gotoSkillsJSP(model);
    }

    @RequestMapping(value = "/edit/skills", method = RequestMethod.POST)
    public String saveEditSkills(@Valid @ModelAttribute("skillForm") SkillForm form, BindingResult bindingResult, Model model) {


        if (bindingResult.hasErrors()) {
            return gotoSkillsJSP(model);
        }
        editProfileService.updateSkills(SecurityUtil.getCurrentIdProfile(), form.getItems());
        return "redirect:/tsukanov";
    }

    private String gotoSkillsJSP(Model model){
        model.addAttribute("skillCategories", editProfileService.listSkillCategories());
        return "edit/skills";
    }



    @RequestMapping(value="/edit/main", method=RequestMethod.GET)
    public String getEditMain(Model model){


        model.addAttribute("profile", editProfileService.getMain(SecurityUtil.getCurrentIdProfile()) );

        return "edit/main";
    }

    @RequestMapping(value="/edit/contacts", method=RequestMethod.GET)
    public String getEditContacts(){
        return "edit/contacts";
    }

    @RequestMapping(value="/edit/certificates", method=RequestMethod.GET)
    public String getEditCertificates(){
        return "edit/certificates";
    }

    @RequestMapping(value="/edit/languages", method=RequestMethod.GET)
    public String getEditLanguages(){
        return "edit/languages";
    }

    @RequestMapping(value="/edit/practice", method=RequestMethod.GET)
    public String getEditPractice(){
        return "edit/practice";
    }

    @RequestMapping(value="/edit/education", method=RequestMethod.GET)
    public String getEditEducation(){
        return "edit/education";
    }

    @RequestMapping(value="/edit/hobbies", method=RequestMethod.GET)
    public String getEditHobbies(){
        return "edit/hobbies";
    }

    @RequestMapping(value="/edit/additional", method=RequestMethod.GET)
    public String getEditAdditional(){
        return "edit/additional";
    }

    @RequestMapping(value="/edit/courses", method=RequestMethod.GET)
    public String getEditCourses(){
        return "edit/courses";
    }




    //REGISTER
    @RequestMapping(value = "/register", method = RequestMethod.GET)

    public String getRegister(Model model){
        model.addAttribute("registrationForm", new RegistrationForm());

        return "register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)

    public String newProfile(@ModelAttribute("RegistrationForm")RegistrationForm form, Model model)   {

        editProfileService.createNewProfile(form);

        return "/login";
    }

}
