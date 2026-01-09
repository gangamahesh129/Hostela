package com.example.hostela.controller;

import com.example.hostela.model.HostelDto;
import com.example.hostela.model.UserDto;
import com.example.hostela.service.HostelaService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import java.util.stream.Collectors;

@RestController("/hostela")
public class HostelaController {

    private HostelaService HostelaService;

public HostelDto saveHostelDetails
        (@RequestBody HostelDto hostelDto) {

    //HostelaService.saveHostelDetails(hostelDto);
   // ff
    return null;

}


}
