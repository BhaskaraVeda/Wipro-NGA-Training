package com.gl.repository;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Repository;

import com.gl.model.Person;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public class PersonRepository {

    private final Map<String, Person> personMap = new ConcurrentHashMap<>();

    public Mono<Person> findById(String id) {
        return Mono.justOrEmpty(personMap.get(id));
    }

    public Flux<Person> findAll() {
        return Flux.fromIterable(personMap.values());
    }

    public Mono<Person> save(Person person) {
        personMap.put(person.getId(), person);
        return Mono.just(person);
    }

    public Mono<Person> update(String id, Person person) {
        return Mono.justOrEmpty(personMap.computeIfPresent(id, (k, v) -> person));
    }

    public Mono<Boolean> delete(String id) {
        return Mono.justOrEmpty(personMap.remove(id))
                   .map(p -> true)
                   .defaultIfEmpty(false);
    }
}
