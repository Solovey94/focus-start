package mocks.crud.task.service;

import mocks.crud.task.model.Address;
import mocks.crud.task.repository.CrudRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddressService implements CrudRepository<Long, Address> {

    private Map<Long,Address> address = new HashMap<>();

    @Override
    public void save(Address element) {
        //todo написать реализацию
        address.put(element.getId(), element);
    }

    @Override
    public Address findById(Long id) {
        //todo написать реализацию
        return address.getOrDefault(id, null);
    }

    @Override
    public List<Address> findAll() {
        //todo написать реализацию
        return new ArrayList<>(address.values());
    }

    @Override
    public Address update(Address element) {
        //todo написать реализацию
        address.put(element.getId(),element);
        return element;
    }

    @Override
    public void delete(Address element) {
        //todo написать реализацию
        address.remove(element.getId());
    }
}
