package com.hu.hono.server.config;

import org.springframework.boot.Banner;
import org.springframework.core.env.Environment;

import java.io.PrintStream;

/**
 * @author hlh
 * @version v1.0
 * @title AppBanner
 * @projectName hono
 * @description
 * @date 2022/11/9 9:45
 */
public class AppBanner implements Banner {
    @Override
    public void printBanner(Environment environment, Class<?> sourceClass, PrintStream out) {
        out.println(" (`-').->            <-. (`-')_            \n" +
                " (OO )__       .->      \\( OO) )     .->   \n" +
                ",--. ,'-' (`-')----. ,--./ ,--/ (`-')----. \n" +
                "|  | |  | ( OO).-.  '|   \\ |  | ( OO).-.  '\n" +
                "|  `-'  | ( _) | |  ||  . '|  |)( _) | |  |\n" +
                "|  .-.  |  \\|  |)|  ||  |\\    |  \\|  |)|  |\n" +
                "|  | |  |   '  '-'  '|  | \\   |   '  '-'  '\n" +
                "`--' `--'    `-----' `--'  `--'    `-----'");
    }
}
