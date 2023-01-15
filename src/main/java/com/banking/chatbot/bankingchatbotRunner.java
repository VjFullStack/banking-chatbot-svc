package com.banking.chatbot;

import com.banking.chatbot.configuration.LocalDateConverter;
import com.banking.chatbot.configuration.LocalDateTimeConverter;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import springfox.documentation.oas.annotations.EnableOpenApi;

/**
 * Main entry point for the banking chatbot application.
 *
 * @author Viraj Salokhe
 */
@SpringBootApplication
@EnableOpenApi
@ComponentScan(basePackages = { "com.banking.chatbot"})
public class bankingchatbotRunner implements CommandLineRunner {

    /**
     * Implementation of the {@link CommandLineRunner} interface's run method.
     * If the first command line argument is "exitcode", the application will throw an {@link ExitException}
     * and exit with an exit code of 10.
     *
     * @param arg0 The command line arguments passed to the application.
     * @throws Exception If an exception occurs during execution.
     */
    @Override
    public void run(String... arg0) throws Exception {
        if (arg0.length > 0 && arg0[0].equals("exitcode")) {
            throw new ExitException();
        }
    }

    /**
     * Main method for running the application.
     *
     * @param args The command line arguments passed to the application.
     * @throws Exception If an exception occurs during execution.
     */
    public static void main(String[] args) throws Exception {
        new SpringApplication(bankingchatbotRunner.class).run(args);
    }

    /**
     * Inner class for customizing date formatting in the application.
     */
    @Configuration
    static class CustomDateConfig extends WebMvcConfigurerAdapter {
        /**
         * Adds custom {@link Converter}s for {@link LocalDate} and {@link LocalDateTime}
         * to the given {@link FormatterRegistry}.
         *
         * @param registry The registry to add the converters to.
         */
        @Override
        public void addFormatters(FormatterRegistry registry) {
            registry.addConverter(new LocalDateConverter("yyyy-MM-dd"));
            registry.addConverter(new LocalDateTimeConverter("yyyy-MM-dd'T'HH:mm:ss.SSS"));
        }
    }

    /**
     * Custom runtime exception that can be thrown to exit the application with a specific exit code.
     */
    class ExitException extends RuntimeException implements ExitCodeGenerator {
        private static final long serialVersionUID = 1L;

        /**
         * Returns the exit code for the application when this exception is thrown.
         *
         * @return The exit code for the application.
         */
        @Override
        public int getExitCode() {
            return 10;
        }
    }
}

