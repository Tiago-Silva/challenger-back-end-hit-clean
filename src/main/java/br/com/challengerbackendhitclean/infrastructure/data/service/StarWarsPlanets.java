package br.com.challengerbackendhitclean.infrastructure.data.service;

import java.util.HashMap;
import java.util.Map;

public class StarWarsPlanets {
    public static final Map<Integer, String> ID_TO_NAME;
    public static final Map<String, Integer> NAME_TO_ID;

    static {
        ID_TO_NAME = new HashMap<>();
        NAME_TO_ID = new HashMap<>();

        addPlanet(1, "Tatooine");
        addPlanet(2, "Alderaan");
        addPlanet(3, "Yavin IV");
        addPlanet(4, "Hoth");
        addPlanet(5, "Dagobah");
        addPlanet(6, "Bespin");
        addPlanet(7, "Endor");
        addPlanet(8, "Naboo");
        addPlanet(9, "Coruscant");
        addPlanet(10, "Kamino");
        addPlanet(11, "Geonosis");
        addPlanet(12, "Utapau");
        addPlanet(13, "Mustafar");
        addPlanet(14, "Kashyyyk");
        addPlanet(15, "Polis Massa");
        addPlanet(16, "Mygeeto");
        addPlanet(17, "Felucia");
        addPlanet(18, "Cato Neimoidia");
        addPlanet(19, "Saleucami");
        addPlanet(20, "Stewjon");
        addPlanet(21, "Eriadu");
        addPlanet(22, "Corellia");
        addPlanet(23, "Rodia");
        addPlanet(24, "Nal Hutta");
        addPlanet(25, "Dantooine");
        addPlanet(26, "Bestine IV");
        addPlanet(27, "Ord Mantell");
        addPlanet(28, "unknown");
        addPlanet(29, "Trandosha");
        addPlanet(30, "Socorro");
        addPlanet(31, "Mon Cala");
        addPlanet(32, "Chandrila");
        addPlanet(33, "Sullust");
        addPlanet(34, "Toydaria");
        addPlanet(35, "Malastare");
        addPlanet(36, "Dathomir");
        addPlanet(37, "Ryloth");
        addPlanet(38, "Aleen Minor");
        addPlanet(39, "Vulpter");
        addPlanet(40, "Troiken");
        addPlanet(41, "Tund");
        addPlanet(42, "Haruun Kal");
        addPlanet(43, "Cerea");
        addPlanet(44, "Glee Anselm");
        addPlanet(45, "Iridonia");
        addPlanet(46, "Tholoth");
        addPlanet(47, "Iktotch");
        addPlanet(48, "Quermia");
        addPlanet(49, "Dorin");
        addPlanet(50, "Champala");
        addPlanet(51, "Mirial");
        addPlanet(52, "Serenno");
        addPlanet(53, "Concord Dawn");
        addPlanet(54, "Zolan");
        addPlanet(55, "Ojom");
        addPlanet(56, "Skako");
        addPlanet(57, "Muunilinst");
        addPlanet(58, "Shili");
        addPlanet(59, "Kalee");
        addPlanet(60, "Umbara");
    }

    private static void addPlanet(int id, String name) {
        ID_TO_NAME.put(id, name);
        NAME_TO_ID.put(name, id);
    }

    public static Integer getIdByName(String name) {
        return NAME_TO_ID.get(name);
    }

    public static String getNameById(int id) {
        return ID_TO_NAME.get(id);
    }
}
