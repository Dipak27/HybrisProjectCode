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

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.cybage.model.CybageEmployeeModel;


/**
 *
 */
public class EmployeeMoldelListtoDtoList implements Converter<List<CybageEmployeeModel>, List<CybageEmployeeDto>>
{

	@Override
	public List<CybageEmployeeDto> convert(final List<CybageEmployeeModel> source) throws ConversionException
	{
		final List<CybageEmployeeDto> destination = new ArrayList<>();
		if (source != null)
		{
			return convert(source, destination);
		}
		else
		{
			return null;
		}
	}

	@Override
	public List<CybageEmployeeDto> convert(final List<CybageEmployeeModel> source, final List<CybageEmployeeDto> destination)
			throws ConversionException
	{
		final Iterator<CybageEmployeeModel> iterator = source.iterator();

		while (iterator.hasNext())
		{
			final CybageEmployeeModel sourceList = iterator.next();
			final CybageEmployeeDto destinationList = new CybageEmployeeDto();
			destinationList.setCybempId(sourceList.getCybempId());
			destinationList.setFirstName(sourceList.getFirstName());
			destinationList.setLastName(sourceList.getLastName());
			destinationList.setEmpPassword(sourceList.getEmpPassword());
			destination.add(destinationList);
		}

		return destination;

	}

}
