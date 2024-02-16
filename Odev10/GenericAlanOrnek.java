public class GenericAlanOrnek {

    public static void main(String[] args) {

        TestGeneric<Integer> integerTestGeneric = new TestGeneric<Integer>(45);
        System.out.println("Integer Ornek Sonucu : "+integerTestGeneric.getObject());

        TestGeneric<String> sObj = new TestGeneric<>("Test Otomasyon Kursuna Hosgeldiniz");
        System.out.println("String Ornek Sonucu : "+sObj.getObject());

    }
    static class TestGeneric <T> {
        T obj; //T tipinde bir nesne bildirildi

        // Constructor olusturuldu
        public TestGeneric(T obj) {
            this.obj = obj;
        }

        public T getObject() {
            return this.obj;
        }
    }
}
