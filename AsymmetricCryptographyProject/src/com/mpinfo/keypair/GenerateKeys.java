package com.mpinfo.keypair;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.*;
import java.security.interfaces.*;

public class GenerateKeys {

	

	public static void main(String[] args) throws NoSuchAlgorithmException {
	    KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
	    generator.initialize(512);
	    KeyPair pair = generator.generateKeyPair();
	    RSAPrivateKey privateKey = (RSAPrivateKey) pair.getPrivate();
	    RSAPublicKey publicKey = (RSAPublicKey) pair.getPublic();
	    System.out.println("publicKey exponent:" + publicKey.getPublicExponent());
	    System.out.println("publicKey modules:" + publicKey.getModulus());
	    System.out.println("publicKey format:" + publicKey.getFormat());
	    System.out.println("----------------------------------------------");
	    System.out.println("privateKey exponent:" + privateKey.getPrivateExponent());
	    System.out.println("privateKey modules:" +  privateKey.getModulus());
	    System.out.println("privateKey format:" + privateKey.getFormat());

	}

}