package com.codeplay.eazyschool.service;

import org.springframework.stereotype.Service;

import com.codeplay.eazyschool.model.Contact;

import lombok.extern.slf4j.Slf4j;

/*
 * Save Contact Details To DB
 * @param contact
 * @return boolean
 */

@Slf4j
@Service
public class ContactService {

    // private static final Logger log =
    // Logger.getLogger(ContactService.class.getName()); - don't need to create the
    // logger object to ourselves, @Slf4j will create a logger object

    public boolean saveMessageDetails(Contact contact) {
        boolean isSaved = true;
        log.info(contact.toString());
        return isSaved;
    }
}
