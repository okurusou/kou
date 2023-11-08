package seven;

public class Ex7_14 {
	private int outerIv = 0;
	static int outerCv = 0;
	
	class instanceinner{
		int iiv = outerIv;
		int iiv2 = outerCv;
	}
	
	static class StaticInner{
//		int siv = outerIv;
		static int scv = outerCv;
	}
	
	void myMethod() {
		int lv = 0;
		final int LV = 0;
		
		class LocalInner{
			int liv = outerIv;
			int liv2 = outerCv;
			int liv3 = lv;  // jdk1.8이후이므로 정상
			int liv4= LV;
		}
	}
}
