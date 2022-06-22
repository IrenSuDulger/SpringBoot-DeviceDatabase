package com.database.Service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.database.Model.Phone;
import com.database.Repository.PhoneRepository;
@Service
public class PhoneService {
    @Autowired
    PhoneRepository phoneRepository;
    //getting all phone information
    public List<Phone> getAllPhone()
    {
        List<Phone> phones = new ArrayList<Phone>();
        phoneRepository.findAll().forEach(phone -> phones.add(phone));
        return phones;
    }

    public Phone getPhoneById(int id)
    {
        return phoneRepository.findById(id).get();
    }
    public void saveOrUpdate(Phone phone)
    {
        phoneRepository.save(phone);
    }
    //deleting a specific record
    public void delete(int id)
    {
        phoneRepository.deleteById(id);
    }
}
