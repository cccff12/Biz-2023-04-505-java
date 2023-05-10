package com.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.DTO.index;
import com.DTO.scoreDto;

public class serviceA {

	List<scoreDto> list;

	public serviceA() {
		list = new ArrayList<>();

	}

	public void lord() {
		
		String str="src/com/DTO/score.csv";
		Scanner scan= null;
		InputStream is = null;
		
		try {
			is = new FileInputStream(str);//
		} catch (FileNotFoundException e) {
			System.out.println("뭔가 잘못됐다");
			e.printStackTrace();
		}
		scan= new Scanner(is);
		while(scan.hasNext()) {
			String line = scan.nextLine();//
			String[] score= line.split(",");
			scoreDto scDto= new scoreDto(
			scDto.num1=score[index.scores.st_num],
					scDto.num2=score[index.scores.st_num2],
			score[index.scores.st_num3],
			score[index.scores.st_num4],
			score[index.scores.st_num5],
			score[index.scores.st_num6],
			score[index.scores.st_num7]
					);
		list.add(scDto);
		
		}
		
		
		
		
	}

	public void print() {

	}

}
