package com.bdd.MvCucPro;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(format={"pretty","html:target/html/","json:target/json/output.json"},features="src/test/resource")
public class RunnerTest {

}
