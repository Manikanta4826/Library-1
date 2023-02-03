package com.example.vicky.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.vicky.entity.BookingRecord;
@Repository
public interface BookRepository extends MongoRepository<BookingRecord, String> {

    void deleteById(long id);


}
