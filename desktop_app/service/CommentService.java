package com.example.demo.service;

import com.example.demo.entity.Comment;
import com.example.demo.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
    @Autowired
    CommentRepository commentRepository;

    public Comment saveComment(Comment c){
        return commentRepository.save(c);
    }

    public Comment getComment(long id){
        return commentRepository.findById((int)id).orElse(null);
    }
}
