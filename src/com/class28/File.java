package com.class28;

public abstract class File {

	/*
	 * Create a class File that will have the following behaviors: open, edit,
	 * close. Edit and close are implemented method while open is an abstract.
	 * Create 3 subclasses: JavaFile, WordFile, PDFFile that will provide specific
	 * implementation of open behaviour: Exmaple: to open .java file we need
	 * notepad++ or sublime tex, to open .doc file we need Microsoft word to be
	 * installed
	 */
	
	void open() {
		
	}
	
	public abstract void edit();
	public abstract void close();
}
