package com.lab.websec.backend.security.util;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Base64;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.print.attribute.standard.Severity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class PasswordUtil implements PasswordEncoder {

	private static final Logger logger = LoggerFactory.getLogger(PasswordUtil.class);
	
	@Value("${happypet.app.salt}")
	private byte[] salt;

	@Override
	public String encode(CharSequence rawPassword) {

		PBEKeySpec pbeKeySpec = new PBEKeySpec(rawPassword.toString().toCharArray(), salt, 10, 512);
		SecretKeyFactory skf = null;
		byte[] hash = null;
		try {
			skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA512");
			hash = skf.generateSecret(pbeKeySpec).getEncoded();
		} catch (NoSuchAlgorithmException e) {
			logger.info(null, e.getStackTrace(), Severity.ERROR);
		} catch (InvalidKeySpecException e1) {
			logger.info(null, e1.getStackTrace(), Severity.ERROR);
		}
		return Base64.getMimeEncoder().encodeToString(hash);
	}

	@Override
	public boolean matches(CharSequence rawPassword, String encodedPassword) {
		PBEKeySpec pbeKeySpec = new PBEKeySpec(rawPassword.toString().toCharArray(), salt, 10, 512);
		byte[] hash = null;
		try {
			SecretKeyFactory skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA512");
			hash = skf.generateSecret(pbeKeySpec).getEncoded();
		} catch (NoSuchAlgorithmException e) {
			logger.info(null, e.getStackTrace(), Severity.ERROR);
		} catch (InvalidKeySpecException e1) {
			logger.info(null, e1.getStackTrace(), Severity.ERROR);
		}
		String enteredPasswordHash = Base64.getMimeEncoder().encodeToString(hash);
		return enteredPasswordHash.equals(encodedPassword);
	}
}
