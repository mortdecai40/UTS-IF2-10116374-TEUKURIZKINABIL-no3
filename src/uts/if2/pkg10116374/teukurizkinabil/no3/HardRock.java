/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if2.pkg10116374.teukurizkinabil.no3;

/**
 *
 * @author Acromyrmex
 */
public class HardRock extends Rnb implements PopRock,ProgressiveRock,PsycehedelicRock{

    public void genreHardRock(String artistName) {
        System.out.println(artistName+" adalah musisi HardRock");
    }

    @Override
    public void genrePsychedelicRock(String artistName) {
        System.out.println(artistName+" adalah musisi PsychedelicRock");
    }

    @Override
    public void genrePopRock(String artistName) {
        System.out.println(artistName+" adalah musisi PopRock");
    }

    @Override
    public void genreProgressiveRock(String artistName) {
        System.out.println(artistName+" adalah musisi ProgressiveRock");
    }
}