package com.shinhan.day14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileController {
	
	public static void main(String[] args) throws Exception {
		//String path = FileController.class.getResource("input2.txt").getFile();
		String path = "src/com/shinhan/day14/input2.txt";
		new FileController().addCalculateResult(path);
	}
	
	void addCalculateResult(String inputFileName) throws Exception{
		 
		FileReader fr = new FileReader(inputFileName);
		BufferedReader br = new BufferedReader(fr);
		String line;
		int sum = 0;
		List<String> dataList = new ArrayList<>();
		while((line = br.readLine())!=null) {
			sum = sum + Integer.parseInt(line);
			dataList.add(line);
			System.out.println(dataList);
		}
		dataList.add(sum+"");
		br.close();
		fr.close();
		
		System.out.println(dataList);
		
		FileWriter fw = new FileWriter(inputFileName);
		BufferedWriter bw = new BufferedWriter(fw);

		dataList.stream().forEach(data->{
			try {
				bw.write(data);
				bw.newLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}); 

		bw.close();
		fw.close();
		
	}

	
	public static void f_1() throws IOException {
	 
		 
		String inputFileName = "src/com/shinhan/day14/input.txt";
		String outputFileName = "src/com/shinhan/day14/output.txt";

		try {
			new FileController().reverseLine(inputFileName, outputFileName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("===========END================");
	}

	void reverseLine(String inputFileName, String outputFileName) throws Exception {
		FileReader fr = new FileReader(inputFileName);
		BufferedReader br = new BufferedReader(fr);

		List<String> dataList = new ArrayList<>();
		String line;

		while ((line = br.readLine()) != null) {
			dataList.add(line);
		}
		br.close();
		fr.close();

		System.out.println(dataList);
		FileWriter fw = new FileWriter(inputFileName);
		BufferedWriter bw = new BufferedWriter(fw);

		for (int i = dataList.size() - 1; i >= 0; i--) {
			bw.write(dataList.get(i));
			bw.newLine();// 다음줄

		}

		bw.close();
		fw.close();

	}

}
