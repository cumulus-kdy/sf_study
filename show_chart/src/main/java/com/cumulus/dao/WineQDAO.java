package com.cumulus.dao;

import java.util.List;

import com.cumulus.vo.QCountVO;
import com.cumulus.vo.pHAcdVO;
 
public interface WineQDAO {
    public List<QCountVO> selectQCount() throws Exception;
    public List<pHAcdVO> selectpHAcd() throws Exception;
}
