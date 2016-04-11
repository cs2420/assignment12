package assignment12;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

public class HuffmanTreeTest {
	
	   
	

	@Test
	public void test() {
		int one = '1';
		  
		  System.out.println(one);
		 HuffmanTree t = new HuffmanTree();

		    t.compressFile(new File("test.txt"), new File("result"));
		    
		    t.huffmanToDot("huffman_tree.dot");
		    
		    

	    
		fail("Not yet implemented");
	}

}
