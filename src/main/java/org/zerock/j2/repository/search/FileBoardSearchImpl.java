package org.zerock.j2.repository.search;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.zerock.j2.entity.FileBoard;

public class FileBoardSearchImpl extends QuerydslRepositorySupport implements FileBoardSearch{

    public FileBoardSearchImpl() {
        super(FileBoard.class);
    }
    
}