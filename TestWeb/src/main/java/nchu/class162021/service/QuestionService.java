package nchu.class162021.service;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class QuestionService {

	public List<String> RequestQuestion() throws IOException {
		
		File file = new File("E:\\work\\question.txt");
		FileInputStream fis = new FileInputStream(file);
		DataInputStream dis = new DataInputStream(fis);
		BufferedReader d  = new BufferedReader(new InputStreamReader(fis));
		List<String> list = new ArrayList<String>();
		
		String str;
		while((str = d.readLine())!=null) {
			list.add(str);
		}
		return list;
	}
	
	public List<String> RequestAnswer() throws IOException {
		
		File file = new File("E:\\work\\answer.txt");
		FileInputStream fis = new FileInputStream(file);
		DataInputStream dis = new DataInputStream(fis);
		BufferedReader d  = new BufferedReader(new InputStreamReader(fis));
		List<String> list = new ArrayList<String>();
		
		String str;
		while((str = d.readLine())!=null) {
			list.add(str);
		}
		return list;
	}
	
}
