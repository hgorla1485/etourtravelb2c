package com.etourtravelb2b.core.comingsoon.facades;

import de.hybris.platform.commerceservices.customer.DuplicateUidException;
import de.hybris.platform.core.model.product.ProductModel;

import java.util.List;

import javax.annotation.Resource;

import com.etourtravelb2b.core.comingsoon.service.ComingSoonService;
import com.etourtravelb2b.facades.product.data.ComingSoonNotificationData;



public class ComingSoonfacades
{


	@Resource(name = "comingSoonService")
	private ComingSoonService comingSoonService;

	public List<ProductModel> productreturnedlist()
	{
		final List<ProductModel> facadesList = comingSoonService.productreturnedlist();
		return facadesList;
	}

	public void ComingSoonRegistration(final ComingSoonNotificationData registrationData) throws DuplicateUidException
	{

		comingSoonService.ComingSoonRegistration(registrationData);

	}

}
