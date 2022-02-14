/*
    Saya Mohammad Ray Mosaid mengerjakan Latihan 1 dalam mata kuliah DPBO
    untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan.
    Aamiin.
*/

public class classtp1{
    //atribut private
    private String team;
    private String country;
    private String est;
    private String playername;

    //membuat konstruktor sekaligus untuk mengakses variabel private
    public classtp1(String team, String country, String est, String playername){
        this.team = team;
        this.country = country;
        this.est = est;
        this.playername = playername;
    }

    //membuat konstruktor kosong
    public classtp1(){

    }

    //membuat fungsi untuk me-return isi atribut private
    public String getteam(){
        return team;
    }
    public String getcountry(){
        return country;
    }
    public String getest(){
        return est;
    }
    public String getplayer(){
        return playername;
    }
}
