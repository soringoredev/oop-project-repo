package pack2;

public class Doi {
    /*
    Primul experiment: Creăm clasa Doi și chemăm acolo obiect1
și-I atribuim valoarea atributului c cu valoarea 700 din clasa Doi.

Al doilea: Suprascriem valoarea atributului. Adică de la început
setăm valoarea 100, iar când îl atribuim obiectului o schimbăm pe
500 și o chemăm cu sout.

3: încercați să faceți același lucru utilizând cuvântul-cheie final
învățat la primele lecții la variabile.

4: int number va fi egal cu 800. Creăm 3 obiecte. La două dintre
ele setăm valorile 300 și 400. La apelare, apelăm atributele prin
sau cu ajutorul obiectelor. Ce ați observat?

     */
//    final int c = 100;
//
//    public static void main(String[] args) {
//        Doi obiect1 = new Doi();
//        System.out.println(obiect1.c);
//      //  obiect1.c = 500;
//        System.out.println("c: " + obiect1.c);
//    }

    int number = 800;

    public static void main(String[] args) {
        Doi obj1 = new Doi();
        Doi obj2 = new Doi();
        Doi obj3 = new Doi();

        obj1.number = 300;
        obj2.number = 400;

        System.out.println(obj1.number);
        System.out.println(obj2.number);
        System.out.println(obj3.number);


    }

}
