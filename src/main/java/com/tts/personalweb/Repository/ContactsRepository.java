package com.tts.personalweb.Repository;

import org.springframework.data.repository.CrudRepository;

import com.tts.personalweb.Models.Contacts;

public interface ContactsRepository extends CrudRepository <Contacts, Long> {

}
