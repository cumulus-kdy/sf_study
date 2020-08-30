package com.cumulus.show_chart;

import java.util.List;
import java.util.Locale;
 
import javax.inject.Inject;
 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
import com.cumulus.vo.QCountVO;
import com.cumulus.vo.pHAcdVO;
import com.cumulus.service.WineQService;
 
/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
    
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
    
    @Inject
    private WineQService service;
    
    /**
     * Simply selects the home view to render by returning its name.
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Locale locale, Model model) throws Exception{
 
        logger.info("home");
        
        List<QCountVO> qCountList = service.selectQCount();
        List<pHAcdVO> pHAcdList = service.selectpHAcd();
        
        model.addAttribute("qCountList", qCountList);
        model.addAttribute("pHAcdList", pHAcdList);
 
        return "home";
    }
    
}