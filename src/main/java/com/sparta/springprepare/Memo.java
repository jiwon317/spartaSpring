package com.sparta.springprepare;

import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
public class Memo {
    private final String username;
    private final String contents;
}

class Main {
    public static void main(String[] args) {
        Memo memo = new Memo("로버트", "내용");

        System.out.println(memo.getUsername());
    }
}