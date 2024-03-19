package testprac;
import org.junit.jupiter.api.*;
import org.junit.*;
public class UnitTest {
	@Test
	public void Test1()
	{
		login obj = new login();
		Assertions.assertEquals(true,obj.isValidEmail("abc@gmail.com"));
		Assertions.assertEquals(true,obj.isValidEmail("abc@yahoo.com"));
		Assertions.assertEquals(true,obj.isValidEmail("preetika123@gmail.com"));
		Assertions.assertEquals(true,obj.isValidEmail("a11111@gmail.com"));
	}
	@Test
	public void Test2()
	{
		login obj = new login();
		Assertions.assertEquals(false,obj.isValidEmail("abcgmail.com"));
		Assertions.assertEquals(false,obj.isValidEmail("abc   @.com"));
		Assertions.assertEquals(false,obj.isValidEmail("1123@.com"));
		Assertions.assertEquals(false,obj.isValidEmail("Preetika@@.com"));
		Assertions.assertEquals(false,obj.isValidEmail("preetikagmail.com"));
		Assertions.assertEquals(false,obj.isValidEmail("abc@gmail"));
		Assertions.assertEquals(false,obj.isValidEmail("@gmail.com"));
		Assertions.assertEquals(false,obj.isValidEmail("abc@gmail."));
		Assertions.assertEquals(false,obj.isValidEmail("Abc..123@example.com"));
		
	}
	@Test
	public void Test3()
	{
		login obj = new login();
		
		Assertions.assertEquals(false,obj.isValidEmail("abc@.com"));
		Assertions.assertEquals(false,obj.isValidEmail("email@111.222.333.44444"));
		Assertions.assertEquals(false,obj.isValidEmail("email@example@example.com"));
		Assertions.assertEquals(false,obj.isValidEmail("Joe Smith <email@example.com>"));
	}
	@Test
	public void Test_validpassword() {
		login obj = new login();
		Assertions.assertEquals(true,obj.isvalidpasswrd("Abbc@6734"));
		Assertions.assertEquals(true,obj.isvalidpasswrd("Preetika@99"));
		Assertions.assertEquals(true,obj.isvalidpasswrd("11Aa$bbv"));
		Assertions.assertEquals(true,obj.isvalidpasswrd("Bbb@1233new"));
	}
	@Test
	public void Test_invalidpassword() {
		login obj = new login();
		Assertions.assertEquals(false,obj.isvalidpasswrd("a"));
		Assertions.assertEquals(false,obj.isvalidpasswrd("name"));
		Assertions.assertEquals(false,obj.isvalidpasswrd("26122002"));
		Assertions.assertEquals(false,obj.isvalidpasswrd("@"));
		Assertions.assertEquals(false,obj.isvalidpasswrd("..1"));
		Assertions.assertEquals(false,obj.isvalidpasswrd("******"));
	}
	@Test
	public void Test_validityofuser() {
		login obj=new login();
		Assertions.assertEquals(true,obj.isvaliduser("Rashi@gmail.com","Rashii@2245"));
		Assertions.assertEquals(true,obj.isvaliduser("Meenakshi", "Minakshi&566"));
	}
}
