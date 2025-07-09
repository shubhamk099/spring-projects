package com.codeplay.eazyschool.controller;

import java.util.logging.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ContactController {

    private static final Logger log = Logger.getLogger(ContactController.class.getName());

    @RequestMapping("/contact")
    public String displayContactPage() {
        return "contact.html";
    }

    // @PostMapping("/saveMsg") - can also use this, don't need to specify the
    // method type
    // @RequestParam(value = "name") String username - to change the parameter name
    // to username, otherwise use the exact same name from the html form

    @RequestMapping(value = "/saveMsg", method = RequestMethod.POST)
    public ModelAndView saveMessage(@RequestParam String name, @RequestParam String mobileNum,
            @RequestParam String email, @RequestParam String message) {

        log.info("Name : " + name);
        log.info("Mobile Number : " + mobileNum);
        log.info("Email : " + email);
        log.info("Message : " + message);
        return new ModelAndView("redirect:/contact");
    }
}
