package com.wixdom.hello;

import com.wixdom.config.SampleService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Henry Lin badcop@163.com
 */
@RestController
@RequestMapping("api/")
public class HelloResource {

    private SampleService sampleService;

    public HelloResource(SampleService sampleService) {
        this.sampleService = sampleService;
    }

    @GetMapping("/hello")
    String hello() {
        return sampleService.sayHello();
    }
}
