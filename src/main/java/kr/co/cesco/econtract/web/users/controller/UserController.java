package kr.co.cesco.econtract.web.users.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@RequiredArgsConstructor
@Controller
public class UserController {

    @GetMapping("login")
    public ModelAndView login(ModelAndView mav) {
        log.info("@login=============>");
        mav.setViewName("views/web/login/login");
        return mav;
    }

}
