package com.etourtravelb2b.core.comingsoon.service;

import de.hybris.platform.commerceservices.customer.DuplicateUidException;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.model.ModelService;

import java.util.List;

import javax.annotation.Resource;

import com.etourtravelb2b.core.comingsoon.dao.ComingSoonDao;
import com.etourtravelb2b.core.model.DetailsComingSoonModel;
import com.etourtravelb2b.facades.product.data.ComingSoonNotificationData;



public class ComingSoonService
{

	@Resource(name = "comingSoonDao")
	private ComingSoonDao comingSoonDao;

	@Resource(name = "modelService")
	private ModelService modelService;

	public List<ProductModel> productreturnedlist()
	{
		final List<ProductModel> listproducts = comingSoonDao.findcomingsoonproduct();
		return listproducts;
	}


	public void ComingSoonRegistration(final ComingSoonNotificationData registrationData) throws DuplicateUidException
	{

		final DetailsComingSoonModel notifyCustomerModel = new DetailsComingSoonModel();
		notifyCustomerModel.setFirstname(registrationData.getFirstName());
		notifyCustomerModel.setLastname(registrationData.getLastName());
		notifyCustomerModel.setEmailid(registrationData.getEmail());

		notifyCustomerModel.setProductCode(registrationData.getProductCode());
		notifyCustomerModel.setProductName(registrationData.getProductName());

		modelService.save(notifyCustomerModel);

	}
}
