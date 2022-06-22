package com.database.Repository;
import org.springframework.data.repository.CrudRepository;
import com.database.Model.Phone;
public interface PhoneRepository  extends CrudRepository<Phone, Integer>{
}
