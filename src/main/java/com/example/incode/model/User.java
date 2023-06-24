package com.example.incode.model;

import com.example.incode.util.PatternHandler;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import static com.example.incode.util.ResponseMessagesHandler.ValidationMessage.*;


@Data
@AllArgsConstructor
@Document(collection = "users")
public class User {
    @Id
    private String id;
    @Schema(example = "Danil")
    @NotEmpty(message = "{" + EMPTY_USERNAME + "}")
    @Size(min = 2, max = 50, message = "{" + INVALID_USERNAME_SIZE + "}")
    @Pattern(regexp = PatternHandler.USERNAME, message = "{" + INVALID_USERNAME + "}")
    private String name;
    @Schema(example = "username@example.com")
    @NotEmpty(message = "{" + EMPTY_EMAIL + "}")
    @Email(regexp = PatternHandler.EMAIL, message = "{" + INVALID_EMAIL + "}")
    private String email;
}
