/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * Hybris ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with SAP Hybris.
 */
package org.projecttraining.convters;

import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.projecttraining.dto.CybageProjectDto;
import org.projecttraining.model.CybageProjectModel;


/**
 *
 */
public class ProjectModelListToDtoList implements Converter<List<CybageProjectModel>, List<CybageProjectDto>>
{

	@Override
	public List<CybageProjectDto> convert(final List<CybageProjectModel> projectmodel) throws ConversionException
	{
		final List<CybageProjectDto> projectdto = new ArrayList<>();
		if (projectmodel != null)
		{
			return convert(projectmodel, projectdto);
		}
		else
		{
			return null;
		}
	}

	@Override
	public List<CybageProjectDto> convert(final List<CybageProjectModel> projectmodel, final List<CybageProjectDto> projectdto)
			throws ConversionException
	{
		final Iterator<CybageProjectModel> iterator = projectmodel.iterator();

		while (iterator.hasNext())
		{
			final CybageProjectModel modelList = iterator.next();
			final CybageProjectDto dtoList = new CybageProjectDto();
			dtoList.setProjectId(modelList.getProjectId());
			dtoList.setName(modelList.getProjectName());
			dtoList.setDuration(modelList.getProjectDuration());
			dtoList.setDomain(modelList.getProjectDomain());
			dtoList.setClientName(modelList.getClientName());
			projectdto.add(dtoList);
		}

		return projectdto;
	}

}
