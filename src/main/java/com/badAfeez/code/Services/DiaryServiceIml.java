package com.badAfeez.code.Services;

import com.badAfeez.code.Data.models.Diary;
import com.badAfeez.code.Data.repositories.DiaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiaryServiceIml implements DiaryServices {

    @Autowired
    private DiaryRepository dairyRepository;



    @Override
    public Diary createDiary(Diary diary) {
        return dairyRepository.save(diary);
    }
}
