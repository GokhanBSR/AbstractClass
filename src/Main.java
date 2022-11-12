public class Main {
    public static void main(String[] args) {
        Hayvan hayvan = new Hayvan();
        Hayvan kedi = new Kedi();
        Hayvan kppek = new Hayvan();

        hayvan.konustur();
        if (kedi instanceof Hayvan){
            System.out.println("Kedi Nesnesi Hayvan Sınıfından Türetilmiştir");
        }
        if (kedi instanceof Kopek){
            System.out.println("Kedi Nesnesi Köpek Sınıfından Türetilmiştir");
        }
        if (kedi instanceof Kedi){
            System.out.println("Kedi Nesnesi Kedi Sınıfından Türetilmiştir");
        }



    }
}
