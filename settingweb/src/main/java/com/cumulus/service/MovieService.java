package com.cumulus.service;

import java.util.List;

import com.cumulus.vo.MovieVO;
 
public interface MovieService {
    
    public List<MovieVO> selectMovie() throws Exception;
}