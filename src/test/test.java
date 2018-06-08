import org.junit.Test;

import java.io.*;

/**
 * PACKAGE_NAME
 *
 * @User: ips
 * @Date: 2018/6/7
 */
public class test {

	@Test
	public void io() throws IOException {
		String path = "C:\\Users\\ips\\Desktop\\1.txt";
		File file = new File(path);
		InputStream inputStream = new FileInputStream(file);
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		String a = null;
		while((a=bufferedReader.readLine()) !=null){
			System.out.println(a);
		}


	}

	@Test
	public void reader() throws IOException {
		String path = "C:\\Users\\ips\\Desktop\\1.txt";
		File file = new File(path);
		Reader reader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(reader);
		String a = null;
		while((a=bufferedReader.readLine()) !=null){
			System.out.println(a);
		}


	}
}
