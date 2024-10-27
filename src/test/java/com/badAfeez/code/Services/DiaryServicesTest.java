package com.badAfeez.code.Services;

import com.badAfeez.code.Data.models.Diary;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class DiaryServicesTest {

    @Autowired
    private DiaryServices diaryService;

    void testThatDiaryCanBeCreated(){
        Diary diary = new Diary();
        diary.setUsername("badafeez");
        diary.setPassword("bad123");

        Diary savedDiary = diaryService.createDiary(Diary);
    }

}