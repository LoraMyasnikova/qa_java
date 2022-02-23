package com.example;

public interface BabyKitten {
    int getKittens();

    default int getKittens(int kittensCount){
        return kittensCount;
    }
}
