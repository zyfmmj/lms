package com.peppa.yec.demo.service.imp;

import com.peppa.yec.demo.mapper.SendBillMapper;
import com.peppa.yec.demo.pojo.Path;
import com.peppa.yec.demo.pojo.SendBill;
import com.peppa.yec.demo.service.PathService;
import com.peppa.yec.demo.service.SendBillService;
import com.peppa.yec.demo.util.ListPage;
import com.peppa.yec.demo.util.RandomNum;
import com.sun.mail.imap.protocol.BODY;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zyf
 */
@Service
public class SendBillServiceImp implements SendBillService {

    @Autowired
    SendBillMapper sendBillMapper;

    @Autowired
    PathService pathService;

    @Override
    public Integer addSendBill(SendBill sendBill) {
        Integer waybillNo = RandomNum.getNum();
        while(sendBillMapper.selectExistsWaybillNo(waybillNo) != 0){
            waybillNo = RandomNum.getNum();
        }
        sendBill.setWaybillNo(waybillNo);
        if(sendBillMapper.insertSelective(sendBill) != 0){
            return waybillNo;
        }else{
            return 0;
        }
    }

    @Override
    public SendBill findSendBillByWaybillNo(Integer waybillNo) {
        return sendBillMapper.selectByWaybillNo(waybillNo);
    }

    @Override
    public Boolean updateSendBill(SendBill sendBill) {
        if(sendBillMapper.updateByPrimaryKey(sendBill) != 0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public SendBill findSendBillById(Integer id) {
        return sendBillMapper.selectByPrimaryKey(id);
    }

    @Override
    public Double calcCost(Path path,Integer num,  Double weight, Double bulk) {
        return (path.getStartingCost() + (weight * path.getWeightCost()) + (bulk * path.getBulkCost())) * num;
    }

    @Override
    public Path findByOrigin(String origin, String terminus){
        return pathService.findByPath(origin, terminus);
    }

    @Override
    public ListPage findAll(Integer state, Integer pageNo, Integer pageSize) {
        if(pageNo == null || pageNo < 1){
            pageNo = 1;
        }
        ListPage page = new ListPage();
        page.setPageSize(pageSize);
        page.setPageNo(pageNo);
        page.setCount(sendBillMapper.selectCountByState(state));
        page.setList(sendBillMapper.selectByState(state,page.getOffset(),pageSize));
        return page;
    }

    @Override
    public Boolean updateState(Integer waybillNo, Integer state) {
        return getBoolean(sendBillMapper.updateState(waybillNo,2));
    }

    private Boolean getBoolean(Integer result){
        if(result!=0){
            return true;
        }else{
            return false;
        }
    }
}
