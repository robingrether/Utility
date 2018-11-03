package de.robingrether.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilTest {
	
	@Test
	public void testContains() {
		Assertions.assertFalse(StringUtil.contains("abc"));
		Assertions.assertTrue(StringUtil.contains("abc", "a", "b", "c"));
		Assertions.assertFalse(StringUtil.contains("abc", "d", "e", "f"));
		Assertions.assertFalse(StringUtil.contains("", "a", "b", "c"));
		Assertions.assertTrue(StringUtil.contains("", "a", "b", ""));
	}
	
	@Test
	public void testCapitalize() {
		Assertions.assertEquals(StringUtil.capitalize(""), "");
		Assertions.assertEquals(StringUtil.capitalize("Hello World!"), "Hello World!");
		Assertions.assertEquals(StringUtil.capitalize("hello world!"), "Hello World!");
		Assertions.assertEquals(StringUtil.capitalize("This is a STRING!"), "This Is A STRING!");
	}
	
	@Test
	public void testCapitalizeFully() {
		Assertions.assertEquals(StringUtil.capitalizeFully(""), "");
		Assertions.assertEquals(StringUtil.capitalizeFully("Hello World!"), "Hello World!");
		Assertions.assertEquals(StringUtil.capitalizeFully("hello world!"), "Hello World!");
		Assertions.assertEquals(StringUtil.capitalizeFully("HELLO WORLD!"), "Hello World!");
		Assertions.assertEquals(StringUtil.capitalizeFully("This is a STRING!"), "This Is A String!");
	}
	
	@Test
	public void testBytesToHex() {
		Assertions.assertEquals(StringUtil.bytesToHex(new byte[0]), "");
		Assertions.assertEquals(StringUtil.bytesToHex(new byte[] {0x00}), "00");
		Assertions.assertEquals(StringUtil.bytesToHex(new byte[] {(byte)0xff, (byte)0xaa, 0x73}), "ffaa73");
		Assertions.assertEquals(StringUtil.bytesToHex(new byte[] {0x27, 0x33, 0x01, (byte)0xf1, (byte)0xc7}), "273301f1c7");
	}
	
}