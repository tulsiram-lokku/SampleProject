import java.io.IOException;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;


public class JarFileExample {
	
	public static void main(String[] args) {
		JarFile file = null;
		try {
			file = new JarFile("D:/IHG/IHG Workspace1/greenengage-web/src/main/webapp/WEB-INF/lib/commons-lang-2.5.jar");
			for (Enumeration<JarEntry> enum1 = file.entries(); enum1.hasMoreElements();) {   
			    JarEntry entry = enum1.nextElement();   
			    System.out.println(entry.getName());
			}
		}   
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
