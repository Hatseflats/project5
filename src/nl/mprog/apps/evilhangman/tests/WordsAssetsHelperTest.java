package nl.mprog.apps.evilhangman.tests;

import java.util.List;

import nl.mprog.apps.evilhangman.persistence.WordsAssetsHelper;
import android.test.AndroidTestCase;

public class WordsAssetsHelperTest extends AndroidTestCase {
	
	public void testWordLength() {
		WordsAssetsHelper helper = new WordsAssetsHelper(getContext());
		
		List<String> words = helper.wordsByLength(1);
		for (String word : words) {
			assertEquals(word.length(), 1);
		}
	}

}
