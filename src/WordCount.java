class WordCount {
	public int number_of_words(String content) {
		return content.split("\r\n| ",0).length;
	}

	public int number_of_lines(String content) {
		return content.split("\r\n",0).length;
	}

	public int number_of_chars(String content) {
		return content.split("").length;
	}

	public int number_of_bytes(String content) {
		byte[] cont = content.getBytes();
		return cont.length+1;
	}
}