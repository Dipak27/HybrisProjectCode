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

package com.cybage.controller;

import de.hybris.platform.catalog.data.CybageEmployeeDto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cybage.CreateEmployeeForm;
import com.cybage.facade.CybageEmployeeFacade;


@Controller
public class CybageHelloController
{
	@Autowired
	CybageEmployeeFacade cybageemployeeFacade;


	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String loginEmployee()
	{
		return "welcome";
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String loginEmployeeProcess(final CreateEmployeeForm createEmployeeForm)
	{
		System.out.println("Login Empid" + createEmployeeForm.getEid() + "" + createEmployeeForm.getManager() + ""
				+ createEmployeeForm.getProject());
		cybageemployeeFacade.validate(convert(createEmployeeForm));
		return "home";
	}

	@RequestMapping(value = "/createEmployee", method = RequestMethod.GET)
	public String createEmployee()
	{

		return "CreateEmployee";
	}

	@RequestMapping(value = "/createEmployee", method = RequestMethod.POST)
	public String createEmployeeProcess(final CreateEmployeeForm createEmployeeForm)
	{
		cybageemployeeFacade.createEmp(convert(createEmployeeForm));
		return "home";
	}

	@RequestMapping(value = "/ListEmployee", method = RequestMethod.GET)
	public String showEmployee()
	{
		return "ShowEmployee";
	}

	@RequestMapping(value = "/ListEmployee", method = RequestMethod.POST)
	public String showEmployeeProcess()
	{
		return "ShowEmployee";
	}

	@RequestMapping(value = "/deleteEmployee", method = RequestMethod.GET)
	public String deleteEmployee()
	{
		return "ShowEmployee";
	}

	@RequestMapping(value = "/deleteEmployee", method = RequestMethod.POST)
	public String deleteEmployeeProcess(final CreateEmployeeForm createEmployeeForm)
	{
		System.out.println("delete " + createEmployeeForm.getEid());
		cybageemployeeFacade.deleteEmployee(createEmployeeForm.getEid());
		return "ShowEmployee";
	}

	@RequestMapping(value = "/updateEmployee", method = RequestMethod.POST)
	public String updateEmployeeProcess(final CreateEmployeeForm createEmployeeForm)
	{
		cybageemployeeFacade.updateEmployee(convert(createEmployeeForm));

		return "ShowEmployee";
	}

	@RequestMapping(value = "/editEmployee", method = RequestMethod.POST)
	public String editEmployeeProcess(final CreateEmployeeForm createEmployeeForm, final Model model)
	{
		final CybageEmployeeDto dto = cybageemployeeFacade.editEmployeeProcess(createEmployeeForm.getEid());
		System.out.println("Edit emp..." + dto.getCybempId());
		model.addAttribute("employee", dto);
		return "UpdateEmployee";
	}

	CybageEmployeeDto convert(final CreateEmployeeForm createEmployeeForm)
	{
		final CybageEmployeeDto cybageEmployeeDto = new CybageEmployeeDto();
		cybageEmployeeDto.setCybempId(createEmployeeForm.getEid());
		cybageEmployeeDto.setFirstName(createEmployeeForm.getFname());
		cybageEmployeeDto.setLastName(createEmployeeForm.getLaname());
		cybageEmployeeDto.setIsManager(createEmployeeForm.isIs_Manager());
		cybageEmployeeDto.setEmpPassword(createEmployeeForm.getEmpPassword());
		cybageEmployeeDto.setManagers(createEmployeeForm.getManager());
		cybageEmployeeDto.setProject(createEmployeeForm.getProject());
		return cybageEmployeeDto;
	}

	@ModelAttribute("CreateEmployeeFormObj")
	CreateEmployeeForm getCreateEmployeeFormObj()
	{
		return new CreateEmployeeForm();
	}

	/*
	 * List<CreateEmployeeForm> Converter(final List<CybageEmployeeDto> sourceList) { final List<CreateEmployeeForm>
	 * desinationList = new ArrayList<>(); final Iterator<CybageEmployeeDto> iterator = sourceList.iterator();
	 *
	 * while (iterator.hasNext()) { final CreateEmployeeForm destination = new CreateEmployeeForm(); final
	 * CybageEmployeeDto source = iterator.next();
	 *
	 * destination.seteId(source.getCybempId()); destination.setFname(source.getFirstName());
	 * destination.setLaname(source.getLastName()); destination.setIs_Manager(source.isIsManager());
	 *
	 * desinationList.add(destination); }
	 *
	 * return desinationList;
	 *
	 * }
	 */

	@ModelAttribute("employeeList")
	List<CybageEmployeeDto> getemployeeList()
	{
		System.out.println("Called..." + cybageemployeeFacade.showEmployee());
		return cybageemployeeFacade.showEmployee();
	}


}
