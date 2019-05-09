package com.hendisantika.adminlte.controller;

import com.hendisantika.adminlte.model.Role;

import com.hendisantika.adminlte.service.RoleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class RoleController {

	private RoleService roleService;

	@Autowired
	public void setRoleService(RoleService roleService) {
		this.roleService = roleService;
	}

	@RequestMapping(value = "/roles")
	public String index() {
		return "redirect:/roles/1";
	}

	@RequestMapping(value = "/roles/{pageNumber}", method = RequestMethod.GET)
	public String list(@PathVariable Integer pageNumber, Model model) {
		System.out.println("Page number "+pageNumber);
		Page<Role> page = roleService.getList(pageNumber);
		int current = page.getNumber() + 1;
		int begin = Math.max(1, current - 5);
		int end = Math.min(begin + 10, page.getTotalPages());

		model.addAttribute("list", page);
		model.addAttribute("beginIndex", begin);
		model.addAttribute("endIndex", end);
		model.addAttribute("currentIndex", current);

		return "roles/list";

	}

	@RequestMapping("/roles/add")
	public String add(Model model) {

		model.addAttribute("role", new Role());
		return "roles/form";

	}

	@RequestMapping("/roles/edit/{id}")
	public String edit(@PathVariable Long id, Model model) {

		model.addAttribute("role", roleService.get(id));
		return "roles/form";

	}

	@RequestMapping(value = "/roles/save", method = RequestMethod.POST)
	public String save(Role role, final RedirectAttributes ra) {

		Role save = roleService.save(role);
		ra.addFlashAttribute("successFlash", "Cliente foi salvo com sucesso.");
		return "redirect:/roles";

	}

	@RequestMapping("/roles/delete/{id}")
	public String delete(@PathVariable Long id) {

		roleService.delete(id);
		return "redirect:/roles";

	}

}
