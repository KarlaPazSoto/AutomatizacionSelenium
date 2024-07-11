package com.example;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/feature", // Ruta de tus archivos de características
        glue = "step", // Paquete donde se encuentran tus definiciones de pasos
        tags = "@smoke" // Etiquetas para ejecutar escenarios específicos

)
public class TestRunner {
}
