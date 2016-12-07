/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isalnikov.virtualshowcase.util;

public class RandomNumberGenerator {

    public static Long generate() {
        return DateUtil.getCurrentDateInIST().getTime();
    }
}
