package com.badAfeez.code.Data.repositories;

import com.badAfeez.code.Data.models.Entry;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EntryRepository extends MongoRepository<Entry, String> {
}
