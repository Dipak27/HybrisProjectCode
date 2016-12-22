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
public class ProjectModeltoDto implements Converter<CybageProjectModel, CybageProjectDto>
{

	@Override
	public CybageProjectDto convert(final CybageProjectModel projectModel) throws ConversionException
	{
		if (projectModel == null)
		{
			return null;
		}
		return convert(projectModel, new CybageProjectDto());
	}

	@Override
	public CybageProjectDto convert(final CybageProjectModel projectModel, final CybageProjectDto projectDto)
			throws ConversionException
	{
		projectDto.setClientName(projectModel.getClientName());
		projectDto.setDomain(projectModel.getProjectDomain());
		projectDto.setDuration(projectModel.getProjectDuration());
		projectDto.setName(projectModel.getProjectName());
		projectDto.setProjectId(projectModel.getProjectId());
		return projectDto;
	}

}
