package com.cumulus.show_chart;

import java.util.List;
 
import javax.inject.Inject;
 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cumulus.vo.QCountVO;
import com.cumulus.vo.pHAcdVO;
import com.cumulus.service.WineQService;

@RestController
public class restController {
    
    private static final Logger logger = LoggerFactory.getLogger(restController.class);
    
    @Inject
    private WineQService service;
    
    /**
     * Simply selects the home view to render by returning its name.
     */
    @RequestMapping(value = "/restqCount")
    public List<QCountVO> qCountList() throws Exception{
 
        logger.info("home");
        
        List<QCountVO> qCountList = service.selectQCount();
        
        return qCountList;
    }
    
    @RequestMapping(value = "/restpHAcd")
    public List<pHAcdVO> pHAcdList() throws Exception{
    	 
        logger.info("home");
        
        List<pHAcdVO> pHAcdList = service.selectpHAcd();
        
        return pHAcdList;
    }
}