package day15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadingAndWritingBytes {

	public static void main(String[] args) {
		String inputfileName = "myfolder/file3.txt";
		String outputfileName = "myfolder/file4.txt";

		try (FileInputStream fis = new FileInputStream(inputfileName);
			 FileOutputStream fos = new FileOutputStream(outputfileName)) {
			int n;
			char och=' ';
			do {
				n = fis.read();
				if (n == -1)
					break;

				char ch = (char) n;
				if (Character.isUpperCase(ch))
					och = Character.toLowerCase(ch);

				else if (Character.isLowerCase(ch))
					och = Character.toUpperCase(ch);

				else if (Character.isSpace(ch))
					och = '@';

				else if (Character.isDigit(ch))
					och = '#';

				fos.write((int)och);
			} while (n != -1);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

		System.out.println("Data Written to File");

	}

}
