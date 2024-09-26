package decorator_pattern.io;

import java.io.*;

public class InputTest {
	public static void main(String... strings) {
		
		String path = System.getProperty("user.dir") + 
				"/src/decorator_pattern/io/input.txt";
		
		int c;
		InputStream in = null; // component

		try {
			in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream(path)));
			while ((c = in.read()) >= 0) {
				System.out.print((char) c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		System.out.println();
		
		try (InputStream in2 = new LowerCaseInputStream(
				new BufferedInputStream(
						new FileInputStream(path)))){
			while ((c = in2.read()) >= 0) {
				System.out.print((char)c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
