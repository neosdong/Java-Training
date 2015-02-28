import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;


public class MainClass {
	public static void main(String[] args) throws IOException {
		String filename = "raf.dat";
		String mode = "rw";
        RandomAccessFile randomAccessFile = new RandomAccessFile(filename, mode);
		for (int i = 0; i < 10; i++) {
			randomAccessFile.writeDouble(i*1.1);
		}
		randomAccessFile.close();
		
		randomAccessFile = new RandomAccessFile(filename, mode);
		//直接将文件指针指向
		randomAccessFile.seek(5*8);
		randomAccessFile.writeDouble(47.01);
		randomAccessFile.close();
		
		randomAccessFile = new RandomAccessFile(filename, mode);
		for (int i = 0; i < 10; i++) {
			System.out.println("Value "+i+":"+randomAccessFile.readDouble());
		}
		randomAccessFile.close();
	}

}
