import sqlite3
import plistlib

conn = sqlite3.connect('words.sqlite3')
c = conn.cursor();

for word in plistlib.readPlist("words.plist"):
	query = "INSERT INTO words (word, length) VALUES ('%s',%d)" % (word.lower(), len(word));
	c.execute(query)

conn.commit()
conn.close()