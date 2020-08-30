package com.cumulus.service;

import java.util.List;

import javax.inject.Inject;
 
import org.springframework.stereotype.Service;
 
import com.cumulus.dao.WineQDAO;
import com.cumulus.vo.pHAcdVO;
import com.cumulus.vo.QCountVO;
 
@Service
public class WineQServiceImpl implements WineQService {
 
    @Inject
    private WineQDAO dao;
    
    @Override
    public List<QCountVO> selectQCount() throws Exception {
        return dao.selectQCount();
    }

    public List<pHAcdVO> selectpHAcd() throws Exception {
    	return dao.selectpHAcd();
    }
}