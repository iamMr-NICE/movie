package fr.utbm.controller;

import java.util.Scanner;

public class DefaultMovieController {
    public void registerMovieFromConcoleInput() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Quel est le titre du film ?");
        String titre=sc.nextLine();
    }
}
