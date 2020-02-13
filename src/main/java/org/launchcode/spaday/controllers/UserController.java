package org.launchcode.spaday.controllers;

import org.launchcode.spaday.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("user")
public class UserController {


    @GetMapping("add")
    private String displayAddUserForm(){
      // System.out.println("test");
        return "user/add";
    }

    @PostMapping("add")
    public String processAddUserForm(Model model, @ModelAttribute User user, @RequestParam String verify) {
        if (user.getPassWord().equals(verify)){
            return "user/index";
        }
            //user.model.addAttribute("error","Error Message");
            return "user/add";

        }



//
//    Check that the verify parameter matches the password within the user object.
//    If it does, render the user/index.html view template with a message that welcomes
//    the user by username. If the passwords don’t match, render the form again.


}
