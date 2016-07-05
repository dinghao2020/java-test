package com.mkyong.web.controller;

import model.Role;
import org.msgpack.MessagePack;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String printWelcome(ModelMap model, HttpServletRequest request) throws Exception{
        Role role = new Role(1,"admin",1,1,1);

        //request.getSession().setAttribute("czc",role);

        model.addAttribute( "message", "Spring 3 MVC Hello World");
        return "hello";

    }

    @RequestMapping(value = "/getSession", method = RequestMethod.GET)
    public String getSession(ModelMap model, HttpServletRequest request) throws Exception{


        //Role role = (Role)request.getSession().getAttribute("czc");

        model.addAttribute("message", "Spring 3 MVC Hello World");
        return "hello";
    }


    @RequestMapping(value = "/hello/{name:.+}", method = RequestMethod.GET)
    public ModelAndView hello(@PathVariable("name") String name) {

        ModelAndView model = new ModelAndView();
        model.setViewName("hello");
        model.addObject("msg", name);

        return model;

    }


    @RequestMapping(value = "/foos/{fooid}/bar/{barid}")
    @ResponseBody
    public String getFoosBySimplePathWithPathVariables(@PathVariable long fooid, @PathVariable long barid) {
        return "Get a specific Bar with id=" + barid + " from a Foo with id=" + fooid;
    }


    @RequestMapping(value = "/bars/{numericId:[\\d]+}")
    @ResponseBody
    public String getBarsBySimplePathWithPathVariable(@PathVariable final long numericId) {
        return "Get a specific Bar with id=" + numericId;
    }


    @RequestMapping(value = "/bars")
    @ResponseBody
    public String getBarBySimplePathWithRequestParam(@RequestParam("id") long id) {
        return "Get a specific Bar with id=" + id;
    }

    @RequestMapping(value = "/bars", params = "id")
    @ResponseBody
    public String getBarBySimplePathWithExplicitRequestParam(@RequestParam("id") long id) {
        return "Get a specific Bar with id=" + id;
    }


    @RequestMapping(value = {"/advanced/bars", "/advanced/foos"})
    @ResponseBody
    public String getFoosOrBarsByPath() {
        return "Advanced - Get some Foos or Bars";
    }


}