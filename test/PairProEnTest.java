import static org.junit.Assert.*;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

public class PairProEnTest {

	@Test
	public void /*������������*/one() {
		IntoToEng en = new IntoToEng();
		String expected = "one";
		String actual = en.translateEng(1);
		assertThat(actual,is(expected));
	}
	
	@Test
	public void /*���������������*/ten() {
		IntoToEng en = new IntoToEng();
		String expected = "ten";
		String actual = en.translateEng(10);
		assertThat(actual,is(expected));
	}
	
	@Test
	public void /*������������������*/twenty() {
		IntoToEng en = new IntoToEng();
		String expected = "twenty";
		String actual = en.translateEng(20);
		assertThat(actual,is(expected));
	}
	
	@Test
	public void /*���������������������*/twenty_three() {
		IntoToEng en = new IntoToEng();
		String expected = "twenty three";
		String actual = en.translateEng(23);
		assertThat(actual,is(expected));
	}
	
	@Test
	public void /*���������������������*/twenty_three2() {
		IntoToEng en = new IntoToEng();
		String expected = "thirty";
		String actual = en.translateEng(30);
		assertThat(actual,is(expected));
	}
	
	@Test
	public void /*������������������������*/fifty_eight() {
		IntoToEng en = new IntoToEng();
		String expected = "fifty eight";
		String actual = en.translateEng(58);
		assertThat(actual,is(expected));
	}
	
	@Test
	public void /*���������������������������������*/ninety_nine() {
		IntoToEng en = new IntoToEng();
		String expected = "ninety nine";
		String actual = en.translateEng(99);
		assertThat(actual,is(expected));
	}
	
	@Test
	public void /*���������������*/one_hunderd() {
		IntoToEng en = new IntoToEng();
		String expected = "one hundred";
		String actual = en.translateEng(100);
		assertThat(actual,is(expected));
	}
	
	@Test
	public void /*������������������������������*/nine_hundred13() {
		IntoToEng en = new IntoToEng();
		String expected = "nine hundred thirteen";
		String actual = en.translateEng(913);
		assertThat(actual,is(expected));
	}
	
	@Test
	public void /*���������������������������*/thou() {
		IntoToEng en = new IntoToEng();
		String expected = "one thousand twenty nine";
		String actual = en.translateEng(1029);
		assertThat(actual,is(expected));
	}
	@Test
	public void /*���������������������*/ninenine() {
		IntoToEng en = new IntoToEng();
		String expected = "nine thousand nine hundred ninety nine";
		String actual = en.translateEng(9999);
		assertThat(actual,is(expected));
	}
	@Test
	public void /*������*/tenthou() {
		IntoToEng en = new IntoToEng();
		String expected = "ten thousand";
		String actual = en.translateEng(10000);
		assertThat(actual,is(expected));
	}
}