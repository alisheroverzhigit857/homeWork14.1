public class JavaScript extends Java {
   private  String okuganOkuusu ;
   private  String kylganJumushu;

   public JavaScript(int students,String okuganOkuusu, String kylganJumushu ) {
      super(students);
      this.okuganOkuusu = okuganOkuusu;
      this.kylganJumushu = kylganJumushu;
   }

   public String getOkuganOkuusu() {
      return okuganOkuusu;
   }

   public void setOkuganOkuusu(String okuganOkuusu) {
      this.okuganOkuusu = okuganOkuusu;
   }

   public String getKylganJumushu() {
      return kylganJumushu;
   }

   public void setKylganJumushu(String kylganJumushu) {
      this.kylganJumushu = kylganJumushu;
   }

   public void jasoo () {
      System.out.println("video jasait");
   }
   public void jasait () {
      System.out.println("photo jasait");
   }

   @Override
   public String toString() {
      return "'JavaScript' {" +
              "\nOkugan  Okuusu = '" + okuganOkuusu + '\'' +
              "\n Kylgan  Zhumushu = '" + kylganJumushu + '\'' +
              '}';
   }
}
