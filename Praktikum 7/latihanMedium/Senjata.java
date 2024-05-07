public class Senjata {
    private String bunyi;
    private int Peluru;
    private boolean menusuk;

    public Senjata(String bunyi){
        this.bunyi = bunyi;
    }
    public String getBunyi(){
        return bunyi;
    }
    public int getPeluru(){
        return Peluru;
    }
    public boolean isMenusuk(){
        return menusuk;
    }
    public void setBunyi(String bunyi){
        this.bunyi = bunyi;
    }
    public void setPeluru(int Peluru){
        this.Peluru = Peluru;
    }
    public void setMenusuk(boolean menusuk){
        this.menusuk = true;
    }
}
