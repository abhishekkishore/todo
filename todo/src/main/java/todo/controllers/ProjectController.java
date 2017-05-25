package todo.controllers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import todo.dto.ProjectDto;
import todo.dto.ProjectDtoList;
import todo.services.ProjectService;

@Controller
@ResponseBody
@RequestMapping("/projects")
public class ProjectController {
	
	@Resource
	private ProjectService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public ProjectDtoList getProjects() {
		return service.getProjects();
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ProjectDto createProject(@RequestBody ProjectDto dto) {
		return service.createProject(dto);
	}
}
