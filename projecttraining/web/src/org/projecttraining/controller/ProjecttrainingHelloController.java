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
package org.projecttraining.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.projecttraining.dto.CybageProjectDto;
import org.projecttraining.facade.CybageProjectFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller

public class ProjecttrainingHelloController
{

	@Autowired
	CybageProjectFacade projectFacade;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcome(final ModelMap model)
	{

		return "welcome";
	}


	@RequestMapping(value = "CreateEmplyee", method = RequestMethod.GET)
	public String showRegistratoinForm(final ModelMap model)
	{
		return "EmployeeRegistration";
	}

	@RequestMapping(value = "CreateEmplyee", method = RequestMethod.POST)
	public String projectRegistratoinForm(final ModelMap model)
	{

		return "welcome";
	}

	@RequestMapping(value = "DisplayEmplyee", method = RequestMethod.GET)
	public String showAllEmployeeDetails(final ModelMap model)
	{
		return "EmplyeeDetails";
	}

	@RequestMapping(value = "/CreateProject", method = RequestMethod.GET)
	public String createProject(@ModelAttribute("ProjectReg") final CybageProjectDto dto, final ModelMap model)
	{
		return "ProjectRegistration";
	}

	@RequestMapping(value = "/CreateProject", method = RequestMethod.POST)
	public String createProjectTask(@ModelAttribute final CybageProjectDto dto, final ModelMap model)
	{
		projectFacade.save(dto);

		return "welcome";
	}


	@RequestMapping(value = "/editProject", method = RequestMethod.GET)
	public String editProject(@RequestParam("id") final int id, final HttpSession session, final ModelMap map)
	{
		final List<CybageProjectDto> dtos = (List<CybageProjectDto>) session.getAttribute("projects");

		if (dtos != null)
		{
			for (final CybageProjectDto dto : dtos)
			{
				if (dto.getProjectId() == id)
				{
					map.addAttribute("matchrecord", dto);
				}
			}
		}
		return "DisplayProject";
	}

	@RequestMapping(value = "DeleteProject", method = RequestMethod.GET)
	public String deleteProject(final ModelMap model)
	{
		return "DeleteProject";
	}

	@RequestMapping(value = "DisplayProject", method = RequestMethod.GET)
	public String displayProject(final ModelMap model, final HttpSession session)
	{
		final List<CybageProjectDto> projects = projectFacade.showProject();
		session.setAttribute("projects", projects);
		return "DisplayProject";
	}

	@RequestMapping(value = "/editProject", method = RequestMethod.POST)
	public String updateProject(@ModelAttribute("matchrecord") final CybageProjectDto project, final HttpSession session)
	{
		System.out.println("-----------------Client :" + project.getClientName());
		projectFacade.updateProject(project);
		return "welcome";
	}


}
