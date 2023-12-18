package basic;
import java.io.File;
public class FileException {
	public static void main(String[] args) {
    try {
	File f = new File("e:file.txt");
	if(f.createNewFile()){
		System.out.println("File "+f.getName() +" ");
	}else {
		System.out.println("File already exist "+f.toString());
	}
	catch (IOException e) {
		System.out.println(e);
	}
    }