package com.example.domain;

import io.quarkus.mongodb.panache.common.MongoEntity;
import lombok.Data;
import org.bson.types.ObjectId;

import java.util.List;

@Data
// @MongoEntity is optional.
@MongoEntity(database = "sample_analytics", collection = "accounts")
public class Account {

    // used by MongoDB for the _id field
    private ObjectId id;
    private Integer account_id;
    private Integer limit;
    private List<String> products;
}
