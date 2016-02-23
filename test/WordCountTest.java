import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.io.FileNotFoundException;
import java.io.IOException;

public class WordCountTest {


	@Test
	public void count_total_words_present_in_a_sentance() {
		WordCount wc = new WordCount();
		int totalWords = wc.number_of_words("this is a paragraph to test for lines count 官話/官话");
		assertEquals(totalWords, 10);
	}

	@Test
	public void count_total_lines_present_in_a_sentence() {
		WordCount wc = new WordCount();
		int totalLines = wc.number_of_lines("this is a paragraph\r\nto test for\r\nlines count");
		assertEquals(totalLines,3);
	}

	@Test
	public void count_total_characters_present_in_a_sentence() {
		WordCount wc = new WordCount();
		int totalChars = wc.number_of_chars("this is a paragraph to test for lines count 官話/官话");
		assertEquals(totalChars,50);
	}	

	@Test
	public void count_total_bytes_consists_of_a_sentence() {
		WordCount wc = new WordCount();
		int totalBytes = wc.number_of_bytes("this is a paragraph to test for lines count");
		assertEquals(totalBytes,44);
	}

	@Test
	public void count_total_bytes_consists_of_a_sentence_consists_some_chinese_words() {
		WordCount wc = new WordCount();
		int totalBytes = wc.number_of_bytes("this is a paragraph to test for lines count 官話/官话");
		assertEquals(totalBytes,58);
	}

	@Test
	public void count_total_bytes_consists_of_a_japanese_word() {
		WordCount wc = new WordCount();
		int totalBytes = wc.number_of_bytes("日本語");
		assertEquals(totalBytes, 10);
	}

}