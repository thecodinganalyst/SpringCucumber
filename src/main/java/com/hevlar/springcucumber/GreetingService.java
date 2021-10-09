package com.hevlar.springcucumber;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GreetingService {
    private final GreetingRepository greetingRepository;

    public String greet(String name){
        return "Hello, " +
                ((name == null || name.isBlank()) ? "World" : name);
    }

    public Greeting saveGreeting(Greeting greeting){
        return greetingRepository.save(greeting);
    }

    public List<Greeting> findGreeting(String name){
        return greetingRepository.findByName(name);
    }
}
