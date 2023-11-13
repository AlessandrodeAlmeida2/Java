package exercicio_univesp;
public class Downloads {
    private String country;
    private double downloads;

    public Downloads(String country, double downloads) {
        this.country = country;
        this.downloads = downloads;
    }

    public double downloadsInYears(int years, double growthRate) {
        return this.downloads * Math.pow((1 + growthRate), years);
    }

    public static void main(String[] args) {
        Downloads brasil = new Downloads("Brasil", 28000000);
        Downloads russia = new Downloads("Rússia", 27000000);

        // 1. Se os downloads ilegais continuarem no mesmo ritmo, sem alterações, quanto cada país terá baixado ao final de sete anos?[^3^][3]
        System.out.println("Downloads por ano no Brasil: " + brasil.downloadsInYears(7, 0));
        System.out.println("Downloads por ano na Russia: " + russia.downloadsInYears(7, 0));

        // 2. Se os downloads tiverem um crescimento de 0,2% ao ano, quanto cada país terá baixado ao final de quatro anos?[^1^][1][^2^][2]
        System.out.println("Downloads por ano no Brasil com cerscimento de 0,2% ao final de 4 anos: " + brasil.downloadsInYears(4, 0.002));
        System.out.println("Downloads por ano na Russia com cerscimento de 0,2% ao final de 4 anos: " + russia.downloadsInYears(4, 0.002));

        // 3. Se os downloads tiverem um crescimento de 4% ao ano, quanto cada país terá baixado ao final de dois anos?[^1^][1][^2^][2]
        System.out.println("Downloads por ano no Brasil com cerscimento de 4% ao final de 2 anos: " + brasil.downloadsInYears(2, 0.04));
        System.out.println("Downloads por ano na Russia com cerscimento de 4% ao final de 2 anos: " + russia.downloadsInYears(2, 0.04));
    }
}