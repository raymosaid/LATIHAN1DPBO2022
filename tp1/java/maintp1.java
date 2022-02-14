/*
    Saya Mohammad Ray Mosaid mengerjakan Latihan 1 dalam mata kuliah DPBO
    untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan.
    Aamiin.
*/

import java.util.*;

public class maintp1 {
    public static void main(String[] args){
        //membuat variabel untuk menampung masukan user
        String team;
        String country;
        String est;
        String playername;

        //meminta masukan user untuk mengisi class team 1
        Scanner sc = new Scanner(System.in);
        team = sc.nextLine();
        country = sc.nextLine();
        est = sc.nextLine();
        playername = sc.nextLine();

        //mengisi class team1
        classtp1 team1 = new classtp1(team, country, est, playername);

        //menampilkan class team1
        System.out.println("Team Name: " + team1.getteam());
        System.out.println("Country: " + team1.getcountry());
        System.out.println("Established: " + team1.getest());
        System.out.println("Player: " + team1.getplayer());
    }
}
