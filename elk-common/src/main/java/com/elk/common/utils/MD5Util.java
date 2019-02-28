package com.elk.common.utils;

import java.security.MessageDigest;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;


public class MD5Util {
	
	
	public static void main(String[] args) {
		
		
		String password="admins";
		int count=10;
		String name="admin";
		
		String shiroMD5 = shiroMD5(password, count, name);
		System.out.println(shiroMD5);
		
	}
	
	
	
	/**
	 * md5 加密
	 * @param password count加密次数
	 * @param name 盐
	 * @return
	 */
	public static String shiroMD5(String password,Integer count,String name){
		Object salt = ByteSource.Util.bytes(name);
		SimpleHash simpleHash = new SimpleHash("MD5",password,salt,count);
	
		return simpleHash.toString();
	}
	
	
	public static String digest16(String inStr) {
		return digest(inStr, 16);
	}

	public static String digest(String inStr) {
		return digest(inStr, 32);
	}

	private static String digest(String inStr, int rang) {
		MessageDigest md5 = null;
		if (StringUtil.isEmpty(inStr)) {
			return "";
		}

		try {
			md5 = MessageDigest.getInstance("MD5");
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}

		char[] charArray = inStr.toCharArray();
		byte[] byteArray = new byte[charArray.length];

		for (int i = 0; i < charArray.length; i++) {
			byteArray[i] = (byte) charArray[i];
		}

		byte[] md5Bytes = md5.digest(byteArray);

		StringBuilder hexValue = new StringBuilder();

		for (int i = 0; i < md5Bytes.length; i++) {
			int val = ((int) md5Bytes[i]) & 0xff;
			if (val < 16)
				hexValue.append("0");
			hexValue.append(Integer.toHexString(val));
		}
		if (rang == 32) {
			return hexValue.toString();
		} else {
			return hexValue.toString().substring(8, 24);
		}
	}
 
}
