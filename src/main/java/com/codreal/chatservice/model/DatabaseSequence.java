package com.codreal.chatservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "chats_database_sequences")
public class DatabaseSequence {

    @Id
    private String id;
    private int sequence;

    public DatabaseSequence() {
    }

    public DatabaseSequence(String id, int sequence) {
        this.id = id;
        this.sequence = sequence;
    }

    public String getId() {
        return id;
    }
    public int getSequence() {
        return sequence;
    }


    // -------------------------------- make no setters immutable class
    public void setId(String id) {
        this.id = id;
    }
    public void setSequence(int sequence) {
        this.sequence = sequence;
    }




}
