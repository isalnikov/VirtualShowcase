/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isalnikov.virtualshowcase.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.isalnikov.virtualshowcase.controller", "com.isalnikov.virtualshowcase.service"})
public class VirtualShowcaseApp {

    public static void main(String[] args) {
        SpringApplication.run(VirtualShowcaseApp.class, args);
    }
}
