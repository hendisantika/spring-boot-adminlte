package com.hendisantika.adminlte.controller;

import com.hendisantika.adminlte.model.Customers;
import com.hendisantika.adminlte.service.CustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("customers")
public class CustomerController {

    private CustomersService customerService;

    @Autowired
    public void setCustomerService(CustomersService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public String index() {
        return "redirect:/customers/1";
    }

    @GetMapping(value = "/{pageNumber}")
    public String list(@PathVariable Integer pageNumber, Model model) {
        Page<Customers> page = customerService.getList(pageNumber);

        int current = page.getNumber() + 1;
        int begin = Math.max(1, current - 5);
        int end = Math.min(begin + 10, page.getTotalPages());

        model.addAttribute("list", page);
        model.addAttribute("beginIndex", begin);
        model.addAttribute("endIndex", end);
        model.addAttribute("currentIndex", current);

        return "customers/list";

    }

    @GetMapping("/add")
    public String add(Model model) {

        model.addAttribute("customer", new Customers());
        return "customers/form";

    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {

        model.addAttribute("customer", customerService.get(id));
        return "customers/form";

    }

    @PostMapping(value = "/save")
    public String save(Customers customer, final RedirectAttributes ra) {

        Customers save = customerService.save(customer);
        ra.addFlashAttribute("successFlash", "Cliente foi salvo com sucesso.");
        return "redirect:/customers";

    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {

        customerService.delete(id);
        return "redirect:/customers";

    }

}
