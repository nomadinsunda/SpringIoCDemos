package com.intheeast.ioc.additionalcapabilitiesoftheapplicationcontext.asynchronouslisteners.event;

import org.springframework.core.ResolvableType;

import com.intheeast.ioc.additionalcapabilitiesoftheapplicationcontext.asynchronouslisteners.model.Person;

public class PersonCreatedEvent extends EntityCreatedEvent<Person> {
    public PersonCreatedEvent(Person person) {
        super(person);
    }

    @Override
    public ResolvableType getResolvableType() {
        return ResolvableType.forClassWithGenerics(EntityCreatedEvent.class, Person.class);
    }
}