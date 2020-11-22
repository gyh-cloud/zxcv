package com.qf.controller;


import com.qf.pojo.Good;
import com.qf.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
@Controller
@RequestMapping("/good")
//@RestController("/good")
public class GoodController {
    @Autowired
    GoodService goodService;
    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public String findAll(Model model){
        List<Good> list = goodService.findAll();
        model.addAttribute("list",list);
        return "good";
    }
    @RequestMapping("/findById")
    public String findById(Model model,Integer id){
        Good good = goodService.findById(id);
        model.addAttribute("good",good);
        return "update";
    }
    @RequestMapping("/deleteById")
    public String deleteById(Integer id){
        goodService.deleteById(id);
        return "redirect:/good/findAll";
    }
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public String insert(Good good, MultipartFile file){
        goodService.insert(good,file);
        return "redirect:/good/findAll";
    }
    @RequestMapping("/updateById")
    public String updateById(Good good){
        goodService.updateById(good);
        return "redirect:/good/findAll";
    }
    @RequestMapping("/toinsert")
    public String toinsert(){
        return "insert";
    }
}
