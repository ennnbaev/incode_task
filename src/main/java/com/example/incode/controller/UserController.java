package com.example.incode.controller;

import com.example.incode.exception.UserNotFoundException;
import com.example.incode.model.User;
import com.example.incode.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.example.incode.util.MessageSourceUtil.getParametrizedMessageSource;
import static com.example.incode.util.ResponseMessagesHandler.ExceptionMessage.*;

@RestController
@RequiredArgsConstructor
@Tag(name = "User")
@Validated
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @GetMapping
    @Operation(summary = "Get all users")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK"),
            @ApiResponse(responseCode = "400", description = "BAD REQUEST")})
    public List<User> getAllUsers() {
        return userService.findAll();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get user by id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK"),
            @ApiResponse(responseCode = "400", description = "BAD REQUEST"),
            @ApiResponse(responseCode = "404", description = "NOT FOUND")})
    public User getUserById(@PathVariable String id) throws UserNotFoundException {
        return findUserById(id);
    }

    @PostMapping
    @Operation(summary = "Create a new User")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "CREATED"),
            @ApiResponse(responseCode = "400", description = "BAD REQUEST")})
    @ResponseStatus(HttpStatus.CREATED)
    public User createUser(@RequestBody @Valid User user) {
        return userService.save(user);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update User data")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "202", description = "ACCEPTED"),
            @ApiResponse(responseCode = "400", description = "BAD REQUEST"),
            @ApiResponse(responseCode = "404", description = "NOT FOUND")})
    @ResponseStatus(HttpStatus.ACCEPTED)
    public User updateUser(@PathVariable String id, @RequestBody @Valid User user) throws UserNotFoundException {
        findUserById(id);
        return userService.save(user);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete an existed user")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK"),
            @ApiResponse(responseCode = "400", description = "BAD REQUEST")})
    @ResponseStatus(HttpStatus.OK)
    public void deleteUser(@PathVariable String id) {
        userService.deleteById(id);
    }

    private User findUserById(String id) throws UserNotFoundException {
        return userService.findById(id)
                .orElseThrow(() -> new UserNotFoundException(getParametrizedMessageSource(USER_ID_NOT_FOUND, id)));
    }
}