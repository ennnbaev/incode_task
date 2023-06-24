package com.example.incode.util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class MessageSourceUtil {
    private static MessageSource mSource;

    @Autowired
    public void setMSource(MessageSource messageSource) {
        mSource = messageSource;
    }

    public static String getParametrizedMessageSource(String message, Object... parameters) {
        return mSource.getMessage(message,
                parameters,
                LocaleContextHolder.getLocale());
    }

}
