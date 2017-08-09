package com.hendisantika.adminlte.controller;

import com.hendisantika.adminlte.model.Customers;
import com.hendisantika.adminlte.service.CustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CustomerController {

    private CustomersService customerService;

    @Autowired
    public void setCustomerService(CustomersService customerService) {
        this.customerService = customerService;
    }

    @RequestMapping(value = "/customers")
    public String index() {
        return "redirect:/customers/1";
    }

    @RequestMapping(value = "/customers/{pageNumber}", method = RequestMethod.GET)
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

    @RequestMapping("/customers/add")
    public String add(Model model) {

        model.addAttribute("customer", new Customers());
        return "customers/form";

    }

    @RequestMapping("/customers/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {

        model.addAttribute("customer", customerService.get(id));
        return "customers/form";

    }

    @RequestMapping(value = "/customers/save", method = RequestMethod.POST)
    public String save(Customers customer, final RedirectAttributes ra) {

        Customers save = customerService.save(customer);
        ra.addFlashAttribute("successFlash", "Cliente foi salvo com sucesso.");
        return "redirect:/customers";

    }

    @RequestMapping("/customers/delete/{id}")
    public String delete(@PathVariable Long id) {

        customerService.delete(id);
        return "redirect:/customers";

    }

}
