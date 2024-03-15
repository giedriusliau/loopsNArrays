public class Main {
    public static void main(String[] args) {
// 1 uzd
        System.out.println("----- 1 uzd -----");
        String name = "Jonas";
        String surname = "Jonauskas";
        System.out.println(surname.length());
        System.out.println(name.length());
        if (surname.length() > surname.length()) {
            System.out.println(surname);
        } else {
            System.out.println(name);

        }

        // 2 uzd
        System.out.println("----- 2 uzd -----");
        System.out.println(name.toUpperCase());
        System.out.println(surname.toLowerCase());

        // 3 uzd
        System.out.println("----- 3 uzd -----");

        String inic = (name.substring(0, 1) + surname.substring(0, 1));
        System.out.println(name.substring(0, 1));
        System.out.println(surname.substring(0, 1));
        System.out.println(inic);


        // 4 uzd
        System.out.println("----- 4 uzd -----");
  //     String last = (name.);

        // 5 uzd
        System.out.println("----- 5 uzd -----");
        String kint = ("An American in Paris");

        // 6 uzd
        //Sukurti kintamąjį su stringu: “An American in Paris”. Jame ištrinti visas balses.
        // Rezultatą atspausdinti. Kodą pakartoti su stringais:
        // “Breakfast at Tiffany's”, “2001: A Space Odyssey”
        // ir “It's a Wonderful Life”.
        System.out.println("----- 6 uzd -----");


        // 7 uzd
        System.out.println("-----7 uzd ------");

        String episode = "Star Wars: Episode "+ " ".repeat( (int) (Math.random() * 10))+((int) (Math.random() * 7)+1) + " - A New Hope";
        System.out.println(episode);
        System.out.println(episode.charAt(episode.length() - 14));
       // System.out.println(episode.replaceAll( regex: "[a-z ")

    }
}


