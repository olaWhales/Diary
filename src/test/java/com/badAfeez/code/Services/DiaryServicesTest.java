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

    @Test
    void testThatDiaryCanBeCreated() {
        // Given: using the constructor to create a new Diary
        Diary diary = new Diary();
        diary.setUsername("badafeez");
        diary.setPassword("bad123");

        // When: saving the diary
        Diary savedDiary = diaryService.createDiary(diary);

        // Then: assertions to verify the diary was saved correctly
        assertNotNull(savedDiary.getId());
        assertEquals("badafeez", savedDiary.getUsername());
        assertEquals("bad123", savedDiary.getPassword());
    }
}
