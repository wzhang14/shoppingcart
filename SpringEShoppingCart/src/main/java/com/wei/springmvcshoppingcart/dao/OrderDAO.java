package com.wei.springmvcshoppingcart.dao;

import java.util.List;

import com.wei.springmvcshoppingcart.model.CartInfo;
import com.wei.springmvcshoppingcart.model.OrderDetailInfo;
import com.wei.springmvcshoppingcart.model.OrderInfo;
import com.wei.springmvcshoppingcart.model.PaginationResult;

public interface OrderDAO {
	
	public void saveOrder(CartInfo cartInfo);
	
	public PaginationResult<OrderInfo> listOrderInfo(int page, int maxResult, int maxNavigationPage);
	
	public OrderInfo getOrderInfo(String orderId);
	
	public List<OrderDetailInfo> listOrderDetailInfos(String orderId);

}
