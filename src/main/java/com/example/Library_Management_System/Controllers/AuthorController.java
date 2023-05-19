package com.example.Library_Management_System.Controllers;

import com.example.Library_Management_System.DTO.AuthorEntryDTO;
import com.example.Library_Management_System.DTO.AuthorResponseDTO;
import com.example.Library_Management_System.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("author")
public class AuthorController {

    @Autowired
    AuthorService authorService;

    @PostMapping("/add")
    public String addAuthor(@RequestBody AuthorEntryDTO authorEntryDTO){
        return authorService.addAuthor(authorEntryDTO);
    }

    @GetMapping("/get-author")
    public AuthorResponseDTO getAuthor(@RequestParam("authorId") Integer authorID){
        return authorService.getAuthor(authorID);
    }
}