package edu.uis.security.mnanders;

public class Decipherator {

	public String decipher(String ciphertext) {
		if(ciphertext == null || ciphertext.length() == 0) throw new UnsupportedOperationException("Ciphertext cannot be empty");
		
		int columnLength = 4;
		int rowLength = ciphertext.length() / columnLength;
		char[][] matrix = new char[columnLength][rowLength];
		
		for (int i = 0; i < ciphertext.length(); i++){
			int r = i % columnLength;
			int c = i / columnLength;
			matrix[r][c] = ciphertext.charAt(i);
		}
		
		swapColumns(matrix, 0, 1);
		
		for (char[] row : matrix) {
			System.out.print(row);
		}
		
		
		return ciphertext;
	}

	private void swapColumns(char[][] matrix, int a, int b) {
		char temp;
		for (int i = 0; i < matrix.length; i++) {
			temp = matrix[i][a];
			matrix[i][a] = matrix[i][b];
			matrix[i][b] = temp;
		}
	}

}
