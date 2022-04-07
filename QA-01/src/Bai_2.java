import java.util.*;
import static java.util.Arrays.asList;
import static java.util.Arrays.spliterator;

public class Bai_2 {
    public static void main(String[] args) {
        HashMap <String, List<String>> product = new HashMap<>();
////        product.put("tenProduct", asList("gia", "variant", "quantity"));
//        //a. Buyer click them product voi so luong 3
//        product.put("YONEX1", asList("YONEX1","$40.00", "Black", 3));
//        System.out.println("Them product voi so luong 3:");
//        System.out.println(product.get("YONEX1"));
//        //b. Buyer giam so luong cua product tren trong gio hang con 2
//        product.replace("YONEX1", asList("YONEX1", "$40", "Back", 2));
//        System.out.println("Giam so luong product xuong con 2:");
//        System.out.println(product.get("YONEX1"));
//        //c. Buyer tiep tuc them moi 1 product khac:
//        product.put("YONEX2", asList("YONEX2","$35.90", "Yellow", 1));
//        System.out.println("Them moi 1 product khac: ");
//        System.out.println(product.get("YONEX2"));
//        //d. Sản pham thu 2 trong gio hang duoc discount 50%
//        product.replace("YONEX2", asList("YONEX2","$"+ 35.90* 0.5, "Yellow",1));
//        System.out.println("San pham thu 2 sau khi duoc Discount:");
//        System.out.println(product.get("YONEX2"));
//        //e. In ra man hinh tat ca cac product trong gio hang
//        System.out.println("Tat ca cac product trong gio hang:");
//        for (String i: product.keySet()){
//            System.out.println(i);
//        }
//        //f. In ra man hinh gia cua san pham thu 2 trong gio hang
//        System.out.println("Gia cua san pham thu 2 trong gio hang: ");
//        System.out.println(product.get("YONEX2").get(1));
        product.put("A", asList("A","B"));
        product.put(null, asList("a", "1%"));
        product.put(null, asList("b", "2%"));
        System.out.println("A"+ product.get(null));

    }
}