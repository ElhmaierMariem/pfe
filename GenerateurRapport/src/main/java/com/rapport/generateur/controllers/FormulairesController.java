package com.rapport.generateur.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.jasperreports.JasperReportsPdfView;

import com.rapport.generateur.services.FormulairesServices;

import net.sf.jasperreports.engine.JasperReport;

@Controller
@RequestMapping("formulaires")
public class FormulairesController {
    @Autowired
	private FormulairesServices formulairesServices;
    
    @Autowired
    private ApplicationContext applicationContext;
    @RequestMapping(method = RequestMethod.GET)
    public String index() {
    	return "formulaires/index";
    }
    
    @RequestMapping( value = "report1" ,method = RequestMethod.GET)
    public ModelAndView report1() {
    	JasperReportsPdfView  view = new JasperReportsPdfView();
    	view.setUrl("classpath:/reports/report1.jrxml");
    	view.setApplicationContext( applicationContext);
    	Map<String, Object> params = new HashMap<String, Object>();
    	params.put("datasource", formulairesServices.report());
		return new ModelAndView(view, params);
    }
}
