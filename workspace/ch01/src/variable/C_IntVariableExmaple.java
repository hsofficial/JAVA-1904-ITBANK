package variable;

public class C_IntVariableExmaple {
	public static void main(String[] args) {
		int var1 = 10; //10����
		int var2 = 012;//8����
		int var3 = 0xA;//16����
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		
		System.out.printf("%d, %o, %x\n",var1,var2,var3);
		System.out.printf("%d, %#o, %#x\n",var1,var2,var3);
	}

}
