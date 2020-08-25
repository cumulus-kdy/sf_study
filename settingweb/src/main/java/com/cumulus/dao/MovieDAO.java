package com.cumulus.dao;

import java.util.List;

import com.cumulus.vo.MovieVO;
 
public interface MovieDAO {
    
    public List<MovieVO> selectMovie() throws Exception;
}
