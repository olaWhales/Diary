package com.badAfeez.code.Data.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.annotation.Documented;
import java.util.List;


@Setter
@Getter
@Document

public class Diary {
    @Id
    private String id;
    private String username;
    private String password;
    private boolean isLocked;
    private List<Entry> entries;
}
