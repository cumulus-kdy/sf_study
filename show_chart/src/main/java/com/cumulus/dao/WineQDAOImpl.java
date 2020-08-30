package com.cumulus.dao;

import java.util.List;

import javax.inject.Inject;
 
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
 
import com.cumulus.vo.QCountVO;
import com.cumulus.vo.pHAcdVO;
 
@Repository
public class WineQDAOImpl implements WineQDAO {
 
    @Inject
    private SqlSession sqlSession;
    
    private static final String Namespace = "com.cumulus.mybatis.sql.test";
    
    @Override
    public List<QCountVO> selectQCount() throws Exception {
 
        return sqlSession.selectList(Namespace+".selectQCount");
    }

    public List<pHAcdVO> selectpHAcd() throws Exception {
    	return sqlSession.selectList(Namespace+".selectpHAcd");
    }
}