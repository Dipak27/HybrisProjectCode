/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * Hybris ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with SAP Hybris.*/

package com.cybage.converters;

import de.hybris.platform.catalog.data.CybageEmployeeDto;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import com.cybage.model.CybageEmployeeModel;


public class EmployeeDtotoModel implements Converter<CybageEmployeeDto, CybageEmployeeModel>
{

	@Override
	public CybageEmployeeModel convert(final CybageEmployeeDto source) throws ConversionException
	{
		final CybageEmployeeModel cybEmpModel = new CybageEmployeeModel();

		if (source != null)
		{
			return convert(source, cybEmpModel);
		}
		else
		{
			return null;
		}
	}

	@Override
	public CybageEmployeeModel convert(final CybageEmployeeDto source, final CybageEmployeeModel destination)
			throws ConversionException
	{
		destination.setCybempId(source.getCybempId());
		destination.setFirstName(source.getFirstName());
		destination.setLastName(source.getLastName());
		destination.setEmpPassword(source.getEmpPassword());
		destination.setUid("" + source.getFirstName() + source.getCybempId());
		return destination;
	}





}
