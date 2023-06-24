package com.example.incode.util;

import lombok.experimental.UtilityClass;

@UtilityClass
public class ResponseMessagesHandler {
    @UtilityClass
    public class ValidationMessage {
        public final String EMPTY_USERNAME = "empty.username";
        public final String INVALID_USERNAME_SIZE = "invalid.username.size";
        public final String INVALID_USERNAME = "invalid.username";
        public final String EMPTY_EMAIL = "empty.email";
        public final String INVALID_EMAIL = "invalid.email";
    }

    @UtilityClass
    public class ExceptionMessage {
        public final String USER_ID_NOT_FOUND = "exception.user.id.not.found";
    }
}
