package com.codeplay.eazyschool.service;

import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import com.codeplay.eazyschool.model.Contact;

/*
 * Save Contact Details To DB
 * @param contact
 * @return boolean
 */

@Service
public class ContactService {

    private static final Logger log = Logger.getLogger(ContactService.class.getName());

    public boolean saveMessageDetails(Contact contact) {
        boolean isSaved = true;
        log.info(contact.toString());
        return isSaved;
    }
}
