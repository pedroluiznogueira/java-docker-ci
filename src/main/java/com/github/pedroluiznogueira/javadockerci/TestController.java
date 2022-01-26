package com.github.pedroluiznogueira.javadockerci;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestRepository testRepository;

    @GetMapping
    public String test() {
        return "ANOTHER TEST";
    }

    @GetMapping("/post")
    public TestModel testPost() {
        TestModel testModel = new TestModel("some message");
        return testRepository.save(testModel);
    }
}
