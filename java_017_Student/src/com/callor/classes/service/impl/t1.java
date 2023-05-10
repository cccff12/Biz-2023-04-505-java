package com.callor.classes.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.classes.datas.DataIndex;
import com.callor.classes.models.ScoreDto;

public class t1 extends ScoreServiceimplV1 {

	List<ScoreDto> list;

	public t1() {
		list = new ArrayList<>();
	}

	public void load() {
		String str=  "src/com/callor/classes/datas/score.csv";
		Scanner scan= null;
		InputStream is=null;
		
		try {
			is= new FileInputStream(str);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		scan= new Scanner(is);
		while(scan.hasNext()) {
			String line= scan.nextLine(); 
			Scanner[] student= line.split(",");
			ScoreDto scDto= new ScoreDto(
					Integer
					
					
					
					
					
					);
			
			
			
		}
		
		
		
		
	}

	public void print() {

	}

}
