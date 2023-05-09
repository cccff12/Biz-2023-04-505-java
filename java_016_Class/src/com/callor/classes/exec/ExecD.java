package com.callor.classes.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.classes.models.ScoreDto;
import com.callor.classes.service.ScoreServiceV2;

public class ExecD {
public static void main(String[] args) {
	ScoreServiceV2 v2= new ScoreServiceV2();
	v2.makeScore();
	// 비어있는 데이터를 만들어서 전달 해주느 것
	List<ScoreDto> scList= new ArrayList<>();
	
	
}
}
