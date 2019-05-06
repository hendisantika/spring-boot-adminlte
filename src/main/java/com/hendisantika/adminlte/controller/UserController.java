package com.hendisantika.adminlte.controller;

import com.hendisantika.adminlte.model.User;

import com.hendisantika.adminlte.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class UserController {

	private UserService userService;

	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping(value = "/users")
	public String index() {
		return "redirect:/users/1";
	}

	@RequestMapping(value = "/users/{pageNumber}", method = RequestMethod.GET)
	public String list(@PathVariable Integer pageNumber, Model model) {

		Page<User> page = userService.getList(pageNumber);
		int current = page.getNumber() + 1;
		int begin = Math.max(1, current - 5);
		int end = Math.min(begin + 10, page.getTotalPages());

		model.addAttribute("list", page);
		model.addAttribute("beginIndex", begin);
		model.addAttribute("endIndex", end);
		model.addAttribute("currentIndex", current);

		return "users/list";

	}

	@RequestMapping("/users/add")
	public String add(Model model) {

		model.addAttribute("user", new User());
		return "users/form";

	}

	@RequestMapping("/users/edit/{id}")
	public String edit(@PathVariable Long id, Model model) {

		model.addAttribute("user", userService.get(id));
		return "users/form";

	}

	@RequestMapping(value = "/users/save", method = RequestMethod.POST)
	public String save(User user, final RedirectAttributes ra) {

		User save = userService.save(user);
		ra.addFlashAttribute("successFlash", "Cliente foi salvo com sucesso.");
		return "redirect:/users";

	}

	@RequestMapping("/users/delete/{id}")
	public String delete(@PathVariable Long id) {

		userService.delete(id);
		return "redirect:/users";

	}

}
