package chapter8;

import java.io.File;

public class Ex8_10 {

	public static void main(String[] args) {
		try {
			File f = creatFile(args[0]);
			System.out.println(f.getName()+"����");
		} catch (Exception e) {
			System.out.println(e.getMessage()+"��õ��ʿ�");
		}
	}
	
	// import�ʿ�
	static File creatFile(String fileName) throws Exception {
		if (fileName==null || fileName.equals(""))
			throw new Exception("�����̸� ����");
		
		File f = new File(fileName);
		f.createNewFile();
		return f;
	}
}
