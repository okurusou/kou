package chapter8;

import java.io.File;

public class Ex8_10 {

	public static void main(String[] args) {
		try {
			File f = creatFile(args[0]);
			System.out.println(f.getName()+"성공");
		} catch (Exception e) {
			System.out.println(e.getMessage()+"재시도필요");
		}
	}
	
	// import필요
	static File creatFile(String fileName) throws Exception {
		if (fileName==null || fileName.equals(""))
			throw new Exception("파일이름 오류");
		
		File f = new File(fileName);
		f.createNewFile();
		return f;
	}
}
