package edu.uis.security.mnanders;

import static org.junit.Assert.*;

import org.junit.Test;

public class DecipheratorTest {

	@Test
	public void test() {
//		String ciphertext = "owoktnweityotasuhbtekorhx";
		String ciphertext = "eprzdiedchey";
		Decipherator d = new Decipherator();
		
		String plaintext = d.decipher(ciphertext);
		assertEquals("deciphered", plaintext);
	}

}
