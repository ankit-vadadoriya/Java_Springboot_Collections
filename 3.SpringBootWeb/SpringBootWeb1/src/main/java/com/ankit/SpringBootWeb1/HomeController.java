package com.ankit.SpringBootWeb1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        System.out.println("Home method called");
        return "index";
    }

//    @RequestMapping("/add")
//        public String add(HttpServletRequest req, HttpSession session){
//        int num1 = Integer.parseInt(req.getParameter("num1"));
//        int num2 = Integer.parseInt(req.getParameter("num2"));
//        int result = num1 + num2;
        //----------------OR----------
//        public String add(@RequestParam("num1") int num, @RequestParam("num2") int num2, HttpSession session){
//        int result = num + num2;
        //-------------------OR-------------(use @RequestParam() if you use different parameter name instead of input name
//        public String add(int num1, int num2, HttpSession session){
//        int result = num1 + num2;

//        session.setAttribute("result", result);
//        return "result.jsp";
//}

//===========================use Model Instead of HttpSession=====================

//@RequestMapping("/add")
//    public String add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model){
//
//        int result = num1 + num2;
//        model.addAttribute("result", result);
//
//         return "result";   //instead of result.jsp because we add prefix and suffix in application.properties
//    }

//===========================use ModelAndView Instead of Model=====================

//    @RequestMapping("/add")
//    public ModelAndView add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, ModelAndView mv){
//
//        int result1 = num1 + num2;
//        mv.addObject("printResult", result1);
//        mv.setViewName("result");  //In a typical Spring MVC application, this might correspond to a JSP file named result.jsp located in a directory specified by the view resolver (e.g., /webapp/views/result.jsp).
//
//        return mv;
//    }

//    @RequestMapping("/addAlien")
//    public ModelAndView addAlien(@RequestParam("aid") int aid, @RequestParam("aname") String aname, ModelAndView mv){
//        Alien alien1 = new Alien();
//        alien1.setAid(aid);
//        alien1.setAname(aname);
//
//        mv.addObject("alienData", alien1);
//        mv.setViewName("result");  //In a typical Spring MVC application, this might correspond to a JSP file named result.jsp located in a directory specified by the view resolver (e.g., /webapp/views/result.jsp).
//        return mv;
//    }
    //-----------------------------------OR-------------------------------------------
    @RequestMapping("/addAlien")
//    public String addAlien(@ModelAttribute Alien alien){
        //-----------------OR--------------
    public String addAlien(Alien alien){
            return "result";    //return result.jsp page
    }

    @ModelAttribute("course")     //use this "course" in jsp file like -> &{course} and it's return Java With SpringBoot and Microservices
    public String courseName(){
        return "Java With SpringBoot and Microservices";
    }

}
