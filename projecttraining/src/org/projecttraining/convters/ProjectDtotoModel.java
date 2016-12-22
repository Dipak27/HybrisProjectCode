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

import org.projecttraining.dto.CybageProjectDto;
import org.projecttraining.model.CybageProjectModel;


/**
 *
 */
public class ProjectDtotoModel implements Converter<CybageProjectDto, CybageProjectModel>
{

	@Override
	public CybageProjectModel convert(final CybageProjectDto projectDto) throws ConversionException
	{
		if (projectDto == null)
		{
			return null;
		}
		return convert(projectDto, new CybageProjectModel());
	}

	@Override
	public CybageProjectModel convert(final CybageProjectDto projectDto, final CybageProjectModel projectModel)
			throws ConversionException
	{

		projectModel.setClientName(projectDto.getClientName());
		projectModel.setProjectDomain(projectDto.getDomain());
		projectModel.setProjectDuration(projectDto.getDuration());
		projectModel.setProjectName(projectDto.getName());
		projectModel.setProjectId(projectDto.getProjectId());
		return projectModel;
	}

}
