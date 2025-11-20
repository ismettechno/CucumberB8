package ApachePOI;

/*
   Main den bir metod çağırmak suretiyle, henüz oluşturulmamış
   path i verilen excel için, program her çalıştıkça içine "test passed"
   yazısını ekleyen metodu yazınız.
   Yani dosya yoksa oluştur ilk satıra yaz, sonra dosya oluşacağı için
   dosya varsa en son satırın altına yaz.

   File dosya= new File(path); //dosya kontrolü

if (!file.exists()) //dosya yok ise
{
  oluşturup
  merhaba düznya yazsın
}
else
{
   var olan dosyaya eklesin
  }

 */
public class _12_Soru {
    public static void main(String[] args) {
        String path="src/test/java/ApachePOI/resource/TestSonuclari.xlsx";
        String senaryoAdi="Create Country";
        String testSonuc="Test Passed";

        writeToExcel(path, senaryoAdi, testSonuc); //excel create
        writeToExcel(path, senaryoAdi, testSonuc); //dosya artık var ekleyecek
        writeToExcel(path, senaryoAdi, testSonuc); //dosya artık var ekleyecek
        writeToExcel(path, senaryoAdi, testSonuc); //dosya artık var ekleyecek
        writeToExcel(path, senaryoAdi, testSonuc); //dosya artık var ekleyecek

    }
}
