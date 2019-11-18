package mocks.crud.task.service;

import mocks.crud.task.model.Address;
import mocks.crud.task.model.Person;
import mocks.crud.task.repository.AdvancedRepository;
import mocks.crud.task.repository.CrudRepository;

import java.util.*;

public class PersonService implements AdvancedRepository {

    private AddressService addressService;

    private CrudRepository<Long, Person> personRepository;

    private Map<Long, Person> persons = new HashMap<>();

    public PersonService(AddressService addressService) {
        this.addressService = addressService;
    }

    @Override
    public List<Person> findAllRelatives(Person person) {
        //todo написать реализацию
        return person.getRelatives();
    }

    @Override
    public Address getAddress(Person person) {
        //todo написать реализацию
        return person.getAddress();
    }

    public void save(Person element) {
        //todo написать реализацию
        persons.put(element.getId(), element);
    }

    public Person findById(Long id) {
        //todo написать реализацию
        return persons.getOrDefault(id, null);
    }

    public List<Person> findAll() {
        //todo написать реализацию
        return new ArrayList<>(persons.values());
    }

    public Person update(Person element) {
        //todo написать реализацию
        persons.put(element.getId(), element);
        return element;
    }

    public void delete(Person element) {
        //todo написать реализацию
        persons.remove(element.getId());
    }
}
