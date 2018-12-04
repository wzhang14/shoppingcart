package com.wei.springmvcshoppingcart.validator;

import com.wei.springmvcshoppingcart.dao.ProductDAO;
import com.wei.springmvcshoppingcart.entity.Product;
import com.wei.springmvcshoppingcart.model.ProductInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

// @Component: As a bean.
@Component
public class ProductInfoValidator implements Validator {
	@Autowired
	private ProductDAO productDAO;
	
	// This validator support ProductInfo class.
	@Override
	public void validate(Object targe, Errors errors) {
		ProductInfo productInfo = (ProductInfo) target;
		
		//Check the fields of ProductInfo class.
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "code", "NotEmpty.productForm.code");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "NotEmpty.productForm.name");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "price", "NotEmpty.productForm.price");
		
		String code = productInfo.getCode();
		if(code!=null && code.length()>0) {
			if(code.matches("\\s+")) {
				errors.rejectValue("code", "Pattern.productForm.code");
			}else if(productInfo.isNewProduct()) {
				Product product = productDAO.findProduct(code);
				if(product!=null) {
					errors.rejectValue("code", "Duplicate.productForm.code");
				}
			}
		}
	}

}
