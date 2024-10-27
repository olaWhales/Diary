package com.badAfeez.code.Data.repositories;

import com.badAfeez.code.Data.models.Diary;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DiaryRepository extends MongoRepository<Diary, String> {
}
