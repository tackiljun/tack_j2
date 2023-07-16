package org.zerock.j2.repository.search;

import org.zerock.j2.dto.FileBoardListDTO;
import org.zerock.j2.dto.PageRequestDTO;
import org.zerock.j2.dto.PageResponseDTO;


public interface FileBoardSearch {

    // 리스트 검색조건.
    PageResponseDTO<FileBoardListDTO> list(PageRequestDTO pageRequestDTO);
    // limit 한번 확인해주기.
}