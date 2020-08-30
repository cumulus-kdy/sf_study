package com.cumulus.service;

import java.util.List;

import com.cumulus.vo.QCountVO;
import com.cumulus.vo.pHAcdVO;
 
public interface WineQService {
    public List<QCountVO> selectQCount() throws Exception;
    public List<pHAcdVO> selectpHAcd() throws Exception;
}