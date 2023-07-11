package org.zerock.j2.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "images")
public class FileBoard {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bno;

    private String title;

    private String content;

    private String writer;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name = "board")
    @Builder.Default
    private List<FileBoardImage> images = new ArrayList<>();
    // @OneToMany를 쓴다는 얘기는 파일보드가 이미지들을 관리한다는거.
    // CRUD도 파일보드가 관리.
    // ArrayList<>() 를 만들자.
    // 자동으로 하위객체까지 저장을 한다.

    public void addImage(FileBoardImage boardImage) {
        // 무생물 주어가 없기에 사람처럼 생각.
        // 순번을 딸 필요가 없고.
        boardImage.changeOrd((images.size()));
        images.add(boardImage);
        // 여기까지가 추가.
    }
    
}
