package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Helper {
public static  Properties readProfile(String path ) throws IOException {
	FileInputStream f = new FileInputStream(new File(path));
	Properties p = new Properties();
	p.load(f);
	return p;
	
}
}
