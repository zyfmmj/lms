package com.peppa.yec.demo.service.imp;

import com.peppa.yec.demo.mapper.CarMapper;
import com.peppa.yec.demo.pojo.Car;
import com.peppa.yec.demo.service.CarService;
import com.peppa.yec.demo.service.OfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zyf
 */
@Service
public class CarServiceImp implements CarService {
    @Autowired
    OfficeService officeService;

    @Autowired
    CarMapper carMapper;

    @Override
    public List<Car> findAll(Integer officeId) {
        return carMapper.findByOfficeId(officeId);
    }

    @Override
    public List<Car> findByState(String officeName) {
        Integer officeId = officeService.findIdByName(officeName);
        List<Car> cars =  carMapper.findByOfficeId(officeId);
        for(int i = 0; i < cars.size();i++){
            if(cars.get(i).getCarState()!=0){
                cars.remove(i);
            }
        }
        return cars;
    }
}
