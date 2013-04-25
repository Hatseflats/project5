package nl.mprog.apps.evilhangman.test;

import java.util.List;

import nl.mprog.apps.evilhangman.persistence.WordsAssetsHelper;
import junit.framework.TestCase;

public class WordsAssetsHelperTest extends TestCase {
	
	public void testWordLength() {
		WordsAssetsHelper helper = new WordsAssetsHelper(getContext());
		
		List<String> words = helper.wordsByLength(1);
		for (String word : words) {
			assertEquals(word.length(), 1);
		}
	}

}
