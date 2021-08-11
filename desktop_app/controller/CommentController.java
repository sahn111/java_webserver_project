package com.example.demo.controller;

import com.example.demo.entity.Comment;
import com.example.demo.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CommentController {
    @Autowired
    CommentService commentService;

    @PostMapping("/addcomment")
    public Comment saveComment(@RequestBody Comment c)
    {
        return commentService.saveComment(c);
    }

    @GetMapping("/getcomment/{id}")
    public Comment getComment(@PathVariable int id)
    {
        return commentService.getComment(id);
    }

}
