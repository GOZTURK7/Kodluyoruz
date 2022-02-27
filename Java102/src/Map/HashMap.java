package Map;

import java.util.HashMap;
class _HashMap {


    public static void main(String[] args) {

        HashMap<String, String> country = new HashMap<>();

        country.put("TR", "TÜRKİYE");
        country.put("GR", "ALMANYA");
        country.put("EN", "INGILTERE");

//         map'le iterable olmadığı için collections'ların aksine o yüzden foreach ile gezebiliyoruz.

        for(String key: country.keySet()){
            System.out.println(key); // 1. yol
            System.out.println(country.get(key)); //2. yol
        }

        for(String values: country.values()){
            System.out.println(values);

        }

    }
}
