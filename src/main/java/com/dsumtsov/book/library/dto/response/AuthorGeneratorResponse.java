package com.dsumtsov.book.library.dto.response;

import com.dsumtsov.book.library.dto.InfoDTO;
import com.dsumtsov.book.library.dto.RandomAuthorDTO;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class AuthorGeneratorResponse implements Serializable {
    private List<RandomAuthorDTO> results;
    private InfoDTO info;
    private String error;
}
