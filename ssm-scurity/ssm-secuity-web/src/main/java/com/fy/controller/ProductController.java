package com.fy.controller;

import com.fy.domain.Product;
import com.fy.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.security.RolesAllowed;
import java.util.List;

/**
 * @author java
 * @create 2019-07-26 16:55
 * @desc
 * @ClassName
 **/
@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private IProductService productService;
    //产品添加
    @RequestMapping("/save.do")
    @RolesAllowed({"USER", "ADMIN"})
    public String save(Product product) throws Exception {
        productService.save(product);
        return "redirect:findAll.do";
    }
    @RequestMapping("/findAll.do")
    @PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_USER')")
    public ModelAndView findAll() throws Exception {
        ModelAndView mv=new ModelAndView();
        List<Product> productList = productService.findAll();
        mv.addObject("productList",productList);
        mv.setViewName("product-list1");
        return mv;
    }
}
