package com.neoxiontechnologies.demo.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 ** @BMN 2021
 **
 **/
public class UserManagmentUtils {
	public static final String GENERAL_REST_URL = "usermanagement";
 
	public static MessageDigest SHA256_HASH;
	static {
		try {
			SHA256_HASH = MessageDigest.getInstance("SHA-256");
		} catch (NoSuchAlgorithmException e) {

			e.printStackTrace();
		}
	}
 
}
