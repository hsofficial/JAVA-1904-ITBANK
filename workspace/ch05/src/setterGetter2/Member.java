package setterGetter2;

import java.util.regex.Pattern;

public class Member {
	//ÇÊµå(private)
	private String name, gender;
	private int age;
	
	//»ı¼ºÀÚ(default)
	Member(){}
	Member(String name, int age, String gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		/* ¿µ¾î·Î¸¸ >>> charAt()À¸·Î ±ÛÀÚ¸¦ ÇÏ³ª¾¿ »Ì¾Æ¿Í¼­ -> ASCIIÄÚµå·Î °Ë»ç
		 * ¹®ÀÚ¿­¸¸ °Ë»ç(String)
		 * ^ : ½ÃÀÛ
		 * $ : ~Á¾·á
		 * [] : ÇÑ±ÛÀÚ
		 * [abc] : abcÁß ÇÑ±ÛÀÚ
		 * ? : ¾øÀ½ ¶Ç´Â ÇÑ±ÛÀÚ
		 * * : ¾øÀ½ ¶Ç´Â ¿©·¯±ÛÀÚ
		 * PatternÅ¬·¡½ºÀÇ matches¶ó´Â static¸Ş¼Òµå°¡ ¸Â´ÂÁö °ËÁõ
		 */
		if(Pattern.matches("^[¤¡-¤¾°¡-ÆR]*$", name)) {
			this.name = name;
		}
		else {
			System.out.println("ÀÌ¸§Àº ÇÑ±Û·Î¸¸ µî·Ï°¡´É ÇÕ´Ï´Ù.");
		}
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age >= 0)
			this.age = age;
		else
			System.out.println("Àß¸øµÈ ÀÔ·ÂÀÔ´Ï´Ù.");
	}
	public void info() {
		System.out.printf("ÀÌ¸§ : %s, ³ªÀÌ : %d, ¼ºº° : %s\n",name,age,gender);
	}
}
