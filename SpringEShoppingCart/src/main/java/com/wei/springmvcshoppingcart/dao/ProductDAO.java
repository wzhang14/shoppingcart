package com.wei.springmvcshoppingcart.dao;

import com.wei.springmvcshoppingcart.entity.Product;
import com.wei.springmvcshoppingcart.model.PaginationResult;
import com.wei.springmvcshoppingcart.model.ProductInfo;


public interface ProductDAO {
    
	public Product findProduct(String code);
	public ProductInfo findProductInfo(String code);
	public PaginationResult<ProductInfo> queryProducts(int page, int maxResult, int maxNaviagtionPage);
	public PaginationResult<ProductInfo> queryProducts(int page, int maxResult, int maxNaviagtionPage, String likeName);
	public void save(ProductInfo productInfo);
}
