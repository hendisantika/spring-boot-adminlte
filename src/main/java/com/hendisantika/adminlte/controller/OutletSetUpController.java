package com.hendisantika.adminlte.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hendisantika.adminlte.model.OutletSetUp;
import com.hendisantika.adminlte.service.OutletSetUpService;

@Controller
public class OutletSetUpController {
	
	@Autowired
	private OutletSetUpService outletSetupService;
	
	//save 60 rows to db
	@RequestMapping(value="/save-outlet")
	public String save(){
		for(int i=1;i<=60;i++){
		OutletSetUp outlets=new OutletSetUp("Outlet "+i,"Yangon", "0977"+i+"6372", "No deleted",
				10+i);
		outletSetupService.save(outlets);
		}
		return "save!!";
	}
    
    @RequestMapping(value = "/outlet")
    public String index() {
        return "redirect:/outlets/1";
    }

    //paging
    @RequestMapping(value = "/outlets/{pageNumber}", method = RequestMethod.GET)
    public String list(@PathVariable Integer pageNumber, Model model) {
        Page<OutletSetUp> page = outletSetupService.getList(pageNumber);

        int current = page.getNumber() + 1;
        int begin = Math.max(1, current - 5);
        int end = Math.min(begin + 10, page.getTotalPages());

        model.addAttribute("list", page);
        model.addAttribute("beginIndex", begin);
        model.addAttribute("endIndex", end);
        model.addAttribute("currentIndex", current);
        return "customers/list";

    }
    
    
    @RequestMapping(value = "/hha/delete/{id}", method = RequestMethod.GET)
    public String delete(@PathVariable Long id,Model model) {
       outletSetupService.deleteOutlet(id);
       return "redirect:/outlets/1";
 
    }
	
	

    
    

    
    
    
    
    

	

}
