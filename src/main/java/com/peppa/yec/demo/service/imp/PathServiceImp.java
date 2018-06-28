package com.peppa.yec.demo.service.imp;

import com.peppa.yec.demo.mapper.PathMapper;
import com.peppa.yec.demo.pojo.Path;
import com.peppa.yec.demo.service.PathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zyf
 */
@Service
public class PathServiceImp implements PathService {
    @Autowired
    PathMapper pathMapper;


    @Override
    public Path findByPath(String order, String terminus) {
        return pathMapper.findByPath(order,terminus);
    }

    @Override
    public List<Path> findByOfficeId(Integer officeId) {
        return pathMapper.findByOfficeId(officeId);
    }
}
