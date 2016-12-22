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
package org.projecttraining.facade.impl;

import java.util.List;

import org.projecttraining.convters.ProjectDtotoModel;
import org.projecttraining.convters.ProjectModelListToDtoList;
import org.projecttraining.convters.ProjectModeltoDto;
import org.projecttraining.dto.CybageProjectDto;
import org.projecttraining.facade.CybageProjectFacade;
import org.projecttraining.model.CybageProjectModel;
import org.projecttraining.service.CybageProjectService;




/**
 *
 */
public class DefaultCybageProjectFacadeImpl implements CybageProjectFacade
{

	CybageProjectService projectService;
	ProjectDtotoModel projectDtotoModel;
	ProjectModeltoDto projectModeltoDto;

	List<CybageProjectDto> cybageProjectDtoList;

	List<CybageProjectModel> cybageProjectModelList;

	public void setProjectService(final CybageProjectService projectService)
	{
		this.projectService = projectService;
	}

	public void setProjectDtotoModel(final ProjectDtotoModel projectDtotoModel)
	{
		this.projectDtotoModel = projectDtotoModel;
	}

	public void setProjectModeltoDto(final ProjectModeltoDto projectModeltoDto)
	{
		this.projectModeltoDto = projectModeltoDto;
	}



	@Override
	public boolean save(final CybageProjectDto projectDto)
	{
		return projectService.save(projectDtotoModel.convert(projectDto));
	}

	@Override
	public List<CybageProjectDto> showProject()
	{

		final ProjectModelListToDtoList projectModelListToDtoList = new ProjectModelListToDtoList();

		List<CybageProjectDto> cybageProjectDto = null;
		cybageProjectDto = projectModelListToDtoList.convert(projectService.showProject());

		return cybageProjectDto;



	}

	@Override
	public void updateProject(final CybageProjectDto newProject)
	{
		projectService.updateProject(projectDtotoModel.convert(newProject));

	}


}
