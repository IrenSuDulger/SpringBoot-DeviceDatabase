package com.database.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.database.Model.Phone;
import com.database.Service.PhoneService;
//creating RestController
@RestController

public class PhoneController {
    @Autowired
    PhoneService phoneService;
    //creating a get mapping that retrieves all the students detail from the database
    @GetMapping("/phone")
    private List<Phone> getAllPhone()
    {
        return phoneService.getAllPhone();
    }
    //creating a get mapping that retrieves the detail of a specific device
    @GetMapping("/phone/{id}")
    private Phone getPhone(@PathVariable("id") int id)
    {
        return phoneService.getPhoneById(id);
    }
    //creating a delete mapping that deletes a specific device
    @DeleteMapping("/phone/{id}")
    private void deletePhone(@PathVariable("id") int id)
    {
        phoneService.delete(id);
    }
    //creating post mapping that post the student detail in the device
    @PostMapping("/phone")
    private int savePhone(@RequestBody Phone phone)
    {
        phoneService.saveOrUpdate(phone);
        return phone.getId();
    }

}
