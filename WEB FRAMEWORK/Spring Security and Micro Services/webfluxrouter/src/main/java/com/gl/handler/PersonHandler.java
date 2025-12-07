package com.gl.handler;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.gl.model.Person;
import com.gl.repository.PersonRepository;

import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.server.ServerResponse.*;

@Component
public class PersonHandler {

    private final PersonRepository personRepository;

    public PersonHandler(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    // GET /persons/{id}
    public Mono<ServerResponse> getPerson(ServerRequest request) {
        String id = request.pathVariable("id");

        return personRepository.findById(id)
                .flatMap(person -> ok().bodyValue(person))
                .switchIfEmpty(notFound().build());
    }

    // GET /persons
    public Mono<ServerResponse> getAllPersons(ServerRequest request) {
        return ok().body(personRepository.findAll(), Person.class);
    }

    // POST /persons
    public Mono<ServerResponse> createPerson(ServerRequest request) {
        return request.bodyToMono(Person.class)
                .flatMap(personRepository::save)
                .flatMap(saved ->
                        created(request.uri())
                        .bodyValue(saved)
                );
    }

    // PUT /persons/{id}
    public Mono<ServerResponse> updatePerson(ServerRequest request) {
        String id = request.pathVariable("id");

        return request.bodyToMono(Person.class)
                .map(person -> new Person(id, person.getName()))
                .flatMap(updated ->
                        personRepository.update(id, updated)
                                .flatMap(p -> ok().bodyValue(p))
                )
                .switchIfEmpty(notFound().build());
    }

    // DELETE /persons/{id}
    public Mono<ServerResponse> deletePerson(ServerRequest request) {
        String id = request.pathVariable("id");

        return personRepository.delete(id)
                .flatMap(deleted -> {
                    if (deleted) return noContent().build();
                    return notFound().build();
                });
    }
}
