package com.badAfeez.code.Data.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@Document
public class Diary {
    @Id
    private String id;
    private String username;
    private String password;
    private boolean isLocked;
    private List<Entry> entries;


}
