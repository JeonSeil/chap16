package chap16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/*
 * File 로부터 스트림 생성하기
 */
public class FileToStreamEx1 {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("src/chap16/RandomToStreamEx1.java");
		Stream<String> st = Files.lines(path,Charset.defaultCharset());
		st.forEach(s->System.out.println(s));
		System.out.println();
		st.close();
		
		BufferedReader br = new BufferedReader(new FileReader(path.toFile()));
		br.lines().forEach(s->System.out.println(s));
		
		System.out.println("폴더의 내용을 스트림으로 생성하기");
		path = Paths.get("src/chap16");
		Stream<Path> st2 = Files.list(path);
		st2.forEach(p->System.out.println(p.getFileName()));
		
	}
}
