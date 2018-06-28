#ECLMS

#【发货单表】Send_Bill
- 对应实体类SendBill

#对用户订单进行处理，录入发票并打印信息。

- 运单号(waybill_no) INT UNIQUE 

- 出发站(origin) VARCHAR

- 到达站(terminus) VARCHAR

- 发货日期(send_date) DATETIME

- 发货人(give) VARCHAR

- 发货人地址(give_addr) VARCHAR

- 发货人电话(give_phone) VARCHAR

- 收货人(take) VARCHAR

- 收货人地址(take_addr) VARCHAR

- 收货人电话(take_phone) VARCHAR

- 货物名称(cargo_name) VARCHAR

- 件数(cargo_num) INT

- 包装(pack_way) VARCHAR

- 重量(cargo_weight) DOUBLE

- 体积(cargo_bulk) DOUBLE

- 运费(ship_cost) DOUBLE

- 服务费(service_cost) DOUBLE

- 保险额度(insurance) DOUBLE

- 保险费(premium) DOUBLE

- 货物补充说明(cargo_comment) VARCHAR

- 结算方式(clearing_form) VARCHAR

- 备注(comment) VARCHAR

- 承运分部(office_name) VARCHAR



#【货物配载表】(load_cargo)
- 对应实体类LoadLCargo

#对发货单进行货物配载
	
- 货单号(invoice_no) INT

- 目前地点(site) VARCHAR

- 配载日期(load_date) DATETIME
	
- 车牌号(carId) VARCHAR
	
- 货物状态 (cargo_state) TINYINT 0.已提货 1.未提货



#【】